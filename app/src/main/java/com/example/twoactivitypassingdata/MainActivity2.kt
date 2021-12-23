package com.example.twoactivitypassingdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    private lateinit var imageView: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        imageView = findViewById(R.id.image_view)

        val passingData = intent.extras
        if (passingData != null) {
            val picture = passingData.getInt("picture")
            imageView.setImageResource(picture)

        }


    }
}

