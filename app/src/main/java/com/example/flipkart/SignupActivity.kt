package com.example.flipkart
import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth

class SignupActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth
    private lateinit var signupEmail: EditText
    private lateinit var signupPassword: EditText
    private lateinit var userName: EditText
    private lateinit var signupButton: Button
    private lateinit var loginRedirectText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.singup_screen)

        // Hide the action bar
        supportActionBar?.hide()

        // Initialize FirebaseAuth instance
        auth = FirebaseAuth.getInstance()

        // Initialize UI elements
        signupEmail = findViewById(R.id.signUpEmail)
        signupPassword = findViewById(R.id.signUpPassword)
        userName = findViewById(R.id.UserName) // Assuming a corresponding EditText for username in the XML layout
        signupButton = findViewById(R.id.btnSignUp)
        loginRedirectText = findViewById(R.id.loginRedirectText)

        // Set onClickListener for the signup button
        signupButton.setOnClickListener {
            handleSignUp()
        }

        // Navigate to login screen when login redirect text is clicked
        loginRedirectText.setOnClickListener {
            navigateToLogin()
        }

        // Handle skip icon click
//        findViewById<ImageView>(R.id.skipIcon_).setOnClickListener {
//            navigateToHome()
//        }
    }

    private fun handleSignUp() {
        val email = signupEmail.text.toString().trim()
        val password = signupPassword.text.toString().trim()
        val username = userName.text.toString().trim()

        // Input validation
        if (email.isEmpty()) {
            signupEmail.error = "Email cannot be empty"
            return
        }

        if (password.isEmpty()) {
            signupPassword.error = "Password cannot be empty"
            return
        }

        if (username.isEmpty()) {
            userName.error = "Username cannot be empty"
            return
        }

        // Firebase Authentication - Create user
        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    // Store the username in UserSession
                    UserSession.username = username

                    Toast.makeText(this, "SignUp Successful", Toast.LENGTH_SHORT).show()
                    navigateToLogin()
                } else {
                    Toast.makeText(
                        this,
                        "SignUp Failed: ${task.exception?.message}",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
    }

    private fun navigateToLogin() {
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
        finish() // Optional, prevents navigating back to the signup screen
    }

//    private fun navigateToHome() {
//        val intent = Intent(this, MainActivity::class.java)
//        startActivity(intent)
//        finish() // Prevents going back to LoginActivity
//    }
}

//package com.example.flipkart;
//import android.content.Intent
//import android.os.Bundle
//import android.widget.Button
//import android.widget.ImageView
//import androidx.appcompat.app.AppCompatActivity
//import com.google.firebase.auth.FirebaseAuth
//
//class SignupActivity : AppCompatActivity() {
//
//    private var auth: FirebaseAuth? = null
//
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//
//
//        supportActionBar?.hide() //To hide the toolbar at the top
//
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.singup_screen)
//        // Setup any additional components if needed
//
//        val loginButton: Button = findViewById(R.id.btnSignUp)
//        loginButton.setOnClickListener {
//            // Call navigateToHome when login button is clicked
//            navigateToLogin()
//        }
//
//        // Skip icon
//        findViewById<ImageView>(R.id.skipIcon_).setOnClickListener {
//            navigateToHome()
//        }
//
//    }
//
//    private fun navigateToLogin() {
//        // Navigate to Signup screen
//        val intent = Intent(this, LoginActivity::class.java)
//        startActivity(intent)
//    }
//
//    private fun navigateToHome() {
//        val intent = Intent(this, MainActivity::class.java)
//        startActivity(intent)
//        finish() // Prevents going back to LoginActivity
//    }
//}

//import android.content.Intent
//import android.os.Bundle
//import android.view.View
//import android.widget.Button
//import android.widget.EditText
//import android.widget.TextView
//import android.widget.Toast
//import androidx.appcompat.app.AppCompatActivity
//import com.google.firebase.auth.FirebaseAuth
//
//
//class SignUpActivity : AppCompatActivity() {
//    private var auth: FirebaseAuth? = null
//    private var signupEmail: EditText? = null
//    private var signupPassword: EditText? = null
//    private var signupButton: Button? = null
//    private var loginRedirectText: TextView? = null
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.singup_screen)
//        auth = FirebaseAuth.getInstance()
//        signupEmail = findViewById<EditText>(R.id.signUpEmail)
//        signupPassword = findViewById<EditText>(R.id.signUpPassword)
//        signupButton = findViewById<Button>(R.id.btnSignUp)
//        loginRedirectText = findViewById<TextView>(R.id.loginRedirectText)
//
//        signupButton.setOnClickListener(View.OnClickListener {
//            val user = signupEmail.getText().toString().trim { it <= ' ' }
//            val pass = signupPassword.getText().toString().trim { it <= ' ' }
//            if (user.isEmpty()) {
//                signupEmail.setError("Email cannot be empty")
//            }
//            if (pass.isEmpty()) {
//                signupPassword.setError("Password cannot be empty")
//            } else {
//                auth!!.createUserWithEmailAndPassword(user, pass).addOnCompleteListener { task ->
//                    if (task.isSuccessful) {
//                        Toast.makeText(
//                            this@SignUpActivity,
//                            "SignUp Successful",
//                            Toast.LENGTH_SHORT
//                        ).show()
//                        startActivity(
//                            Intent(
//                                this@SignUpActivity,
//                                LoginActivity::class.java
//                            )
//                        )
//                    } else {
//                        Toast.makeText(
//                            this@SignUpActivity,
//                            "SignUp Failed" + task.exception!!.message,
//                            Toast.LENGTH_SHORT
//                        ).show()
//                    }
//                }
//            }
//        })
//        loginRedirectText.setOnClickListener(View.OnClickListener {
//            startActivity(
//                Intent(
//                    this@SignUpActivity,
//                    LoginActivity::class.java
//                )
//            )
//        })
//    }
//}