package com.example.baseskeletonstarter.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.baseskeletonstarter.databinding.ItemListBinding
import com.example.baseskeletonstarter.model.data.Item
import com.example.baseskeletonstarter.viewModel.MainViewModel

class AdapterItemList(
    private val itemList: List<Item>,
    private val viewModel: MainViewModel
): RecyclerView.Adapter<AdapterItemList.ViewItemHolder>() {

    inner class ViewItemHolder(val binding: ItemListBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewItemHolder {
        val vb = ItemListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewItemHolder(vb)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: ViewItemHolder, position: Int) {
        val itemList = itemList[position]

        holder.binding.tvItemName.text = itemList.name
    }
}