package com.muhammaduzaer.finpocketreplica.fragments.bottommenu.feed

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.muhammaduzaer.finpocketreplica.databinding.FragmentFeedBinding
import com.muhammaduzaer.finpocketreplica.fragments.base.BottomBaseFragment


class FeedFragment : BottomBaseFragment(), View.OnClickListener {

    private lateinit var binding: FragmentFeedBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentFeedBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    override fun onClick(v: View?) {
        when(v?.id) {

        }
    }

}