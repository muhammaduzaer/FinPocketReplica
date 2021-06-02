package com.muhammaduzaer.finpocketreplica.fragments.sidemenu.brokerage.tabs

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.muhammaduzaer.finpocketreplica.R
import com.muhammaduzaer.finpocketreplica.databinding.FragmentBrokerageCalculatorBinding

class BrokerageCalculatorFragment : Fragment() {

    lateinit var bindingBrokerageCalculator: FragmentBrokerageCalculatorBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_brokerage_calculator, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bindingBrokerageCalculator = FragmentBrokerageCalculatorBinding.bind(view)


        bindingBrokerageCalculator.radioGroupOrderType.setOnCheckedChangeListener { group, checkedId ->
            if (checkedId == R.id.radioButtonBuy) {
                Toast.makeText(requireContext(), "BUY BUY", Toast.LENGTH_SHORT).show()
                bindingBrokerageCalculator.textViewAmountToPayText.text = "Amount to be paid"
            }

            if (checkedId == R.id.radioButtonSell) {
                Toast.makeText(requireContext(), "SELL SELL", Toast.LENGTH_SHORT).show()
                bindingBrokerageCalculator.textViewAmountToPayText.text = "Amount you will get"
            }

        }

    }
}