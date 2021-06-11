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
import com.example.fitnesbag.utils.ActionCallback
import com.google.android.material.button.MaterialButton

class AuthFragment : Fragment() {
    lateinit var viewModel : AuthViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_auth, container, false)
        viewModel = ViewModelProvider(this).get(AuthViewModel::class.java)
        
        setupSignInButton(view)
        setupRegistrationButton(view)
        
        return view
    }
    
    private fun setupSignInButton(view: View) {
        viewModel.setOnSignInAction(ActionCallback {
            NavHostFragment.findNavController(this).navigate(R.id.action_authFragment_to_mainMenuFragment)
        })
        
        val button = view.findViewById<MaterialButton>(R.id.signInButton)
        button!!.setOnClickListener{
            viewModel.sigIn()
        }
    }
    private fun setupRegistrationButton(view: View) {
        val button = view.findViewById<MaterialButton>(R.id.registrationButton)
        button!!.setOnClickListener{
            NavHostFragment.findNavController(this).navigate(R.id.action_authFragment_to_registrationFragment)
        }
    }
}
