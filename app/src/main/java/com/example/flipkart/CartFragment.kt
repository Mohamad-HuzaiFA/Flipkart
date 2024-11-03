package com.example.flipkart

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class CartFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_cart, container, false)

        // Find the login button by its ID and set a click listener
        val loginButton = view.findViewById<Button>(R.id.btn_login)

        loginButton.setOnClickListener {
            // Create an intent to start LoginActivity
            val intent = Intent(requireContext(), LoginActivity::class.java)
            startActivity(intent)
        }

        return view
    }
}
