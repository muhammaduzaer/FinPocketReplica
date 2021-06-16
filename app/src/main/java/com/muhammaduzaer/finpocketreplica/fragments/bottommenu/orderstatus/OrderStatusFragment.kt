package com.muhammaduzaer.finpocketreplica.fragments.bottommenu.orderstatus

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.muhammaduzaer.finpocketreplica.R
import com.muhammaduzaer.finpocketreplica.fragments.base.BottomBaseFragment

class OrderStatusFragment : BottomBaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_order_status, container, false)
    }

}