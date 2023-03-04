package com.example.foodapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.example.foodapplication.cart.CartActivity

class BuyActivity : AppCompatActivity() {

    private lateinit var add: Button
    private lateinit var buy: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buy)

        init()

        buy.setOnClickListener(){
            val intent = Intent(this,OrderActivity::class.java)
            startActivity(intent)
        }

        add.setOnClickListener() {
            Toast.makeText(this,"Successfully Added to cart",Toast.LENGTH_SHORT).show()
        }
        val img: ImageView = findViewById(R.id.img)
        val text: TextView = findViewById(R.id.name)
        val str: String
        val bundle: Bundle = intent.extras!!
        val resId: Int = bundle.getInt("pic")
        val intent = intent
        str=intent.getStringExtra("name").toString()
        text.text=str
        img.setImageResource(resId)
    }

    private fun init(){
        add=findViewById(R.id.add)
        buy=findViewById(R.id.buy)
    }
}