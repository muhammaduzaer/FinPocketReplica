package com.muhammaduzaer.finpocketreplica.fragments.base

import com.muhammaduzaer.finpocketreplica.MainActivity

abstract class BottomBaseFragment : BaseFragment() {
    override fun onResume() {
        super.onResume()
        activity?.let {
            if (it is MainActivity) {
                it.showBars()
            }
        }
    }
}