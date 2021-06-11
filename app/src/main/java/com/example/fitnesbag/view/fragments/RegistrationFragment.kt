package com.example.fitnesbag.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import com.example.fitnesbag.R
import com.google.android.material.button.MaterialButton
import javax.security.auth.callback.Callback

class RegistrationFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_registration, container, false)

        val openRegistrationFragment = view?.findViewById<MaterialButton>(R.id.add_reg)
        openRegistrationFragment?.setOnClickListener{
            NavHostFragment.findNavController(this).navigate(R.id.action_registrationFragment_to_mainMenuFragment)
        }

        return view
    }
}