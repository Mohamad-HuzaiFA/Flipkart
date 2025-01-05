package com.example.flipkart

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.widget.SwitchCompat
import androidx.cardview.widget.CardView


class CategoryFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_category, container, false)

        // Loop to find all icon views by ID and set click listeners
        val cardIds = arrayOf(
            R.id.card1, R.id.card2, R.id.card3, R.id.card4, R.id.card5,
            R.id.card6, R.id.card7, R.id.card8
        )

        cardIds.forEachIndexed { index, id ->
            view.findViewById<CardView>(id)?.setOnClickListener {
                Toast.makeText(requireContext(), "Card ${index + 1} clicked", Toast.LENGTH_SHORT).show()
            }
        }

        return view
    }
}