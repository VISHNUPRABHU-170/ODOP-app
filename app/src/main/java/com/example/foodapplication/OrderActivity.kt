package com.example.foodapplication

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import com.example.foodapplication.notification.NotificationActivity
import java.util.Calendar

class OrderActivity : AppCompatActivity() {
    private lateinit var buy: Button
    private lateinit var quantity: EditText
    private lateinit var number: EditText
    private lateinit var address: EditText
    private lateinit var date: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        init()

        buy.setOnClickListener(){
            if(quantity.text.toString().trim().isBlank() || number.text.toString().trim().isBlank() || address.text.toString().trim().isBlank() || date.text.toString().trim().isBlank()){
                Toast.makeText(this,"Please fill the details",Toast.LENGTH_SHORT).show()
            }else{
                val intent = Intent(this,NotificationActivity::class.java)
                intent.putExtra("message","Your Order has Successfully Completed")
                startActivity(intent)
            }
        }

    }

    private fun init(){
        quantity=findViewById(R.id.qty)
        number=findViewById(R.id.number)
        address=findViewById(R.id.add)
        date=findViewById(R.id.date)
        buy=findViewById(R.id.proceed)
    }
}