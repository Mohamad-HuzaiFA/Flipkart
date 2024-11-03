package com.example.flipkart

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.widget.SwitchCompat
import androidx.fragment.app.Fragment

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        // Find and set up the toggle switch
        val toggleSwitch = view.findViewById<SwitchCompat>(R.id.toggleSwitch)
        toggleSwitch.setOnCheckedChangeListener { _, isChecked ->
            val message = if (isChecked) "Switch is ON" else "Switch is OFF"
            Toast.makeText(requireContext(), message, Toast.LENGTH_SHORT).show()
        }

        // Loop to find all icon views by ID and set click listeners
        val iconIds = arrayOf(
            R.id.icon1, R.id.icon2, R.id.icon3, R.id.icon4, R.id.icon5,
            R.id.icon6, R.id.icon7, R.id.icon8, R.id.icon9, R.id.icon10,
            R.id.icon11, R.id.icon12
        )

        iconIds.forEachIndexed { index, id ->
            view.findViewById<ImageView>(id)?.setOnClickListener {
                Toast.makeText(requireContext(), "Icon ${index + 1} clicked", Toast.LENGTH_SHORT).show()
            }
        }

        return view
    }
}
