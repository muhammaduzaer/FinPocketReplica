package com.muhammaduzaer.finpocketreplica.fragments.sidemenu.brokerage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.muhammaduzaer.finpocketreplica.R
import com.muhammaduzaer.finpocketreplica.databinding.FragmentBrokerageBinding
import com.muhammaduzaer.finpocketreplica.fragments.sidemenu.brokerage.adapter.TabLayoutAdapter
import com.muhammaduzaer.finpocketreplica.fragments.sidemenu.brokerage.tabs.BrokerageCalculatorFragment
import com.muhammaduzaer.finpocketreplica.fragments.sidemenu.brokerage.tabs.CommissionStructureFragment


class BrokerageFragment : Fragment() {

    private lateinit var brokerageBinding: FragmentBrokerageBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_brokerage, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        brokerageBinding = FragmentBrokerageBinding.bind(view)

        setUpTabLayout()

    }

    private fun setUpTabLayout() {

        val adapter = TabLayoutAdapter(childFragmentManager)
        adapter.addFragment(CommissionStructureFragment(), "COMMISSION STRUCTURE")
        adapter.addFragment(BrokerageCalculatorFragment(), "COMMISSION STRUCTURE")

        brokerageBinding.viewPagerTabLayouts.adapter = adapter
        brokerageBinding.tabLayout.setupWithViewPager(brokerageBinding.viewPagerTabLayouts)
    }
}