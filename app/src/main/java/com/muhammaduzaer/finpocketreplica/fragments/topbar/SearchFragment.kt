package com.muhammaduzaer.finpocketreplica.fragments.topbar

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.muhammaduzaer.finpocketreplica.databinding.FragmentSearchBinding
import com.muhammaduzaer.finpocketreplica.fragments.base.HideBarsBaseFragment


class SearchFragment : HideBarsBaseFragment(), View.OnClickListener {

    private lateinit var binding: FragmentSearchBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment

        binding = FragmentSearchBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.imageButtonBack.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id) {
            binding.imageButtonBack.id -> {
                navController.navigateUp()
            }
        }
    }

}