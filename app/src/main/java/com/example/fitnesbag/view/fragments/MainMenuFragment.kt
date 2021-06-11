package com.example.fitnesbag.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.example.fitnesbag.R
import com.google.android.material.bottomnavigation.BottomNavigationMenu
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainMenuFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_main_menu, container, false)

        val menu = view.findViewById<BottomNavigationView>(R.id.navigation_menu)
        val navHostFragment = childFragmentManager.findFragmentById(R.id.fragment_menu) as NavHostFragment
        val navController = navHostFragment.navController
        menu.setOnNavigationItemSelectedListener {item ->
            when(item.itemId) {
                R.id.recommend -> {
                    navController?.navigate(R.id.recommendFragment)
                    true
                }
                R.id.home_menu -> {
                    navController?.navigate(R.id.homeFragment2)
                    true
                }
                R.id.add_menu -> {
                    navController?.navigate(R.id.addFragment)
                    true
                }
                R.id.explorer -> {
                    navController?.navigate(R.id.explorerFragment)
                    true
                }
                R.id.extra -> {
                    navController?.navigate(R.id.extraFragment)
                    true
                }
                else -> false
            }
        }

        return view
    }
}