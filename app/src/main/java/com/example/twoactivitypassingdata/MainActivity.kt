package com.example.twoactivitypassingdata

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.btn_show)


        button.setOnClickListener {

           // sendMessage()
            val passData = Intent(this, MainActivity2::class.java)
               passData.putExtra("picture",R.drawable.hasan)

            startActivity(passData)


        }



    }
    /*fun sendMessage(){
        val passData = Intent(this, MainActivity2::class.java).apply {
            putExtra("picture",R.drawable.hasan)
        }
        startActivity(passData)
    }*/
}