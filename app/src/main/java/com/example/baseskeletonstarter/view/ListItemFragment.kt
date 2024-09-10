package com.example.baseskeletonstarter.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.baseskeletonstarter.R
import com.example.baseskeletonstarter.databinding.FragmentListItemBinding

class ListItemFragment : Fragment() {
    private lateinit var vb: FragmentListItemBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        vb = FragmentListItemBinding.inflate(inflater, container, false)
        return vb.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        vb.rvListItems.adapter =
    }
}