package com.example.foodapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SigninTypeActivity : AppCompatActivity() {

    private lateinit var signin: Button
    private lateinit var signup: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin_type)

        signin=findViewById(R.id.signin)
        signup=findViewById(R.id.signup)

        signin.setOnClickListener(){
            val intent= Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }

        signup.setOnClickListener(){
            val intent = Intent(this,SignupActivity::class.java)
            startActivity(intent)
        }
    }
}