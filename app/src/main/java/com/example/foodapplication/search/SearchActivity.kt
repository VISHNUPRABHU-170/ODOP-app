package com.example.foodapplication.search

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodapplication.R

class SearchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)
    }
}