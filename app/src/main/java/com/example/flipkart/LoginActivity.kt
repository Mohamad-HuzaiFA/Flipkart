package com.example.flipkart;
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        supportActionBar?.hide() //To hide the toolbar at the top

        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_screen)

        val loginButton: Button = findViewById(R.id.btnContinue)
        loginButton.setOnClickListener {
            // Call navigateToHome when login button is clicked
            navigateToHome()
        }

        // Skip icon
        findViewById<ImageView>(R.id.skipIcon).setOnClickListener {
            navigateToSignup()
        }

        // Signup prompt
        findViewById<TextView>(R.id.toSignupScreen).setOnClickListener {
            navigateToSignup()
        }
    }

    private fun navigateToSignup() {
        // Navigate to Signup screen
        val intent = Intent(this, SignupActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToHome() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish() // Prevents going back to LoginActivity
    }
}
