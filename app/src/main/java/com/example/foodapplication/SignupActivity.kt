package com.example.foodapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class SignupActivity : AppCompatActivity() {

    private lateinit var number: EditText
    private lateinit var otp: EditText
    private lateinit var verify: Button
    private lateinit var go: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        supportActionBar?.hide()

        number=findViewById(R.id.number)
        otp=findViewById(R.id.otp)
        verify=findViewById(R.id.verify)
        go=findViewById(R.id.go)

        verify.setOnClickListener(){
            val str=number.text.toString()
            if(str.isBlank()){
                number.error="Please enter this field"
            }
        }

        go.setOnClickListener(){
            val str=otp.text.toString()
            if(str.isBlank()){
                otp.error="Please enter this field"
            }else{
                val intent=Intent(this,HomeActivity::class.java)
                startActivity(intent)
            }
        }


    }
}