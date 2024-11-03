package com.example.flipkart;
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SignupActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        supportActionBar?.hide() //To hide the toolbar at the top

        super.onCreate(savedInstanceState)
        setContentView(R.layout.singup_screen)
        // Setup any additional components if needed

        val loginButton: Button = findViewById(R.id.btnSignUp)
        loginButton.setOnClickListener {
            // Call navigateToHome when login button is clicked
            navigateToLogin()
        }

        // Skip icon
        findViewById<ImageView>(R.id.skipIcon_).setOnClickListener {
            navigateToHome()
        }

    }

    private fun navigateToLogin() {
        // Navigate to Signup screen
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToHome() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish() // Prevents going back to LoginActivity
    }
}
