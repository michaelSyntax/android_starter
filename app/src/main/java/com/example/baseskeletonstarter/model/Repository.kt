package com.example.baseskeletonstarter.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.baseskeletonstarter.model.data.Item
import com.example.baseskeletonstarter.model.remote.MockApi

class Repository(private val mockApi: MockApi) {

    suspend fun getItems(): List<Item> {
        return mockApi.serivce.getItems()
    }
}