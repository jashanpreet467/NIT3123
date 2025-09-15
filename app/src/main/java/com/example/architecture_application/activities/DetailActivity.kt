package com.example.architecture_application.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.architecture_application.R

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        // Get values from adapter
        val name = intent.getStringExtra("name")
        val architect = intent.getStringExtra("architect")
        val location = intent.getStringExtra("location")
        val yearCompleted = intent.getStringExtra("yearCompleted")
        val style = intent.getStringExtra("style")
        val height = intent.getStringExtra("height")
        val description = intent.getStringExtra("description")

        // Find views
        val tvName: TextView = findViewById(R.id.tv_name)
        val tvArchitect: TextView = findViewById(R.id.tv_architect)
        val tvLocation: TextView = findViewById(R.id.tv_location)
        val tvYear: TextView = findViewById(R.id.tv_year)
        val tvStyle: TextView = findViewById(R.id.tv_style)
        val tvHeight: TextView = findViewById(R.id.tv_height)
        val tvDescription: TextView = findViewById(R.id.tv_description)

        // Set values
        tvName.text = name
        tvArchitect.text = "Architect: $architect"
        tvLocation.text = "Location: $location"
        tvYear.text = "Year Completed: $yearCompleted"
        tvStyle.text = "Style: $style"
        tvHeight.text = "Height: $height"
        tvDescription.text = "Description: $description"

    }
}
