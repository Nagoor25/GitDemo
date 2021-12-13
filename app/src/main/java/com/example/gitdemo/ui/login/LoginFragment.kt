package com.example.gitdemo.ui.login


import androidx.fragment.app.Fragment
import android.os.Bundle

import android.view.View
import android.widget.Toast


import com.example.gitdemo.R
import kotlinx.android.synthetic.main.fragment_login.*

class LoginFragment : Fragment(R.layout.fragment_login) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        login.setOnClickListener {
            if (username.text.toString().isEmpty()) {
                username.error = "Please Enter Username"
                username.requestFocus()
                return@setOnClickListener
            }else
            Toast.makeText(activity,"Username entered",Toast.LENGTH_LONG).show()

        }
    }
}
