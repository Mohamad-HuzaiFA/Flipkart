package com.example.flipkart
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import com.google.firebase.auth.FirebaseAuth

class LoginActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {

        supportActionBar?.hide() // To hide the toolbar at the top
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_screen)

        auth = FirebaseAuth.getInstance()


        if(auth.currentUser!=null)
        {
            navigateToHome();
        }

        val loginButton: Button = findViewById(R.id.btnContinue)
        val emailEditText: EditText = findViewById(R.id.logInEmail)
        val passwordEditText: EditText = findViewById(R.id.logInPassword)

        // Login button functionality
        loginButton.setOnClickListener {
            val email = emailEditText.text.toString().trim()
            val password = passwordEditText.text.toString().trim()

            // Input validation
            if (email.isEmpty()) {
                emailEditText.error = "Email is required"
                emailEditText.requestFocus()
                return@setOnClickListener
            }

            if (password.isEmpty()) {
                passwordEditText.error = "Password is required"
                passwordEditText.requestFocus()
                return@setOnClickListener
            }

            if (password.length < 6) {
                passwordEditText.error = "Password must be at least 6 characters"
                passwordEditText.requestFocus()
                return@setOnClickListener
            }

            // Authenticate user
            auth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener { task ->
                    if (task.isSuccessful) {
                        navigateToHome()
                    } else {
                        Toast.makeText(this, "Login failed: ${task.exception?.message}", Toast.LENGTH_LONG).show()
                    }
                }
        }

        // Skip icon functionality
        findViewById<ImageView>(R.id.skipIcon).setOnClickListener {
            navigateToSignup()
        }

        // Signup prompt functionality
        findViewById<TextView>(R.id.toSignupScreen).setOnClickListener {
            navigateToSignup()
        }
    }

    private fun navigateToSignup() {
        val intent = Intent(this, SignupActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToHome() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish() // Prevent going back to LoginActivity
    }
}
//
//package com.example.flipkart;
//import android.content.Intent
//import android.os.Bundle
//import android.widget.Button
//import android.widget.EditText
//import android.widget.ImageView
//import android.widget.TextView
//import android.widget.Toast
//import androidx.appcompat.app.AppCompatActivity
//import com.google.firebase.auth.FirebaseAuth
//
//class LoginActivity : AppCompatActivity() {
//
//    private lateinit var auth: FirebaseAuth
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//
//        supportActionBar?.hide() // To hide the toolbar at the top
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.login_screen)
//
//        auth = FirebaseAuth.getInstance()
//
//        val loginButton: Button = findViewById(R.id.btnContinue)
//        val emailEditText: EditText = findViewById(R.id.logInEmail)
//        val passwordEditText: EditText = findViewById(R.id.logInPassword)
//
//        // Login button functionality
//        loginButton.setOnClickListener {
//            val email = emailEditText.text.toString().trim()
//            val password = passwordEditText.text.toString().trim()
//
//            // Input validation
//            if (email.isEmpty()) {
//                emailEditText.error = "Email is required"
//                emailEditText.requestFocus()
//                return@setOnClickListener
//            }
//
//            if (password.isEmpty()) {
//                passwordEditText.error = "Password is required"
//                passwordEditText.requestFocus()
//                return@setOnClickListener
//            }
//
//            if (password.length < 6) {
//                passwordEditText.error = "Password must be at least 6 characters"
//                passwordEditText.requestFocus()
//                return@setOnClickListener
//            }
//
//            // Authenticate user
//            auth.signInWithEmailAndPassword(email, password)
//                .addOnCompleteListener { task ->
//                    if (task.isSuccessful) {
//                        navigateToHome()
//                    } else {
//                        Toast.makeText(this, "Login failed: ${task.exception?.message}", Toast.LENGTH_LONG).show()
//                    }
//                }
//        }
//
//        // Skip icon functionality
//        findViewById<ImageView>(R.id.skipIcon).setOnClickListener {
//            navigateToSignup()
//        }
//
//        // Signup prompt functionality
//        findViewById<TextView>(R.id.toSignupScreen).setOnClickListener {
//            navigateToSignup()
//        }
//    }
//
//    private fun navigateToSignup() {
//        val intent = Intent(this, SignupActivity::class.java)
//        startActivity(intent)
//    }
//
//    private fun navigateToHome() {
//        val intent = Intent(this, MainActivity::class.java)
//        startActivity(intent)
//        finish() // Prevent going back to LoginActivity
//    }
//}