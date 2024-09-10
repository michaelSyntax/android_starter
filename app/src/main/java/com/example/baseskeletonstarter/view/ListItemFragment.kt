package com.example.baseskeletonstarter.view

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.baseskeletonstarter.databinding.FragmentListItemBinding
import com.example.baseskeletonstarter.view.adapter.AdapterItemList
import com.example.baseskeletonstarter.viewModel.MainViewModel

class ListItemFragment : Fragment() {
    private lateinit var vb: FragmentListItemBinding
    private val viewModel: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        vb = FragmentListItemBinding.inflate(inflater, container, false)
        viewModel.getItems()
        return vb.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Log.d("ListItemFragment", "onViewCreated")
        viewModel.items.observe(viewLifecycleOwner) { updatedItems ->
            Log.d("ListItemFragment", "onViewCreated updatedItems: $updatedItems")
            vb.rvListItems.adapter = AdapterItemList(updatedItems, viewModel)
        }
    }
}