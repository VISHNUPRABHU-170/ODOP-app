package com.example.foodapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class EditprofileActivity : AppCompatActivity() {

    private lateinit var name: EditText
    private lateinit var number: EditText
    private lateinit var mailid: EditText
    private lateinit var location: EditText
    private lateinit var save: Button

    private lateinit var dbRef: DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_editprofile)

        name=findViewById(R.id.name)
        number=findViewById(R.id.number)
        mailid=findViewById(R.id.mailid)
        location=findViewById(R.id.address)
        save=findViewById(R.id.save)

        dbRef=FirebaseDatabase.getInstance().getReference("User Information")

        save.setOnClickListener(){
            savedata()
        }
    }

    private fun savedata(){
        val str1=name.text.toString()
        val str2=number.text.toString()
        val str3=mailid.text.toString()
        val str4=location.text.toString()

        if(str1.isEmpty()){
            name.error = "Please Enter Your Name"
        }
        else if(str2.isEmpty()){
            number.error = "Please Enter Your Mobile Number"
        }

        else if(str3.isEmpty()){
            mailid.error = "Please Enter Your Mobile Number"
        }
        else{
            val details=dbRef.push().key!!

            val info=InfoModel(str1,str2,str3,str4)

            dbRef.child(details).setValue(info)
                .addOnCompleteListener(){
                    Toast.makeText(this,"Successfully Saved",Toast.LENGTH_SHORT).show()
                }.addOnFailureListener(){
                    Toast.makeText(this,"Failed to Save",Toast.LENGTH_SHORT).show()
                }
        }

    }
}

