package com.example.foodapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
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

        add.setOnClickListener(){
            val intent = Intent(this,CartActivity::class.java)
            startActivity(intent)
        }
    }

    private fun init(){
        add=findViewById(R.id.add)
        buy=findViewById(R.id.buy)
    }
}