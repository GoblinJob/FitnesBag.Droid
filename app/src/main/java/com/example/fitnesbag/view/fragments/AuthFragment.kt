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
import com.example.fitnesbag.R
import com.example.fitnesbag.core.AuthViewModel
import com.google.android.material.button.MaterialButton

class AuthFragment : Fragment() {
    lateinit var viewModel : AuthViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_auth, container, false)
        val openRegistrationFragment = view?.findViewById<MaterialButton>(R.id.registrationbutton)
        openRegistrationFragment?.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.registrationFragment))
        viewModel = ViewModelProvider(this).get(AuthViewModel::class.java)
        initBindings()
        return view
    }
    private fun initBindings() {
        val editTextEmail = view?.findViewById<EditText>(R.id.editTextEmail)
        val editTextPassword = view?.findViewById<EditText>(R.id.editTextPassword)
        viewModel.email.observe(viewLifecycleOwner, Observer {
            if (it.isNullOrEmpty()) {
                editTextEmail?.setText(it)
            }
        })
        viewModel.password.observe(viewLifecycleOwner, Observer {
            if (it.isNullOrEmpty()) {
                editTextPassword?.setText(it)
            }
        })
        editTextEmail?.addTextChangedListener {
            viewModel.updateEmail(it.toString())
        }
        editTextPassword?.addTextChangedListener {
            viewModel.updatePassword(it.toString())
        }
    }
}