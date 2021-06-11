package com.example.fitnesbag.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.core.widget.addTextChangedListener
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import com.example.fitnesbag.R
import com.example.fitnesbag.core.AuthViewModel
import com.google.android.material.button.MaterialButton

class AuthFragment : Fragment() {
    lateinit var viewModel : AuthViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_auth, container, false)

        val openRegistrationFragment = view?.findViewById<MaterialButton>(R.id.registrationbutton)
        openRegistrationFragment?.setOnClickListener{
            NavHostFragment.findNavController(this).navigate(R.id.action_authFragment_to_registrationFragment)
        }
        viewModel = ViewModelProvider(this).get(AuthViewModel::class.java)

        return view
    }
}