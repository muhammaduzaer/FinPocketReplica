package com.muhammaduzaer.finpocketreplica

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.miletap.tapchat.gone
import com.miletap.tapchat.visible
import com.muhammaduzaer.finpocketreplica.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var bindingMain: ActivityMainBinding
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingMain = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingMain.root)

        navController = findNavController(R.id.fragmentContainerView)
        bindingMain.bottomNavigationView.setupWithNavController(navController)
        bindingMain.navigationView.setupWithNavController(navController)

        setToggleButton()
        bindingMain.imageButtonOpenSideNav.setOnClickListener(this)
        bindingMain.imageButtonAccount.setOnClickListener(this)
        bindingMain.imageButtonSearch.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            bindingMain.imageButtonOpenSideNav.id -> {
                bindingMain.drawerLayoutSideNavMenu.openDrawer(bindingMain.navigationView)
            }

            bindingMain.imageButtonAccount.id -> {
                navController.navigate(R.id.profileFragment)
            }

            bindingMain.imageButtonSearch.id -> {
                navController.navigate(R.id.searchFragment)
            }
        }
    }

    fun hideBottomNav() {
        bindingMain.bottomNavigationView.gone()
    }

    fun showBars() {
        bindingMain.constraintLayoutTopAppBar.visible()
        bindingMain.bottomNavigationView.visible()
    }

    fun removeAllBars() {
        bindingMain.bottomNavigationView.gone()
        bindingMain.constraintLayoutTopAppBar.gone()
    }

    private fun setToggleButton() {

        materialToggleGroup.addOnButtonCheckedListener { _, checkedId, _ ->
            when (checkedId) {
                R.id.buttonReal -> {
                    bindingMain.buttonReal.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
                    bindingMain.buttonReal.setTextColor(ContextCompat.getColor(this, R.color.app_green))
                    bindingMain.buttonDemo.setBackgroundColor(ContextCompat.getColor(this, R.color.app_green))
                    bindingMain.buttonDemo.setTextColor(ContextCompat.getColor(this, R.color.white))
                    bindingMain.constraintLayoutTopAppBar.setBackgroundColor(ContextCompat.getColor(this, R.color.red))
                }

                R.id.buttonDemo -> {

                    bindingMain.buttonDemo.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
                    bindingMain.buttonDemo.setTextColor(ContextCompat.getColor(this, R.color.app_green))
                    bindingMain.buttonReal.setBackgroundColor(ContextCompat.getColor(this, R.color.app_green))
                    bindingMain.buttonReal.setTextColor(ContextCompat.getColor(this, R.color.white))
                }
            }
        }
    }
}