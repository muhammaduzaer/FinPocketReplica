package com.muhammaduzaer.finpocketreplica.fragments.sidemenu.aboutus

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.muhammaduzaer.finpocketreplica.R
import com.muhammaduzaer.finpocketreplica.fragments.base.NonBottomBaseFragment

class AboutUsFragment : NonBottomBaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_about_us, container, false)
    }

}