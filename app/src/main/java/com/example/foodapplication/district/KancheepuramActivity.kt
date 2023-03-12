package com.example.foodapplication.district

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.foodapplication.cart.BuyActivity
import com.example.foodapplication.R

class KancheepuramActivity : AppCompatActivity() {
    private lateinit var sarees: ImageView
    private lateinit var saree: ImageView
    private lateinit var snacks: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kancheepuram)
        init()

        sarees.setOnClickListener(){
            val intent= Intent(this, BuyActivity::class.java)
            intent.putExtra("pic",R.drawable.kancheepuram_silksaree)
            intent.putExtra("name","SILK SAREE")
            startActivity(intent)
        }

        saree.setOnClickListener(){
            val intent= Intent(this, BuyActivity::class.java)
            intent.putExtra("pic",R.drawable.sares)
            intent.putExtra("name","FASHION SAREE")
            startActivity(intent)
        }

        snacks.setOnClickListener(){
            val intent= Intent(this, BuyActivity::class.java)
            intent.putExtra("pic",R.drawable.chinavengaya_muruku)
            intent.putExtra("name","SNACKS")
            startActivity(intent)
        }
    }

    private fun init(){
        sarees=findViewById(R.id.image1)
        saree=findViewById(R.id.image2)
        snacks=findViewById(R.id.image3)
    }
}