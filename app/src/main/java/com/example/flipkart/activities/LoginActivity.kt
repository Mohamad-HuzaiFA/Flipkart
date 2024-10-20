package com.example.flipkart.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.flipkart.R

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_screen)  // Use your actual layout file name if it's different

        // Initialize the views
        val skipButton = findViewById<ImageView>(R.id.skipIcon)
        val signupTextView = findViewById<TextView>(R.id.tvSignup)
        val loginButton = findViewById<Button>(R.id.btnContinue)
        val phoneNumberEditText = findViewById<EditText>(R.id.etPhoneNumber)
        val emailEditText = findViewById<EditText>(R.id.etEmail)

        // Skip button functionality
        skipButton.setOnClickListener {
            // Navigate to home screen or skip the login
            Toast.makeText(this, "Skipped login", Toast.LENGTH_SHORT).show()
            // Intent to go to the home activity (replace HomeActivity with your actual class)
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        // Signup text functionality
        signupTextView.setOnClickListener {
            // Navigate to signup page
            val intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)
        }

        // Login button functionality
        loginButton.setOnClickListener {
            val phoneNumber = phoneNumberEditText.text.toString().trim()
            val email = emailEditText.text.toString().trim()

            if (phoneNumber.isEmpty() || email.isEmpty()) {
                Toast.makeText(this, "Please enter phone number and email", Toast.LENGTH_SHORT).show()
            } else {
                // Proceed with login or validation logic
                Toast.makeText(this, "Logging in...", Toast.LENGTH_SHORT).show()

                // Navigate to the home activity after login (replace HomeActivity with your actual class)
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
            }
        }
    }
}
