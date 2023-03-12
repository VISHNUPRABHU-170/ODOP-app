package com.example.foodapplication.district

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.foodapplication.cart.BuyActivity
import com.example.foodapplication.R

class TirunelveliActivity : AppCompatActivity() {
    private lateinit var halwa: ImageView
    private lateinit var forging: ImageView
    private lateinit var chilli: ImageView
    private lateinit var oil: ImageView
    private lateinit var glass: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tirunelveli)
        init()

        halwa.setOnClickListener(){
            val intent= Intent(this, BuyActivity::class.java)
            intent.putExtra("pic",R.drawable.halwa)
            intent.putExtra("name","HALWA")
            startActivity(intent)
        }

        forging.setOnClickListener(){
            val intent= Intent(this, BuyActivity::class.java)
            intent.putExtra("pic",R.drawable.forging_components)
            intent.putExtra("name","FORGING COMPONENTS")
            startActivity(intent)
        }

        chilli.setOnClickListener(){
            val intent= Intent(this, BuyActivity::class.java)
            intent.putExtra("pic",R.drawable.tamarind_chilli)
            intent.putExtra("name","TAMARIND CHILLI")
            startActivity(intent)
        }

        oil.setOnClickListener(){
            val intent= Intent(this, BuyActivity::class.java)
            intent.putExtra("pic",R.drawable.oil_expeller)
            intent.putExtra("name","OIL EXPELLER")
            startActivity(intent)
        }

        glass.setOnClickListener(){
            val intent= Intent(this, BuyActivity::class.java)
            intent.putExtra("pic",R.drawable.glass_slides)
            intent.putExtra("name","GLASS SLIDES")
            startActivity(intent)
        }
    }

    private fun init(){
        halwa=findViewById(R.id.image1)
        forging=findViewById(R.id.image2)
        chilli=findViewById(R.id.image4)
        oil=findViewById(R.id.image3)
        glass=findViewById(R.id.image5)
    }
}