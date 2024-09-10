package com.example.baseskeletonstarter.view.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.baseskeletonstarter.databinding.ItemListBinding
import com.example.baseskeletonstarter.model.data.Item
import com.example.baseskeletonstarter.viewModel.MainViewModel

class AdapterItemList(
    private val itemList: List<Item>,
    private val viewModel: MainViewModel
): RecyclerView.Adapter<AdapterItemList.ViewItemHolder>() {
    inner class ViewItemHolder(private val binding: ItemListBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewItemHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ViewItemHolder, position: Int) {
        TODO("Not yet implemented")
    }
}