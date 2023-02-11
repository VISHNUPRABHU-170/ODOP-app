package com.example.foodapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class LoginActivity : AppCompatActivity() {
    private lateinit var go: Button
    private lateinit var number: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar?.hide()

        go=findViewById(R.id.go)
        number=findViewById(R.id.number)

        go.setOnClickListener(){
            val str=number.text.toString()
            if(str.isEmpty() || str.trim().isEmpty()){
                number.error="Please enter this field"
            }else{
                val intent = Intent(this,HomeActivity::class.java)
                startActivity(intent)
            }
        }
    }
}