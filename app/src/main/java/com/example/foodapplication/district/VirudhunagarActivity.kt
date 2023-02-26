package com.example.foodapplication.district

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.foodapplication.BuyActivity
import com.example.foodapplication.R

class VirudhunagarActivity : AppCompatActivity() {
    private lateinit var towel: ImageView
    private lateinit var cloth: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_virudhunagar)
        init()

        towel.setOnClickListener(){
            val intent= Intent(this, BuyActivity::class.java)
            intent.putExtra("pic",R.drawable.gauze_cloth_towels)
            intent.putExtra("name","GAUZE CLOTH TOWELS")
            startActivity(intent)
        }
        cloth.setOnClickListener(){
            val intent= Intent(this, BuyActivity::class.java)
            intent.putExtra("pic",R.drawable.first_aid_clothes)
            intent.putExtra("name","FIRST AID CLOTH")
            startActivity(intent)
        }
    }
    private fun init(){
        towel=findViewById(R.id.image1)
        cloth=findViewById(R.id.image2)
    }
}