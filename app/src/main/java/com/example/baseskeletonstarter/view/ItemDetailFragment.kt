package com.example.baseskeletonstarter.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.baseskeletonstarter.R
import com.example.baseskeletonstarter.databinding.FragmentItemDetailBinding
import com.example.baseskeletonstarter.viewModel.MainViewModel

class ItemDetailFragment : Fragment() {
   lateinit var vb: FragmentItemDetailBinding
    private val viewModel: MainViewModel by activityViewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        vb = FragmentItemDetailBinding.inflate(layoutInflater)
        return vb.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.selectedItem.observe(viewLifecycleOwner) {
            vb.tvItem.text = it.name
        }
    }
}