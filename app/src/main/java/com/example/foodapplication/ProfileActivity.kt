package com.example.foodapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        lateinit var receiver_msg: TextView
        lateinit var num: TextView
        receiver_msg = findViewById(R.id.name)
        num=findViewById(R.id.number)
        // create the get Intent object
        val intent = intent
        // receive the value by getStringExtra() method and
        // key must be same which is send by first activity
        val str = intent.getStringExtra("message_name")
        val str1 = intent.getStringExtra("message_num")
        // display the string into textView
        receiver_msg.text = str
        num.text=str1


    }
}