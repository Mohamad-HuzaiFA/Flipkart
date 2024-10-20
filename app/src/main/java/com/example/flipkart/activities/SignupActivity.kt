package com.example.flipkart.activities

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.flipkart.R

class SignupActivity : AppCompatActivity() {
    private lateinit var userName: EditText
    private lateinit var email: EditText
    private lateinit var password: EditText
    private lateinit var signupButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.singup_screen)  // Make sure this matches your XML layout file name

        // Initialize views
        userName = findViewById(R.id.UserNameId)
        email = findViewById(R.id.etEmail)
        password = findViewById(R.id.etPassword)
        signupButton = findViewById(R.id.btnContinue)

        // Initially disable the signup button
        signupButton.isEnabled = false

        // Add TextWatchers to enable button when all fields are filled
        userName.addTextChangedListener(textWatcher)
        email.addTextChangedListener(textWatcher)
        password.addTextChangedListener(textWatcher)

        // Handle signup button click
        signupButton.setOnClickListener {
            val enteredUserName = userName.text.toString().trim()
            val enteredEmail = email.text.toString().trim()
            val enteredPassword = password.text.toString().trim()

            if (enteredUserName.isNotEmpty() && enteredEmail.isNotEmpty() && enteredPassword.isNotEmpty()) {
                // Proceed with signup or save the user data
                Toast.makeText(this, "Sign up successful!", Toast.LENGTH_SHORT).show()

                // Navigate to another activity, e.g., HomeActivity after signup
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Please fill out all fields", Toast.LENGTH_SHORT).show()
            }
        }
    }

    // TextWatcher to check if fields are filled
    private val textWatcher = object : TextWatcher {
        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            val usernameInput = userName.text.toString().trim()
            val emailInput = email.text.toString().trim()
            val passwordInput = password.text.toString().trim()

            signupButton.isEnabled = usernameInput.isNotEmpty() && emailInput.isNotEmpty() && passwordInput.isNotEmpty()
        }

        override fun afterTextChanged(s: Editable?) {}
    }
}
