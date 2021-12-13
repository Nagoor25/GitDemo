package com.example.gitdemo

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment(R.layout.fragment_home) {
    lateinit var navController:NavController
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        login_btn.setOnClickListener {
        //    findNavController().navigate(HomeFra)
           findNavController().navigate(R.id.action_homeFragment_to_loginFragment)
            Log.v("Git coomit ","LOG")
            Toast.makeText(activity,"Login Clicked",Toast.LENGTH_LONG).show()

        }
    }


    }
