package com.example.fitnesbag.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.NavHostFragment
import com.example.fitnesbag.R
import com.example.fitnesbag.core.AuthViewModel
import com.example.fitnesbag.core.RegistrationViewModel
import com.example.fitnesbag.utils.ActionCallback
import com.google.android.material.button.MaterialButton

class RegistrationFragment : Fragment() {
    lateinit var viewModel : RegistrationViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_registration, container, false)
        viewModel = ViewModelProvider(this).get(RegistrationViewModel::class.java)

        setupRegistrationButton(view)
        
        return view
    }
    
    private fun setupRegistrationButton(view: View) {
        viewModel.setOnRegistrationAction(ActionCallback {
            NavHostFragment.findNavController(this).navigate(R.id.action_registrationFragment_to_mainMenuFragment)
        })
        val button = view.findViewById<MaterialButton>(R.id.registrationButton)
        button!!.setOnClickListener{
            viewModel.registration()
        }
    }
}
