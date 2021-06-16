package com.muhammaduzaer.finpocketreplica.fragments.topbar

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.muhammaduzaer.finpocketreplica.databinding.FragmentProfileBinding
import com.muhammaduzaer.finpocketreplica.fragments.base.HideBarsBaseFragment


class ProfileFragment : HideBarsBaseFragment() {

    private lateinit var binding: FragmentProfileBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment

        binding = FragmentProfileBinding.inflate(inflater)
        return binding.root
    }

}