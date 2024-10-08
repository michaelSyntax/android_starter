package com.example.baseskeletonstarter.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.baseskeletonstarter.model.Repository
import com.example.baseskeletonstarter.model.data.Item
import com.example.baseskeletonstarter.model.remote.MockApi
import kotlinx.coroutines.launch

class MainViewModel: ViewModel() {
    private val repository = Repository(MockApi)

    private val _items = MutableLiveData<List<Item>>()
    val items: LiveData<List<Item>>
        get() = _items

    private val _selectedItem = MutableLiveData<Item>()
    val selectedItem: LiveData<Item>
        get() = _selectedItem

    fun getItems() {
        viewModelScope.launch {
            _items.value = repository.getItems()
        }
    }

    fun setSelectectdItem(item: Item) {
        _selectedItem.value = item
    }
}