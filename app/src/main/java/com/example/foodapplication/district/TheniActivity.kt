package com.example.foodapplication.district

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodapplication.R

class TheniActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_theni)
    }
}