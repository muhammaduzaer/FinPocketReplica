package com.muhammaduzaer.finpocketreplica

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView
import com.muhammaduzaer.finpocketreplica.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.layout_top_bar.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var bindingMain: ActivityMainBinding
    private lateinit var navController: NavController
    private lateinit var bottomNavMenu: BottomNavigationView
    private lateinit var sideNavMenu: NavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingMain = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingMain.root)

        navController = findNavController(R.id.fragmentContainerView)
        bottomNavMenu = bindingMain.bottomNavigationView
        bottomNavMenu.setupWithNavController(navController)

        sideNavMenu = bindingMain.navigationView
        sideNavMenu.setupWithNavController(navController)

        setToggleButton()
        bindingMain.imageButtonOpenSideNav.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            bindingMain.imageButtonOpenSideNav.id -> {
                bindingMain.drawerLayoutSideNavMenu.openDrawer(bindingMain.navigationView)
            }
        }
    }

    private fun setToggleButton() {

        materialToggleGroup.addOnButtonCheckedListener { _, checkedId, _ ->
            when (checkedId) {
                R.id.buttonReal -> {
                    bindingMain.buttonReal.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
                    bindingMain.buttonReal.setTextColor(ContextCompat.getColor(this, R.color.app_green))
                    bindingMain.buttonDemo.setBackgroundColor(ContextCompat.getColor(this, R.color.app_green))
                    bindingMain.buttonDemo.setTextColor(ContextCompat.getColor(this, R.color.white))
                    Toast.makeText(this, "TOGGLED TO REAL", Toast.LENGTH_SHORT).show()
                }

                R.id.buttonDemo -> {
                    bindingMain.buttonDemo.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
                    bindingMain.buttonDemo.setTextColor(ContextCompat.getColor(this, R.color.app_green))
                    bindingMain.buttonReal.setBackgroundColor(ContextCompat.getColor(this, R.color.app_green))
                    bindingMain.buttonReal.setTextColor(ContextCompat.getColor(this, R.color.white))
                    Toast.makeText(this, "TOGGLED TO DEMO", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}