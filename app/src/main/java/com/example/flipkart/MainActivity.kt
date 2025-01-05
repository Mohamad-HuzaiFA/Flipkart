package com.example.flipkart;
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.firebase.FirebaseApp

class MainActivity : AppCompatActivity() {

    private  lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {

        supportActionBar?.hide() //To hide the toolbar at the top

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        FirebaseApp.initializeApp(this)


        bottomNavigationView = findViewById(R.id.bottom_nav)

        bottomNavigationView.setOnItemSelectedListener { menuItem ->
            when(menuItem.itemId){
                R.id.homeFragment_ -> {
                    replaceFragment(HomeFragment())
                    true
                }

                R.id.categoryFragment_ -> {
                    replaceFragment(CategoryFragment())
                    true
                }
                R.id.exploreFragment_ -> {
                    replaceFragment(ExploreFragment())
                    true
                }
                R.id.profileFragment_ -> {
                    replaceFragment(ProfileFragment())
                    true
                }

                R.id.cartFragment_-> {
                    replaceFragment(CartFragment())
                    true
                }
                else -> false
            }
        }

        replaceFragment(HomeFragment())


    }

    private fun replaceFragment(fragment:Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.frame_container,fragment).commit()

    }
}
