package com.example.foodapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide(); //To remove the title bar in the app
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val send_button=findViewById<TextView>(R.id.login)
        val name=findViewById<EditText>(R.id.entername)
        val num=findViewById<EditText>(R.id.enternumber)
        val add=findViewById<EditText>(R.id.enteraddress)
        send_button.setOnClickListener(){
            val str=name.text.toString()
            val intent=Intent(this,HomeActivity::class.java)
            if(name.text.isBlank() || num.text.isBlank() || add.text.isBlank()){
                Toast.makeText(applicationContext,"Please fill the details",Toast.LENGTH_SHORT).show()
            }else{
                intent.putExtra("message_name", str)
                intent.putExtra("message_num",num.text.toString())
                intent.putExtra("message_add",add.text.toString())
                startActivity(intent)
            }
        }
    }
}