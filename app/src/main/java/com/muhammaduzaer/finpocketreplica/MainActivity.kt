package com.muhammaduzaer.finpocketreplica

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.core.content.ContextCompat
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.muhammaduzaer.finpocketreplica.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.layout_top_bar.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var bindingMain: ActivityMainBinding
    private lateinit var navController: NavController
    private lateinit var bottomNavMenu: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingMain = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingMain.root)

        navController = findNavController(R.id.fragmentContainerView)
        bottomNavMenu = bindingMain.bottomNavigationView
        bottomNavMenu.setupWithNavController(navController)

        setToggleButton()


    }

    override fun onClick(v: View?) {
        when(v?.id) {
            imageButtonSideNav.id -> {

            }
        }
    }

    private fun setToggleButton() {

        materialToggleGroup.addOnButtonCheckedListener { _, checkedId, _ ->
            when(checkedId) {
                R.id.buttonReal -> {
                    buttonReal.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
                    buttonReal.setTextColor(ContextCompat.getColor(this, R.color.app_green))
                    buttonDemo.setBackgroundColor(ContextCompat.getColor(this, R.color.app_green))
                    buttonDemo.setTextColor(ContextCompat.getColor(this, R.color.white))
                    Toast.makeText(this, "TOGGLED TO REAL", Toast.LENGTH_SHORT).show()
                }

                R.id.buttonDemo -> {
                    buttonDemo.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
                    buttonDemo.setTextColor(ContextCompat.getColor(this, R.color.app_green))
                    buttonReal.setBackgroundColor(ContextCompat.getColor(this, R.color.app_green))
                    buttonReal.setTextColor(ContextCompat.getColor(this, R.color.white))
                    Toast.makeText(this, "TOGGLED TO DEMO", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}