package com.example.foodapplication.district

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.foodapplication.BuyActivity
import com.example.foodapplication.R

class DindigulActivity : AppCompatActivity() {
    private lateinit var rope: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dindigul)
        init()

        rope.setOnClickListener(){
            val intent= Intent(this, BuyActivity::class.java)
            intent.putExtra("pic",R.drawable.coir_ropes)
            intent.putExtra("name","COIR ROPES")
            startActivity(intent)
        }
    }

    private fun init(){
        rope=findViewById(R.id.image1)
    }
}