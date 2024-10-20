package com.example.flipkart.activities
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.flipkart.R
import com.example.flipkart.adapters.ProductAdapter
import com.example.flipkart.models.Product

class ExploreActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.explore_screen)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerViewProducts)

        // Sample product data
        val products = listOf(
            Product("Self Design Bollywood Silk Saree", 892.0, 78, "image_url_1"),
            Product("Girls Party (Festive) Sweatshirt", 379.0, 71, "image_url_2"),
            Product("Self Design Bollywood Silk Saree", 899.0, 70, "image_url_3"),
            Product("Self Design Bollywood Silk Saree", 999.0, 67, "image_url_4")
        )

        val adapter = ProductAdapter(products)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = GridLayoutManager(this, 2)
    }
}
