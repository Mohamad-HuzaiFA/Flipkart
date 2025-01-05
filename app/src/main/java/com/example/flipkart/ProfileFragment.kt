package com.example.flipkart
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.FragmentTransaction
import android.widget.TextView // Import for TextView
import com.google.firebase.auth.FirebaseAuth

class ProfileFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_profile, container, false)
        val textView: TextView = view.findViewById(R.id.username_)
        // Set the new text
        textView.text = UserSession.username

        // Find the settings button and set an onClickListener
        val settingsButton: Button = view.findViewById(R.id.settings)

        val logoutButton:Button=view.findViewById(R.id.logoutButton)
        logoutButton.setOnClickListener{
            FirebaseAuth.getInstance().signOut();
            val intent = Intent(requireContext(), LoginActivity::class.java)
            startActivity(intent)
        }


        settingsButton.setOnClickListener {
            // Navigate to SettingsFragment
            parentFragmentManager.beginTransaction()
                .replace(R.id.frame_container, SettingsFragment()) // Assuming `frame_container` is the container ID
                .addToBackStack(null) // Adds this transaction to the back stack
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN) // Optional: for smoother transition
                .commit()
        }

        // Find the order link TextView and set an onClickListener
        val orderLink: TextView = view.findViewById(R.id.orderLink) // Assuming orderLink is a TextView
        orderLink.setOnClickListener {
            // Navigate to OrderFragment
            parentFragmentManager.beginTransaction()
                .replace(R.id.frame_container, OrderFragment()) // Assuming `frame_container` is the container ID
                .addToBackStack(null) // Adds this transaction to the back stack
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN) // Optional: for smoother transition
                .commit()

        }

        return view
    }
}


//////////////////////////
//package com.example.flipkart;
//import android.os.Bundle
//import androidx.fragment.app.Fragment
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.Button
//import androidx.fragment.app.FragmentTransaction
//import android.widget.TextView // Import for TextView
//
//class ProfileFragment : Fragment() {
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        // Inflate the layout for this fragment
//        val view = inflater.inflate(R.layout.fragment_profile, container, false)
//
//        // Find the settings button and set an onClickListener
//        val settingsButton: Button = view.findViewById(R.id.settings)
//        settingsButton.setOnClickListener {
//            // Navigate to SettingsFragment
//            parentFragmentManager.beginTransaction()
//                .replace(R.id.frame_container, SettingsFragment()) // Assuming `frame_container` is the container ID
//                .addToBackStack(null) // Adds this transaction to the back stack
//                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN) // Optional: for smoother transition
//                .commit()
//        }
//
//        // Find the order link TextView and set an onClickListener
//        val orderLink: TextView = view.findViewById(R.id.orderLink) // Assuming orderLink is a TextView
//        orderLink.setOnClickListener {
//            // Navigate to OrderFragment
//            parentFragmentManager.beginTransaction()
//                .replace(R.id.frame_container, OrderFragment()) // Assuming `frame_container` is the container ID
//                .addToBackStack(null) // Adds this transaction to the back stack
//                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN) // Optional: for smoother transition
//                .commit()
//        }
//
//        return view
//    }
//}