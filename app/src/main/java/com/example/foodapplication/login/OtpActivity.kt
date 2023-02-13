package com.example.foodapplication.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.foodapplication.HomeActivity
import com.example.foodapplication.R
import com.google.firebase.FirebaseException
import com.google.firebase.FirebaseTooManyRequestsException
import com.google.firebase.auth.*
import java.util.concurrent.TimeUnit

class OtpActivity : AppCompatActivity() {
    private lateinit var go: Button
    private lateinit var otp1: EditText
    private lateinit var otp2: EditText
    private lateinit var otp3: EditText
    private lateinit var otp4: EditText
    private lateinit var otp5: EditText
    private lateinit var otp6: EditText
    private lateinit var resend: Button
    private lateinit var auth: FirebaseAuth
    private lateinit var OTP: String
    private lateinit var typedOTP: String
    private lateinit var resendToken: PhoneAuthProvider.ForceResendingToken
    private lateinit var Number: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otp)
        supportActionBar?.hide()

        OTP=intent.getStringExtra("OTP").toString()
        resendToken=intent.getParcelableExtra("resendToken")!!
        Number=intent.getStringExtra("phoneNumber")!!

        init()

        go.setOnClickListener(){
            typedOTP=otp1.text.toString()+otp2.text.toString()+otp3.text.toString()+otp4.text.toString()+otp5.text.toString()+otp6.text.toString()
            if(typedOTP.trim().isBlank() || typedOTP.length!=6){
                Toast.makeText(this,"Please enter a valid OTP",Toast.LENGTH_SHORT).show()
            }else{
                val credential: PhoneAuthCredential=PhoneAuthProvider.getCredential(
                    OTP,typedOTP
                )
                signInWithPhoneAuthCredential(credential)
            }
        }

        resend.setOnClickListener(){
            resendVerificationCode()
        }


    }

    private fun init(){
        go=findViewById(R.id.go)
        otp1=findViewById(R.id.otp1)
        otp2=findViewById(R.id.otp2)
        otp3=findViewById(R.id.otp3)
        otp4=findViewById(R.id.otp4)
        otp5=findViewById(R.id.otp5)
        otp6=findViewById(R.id.otp6)
        resend=findViewById(R.id.resend)
        auth=FirebaseAuth.getInstance()
    }

    private fun sendToMain(){
        startActivity(Intent(this, HomeActivity::class.java))
    }

    private fun signInWithPhoneAuthCredential(credential: PhoneAuthCredential) {
        auth.signInWithCredential(credential)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    // Sign in success, update UI with the signed-in user's information
                    Log.d("TAG", "signInWithCredential:success")
                    sendToMain()
                } else {
                    // Sign in failed, display a message and update the UI
                    Log.w("TAG", "signInWithCredential:failure", task.exception)
                    if (task.exception is FirebaseAuthInvalidCredentialsException) {
                        // The verification code entered was invalid
                    }
                    // Update UI
                }
            }
    }

    private fun resendVerificationCode(){
        val options = PhoneAuthOptions.newBuilder(auth)
            .setPhoneNumber(Number)       // Phone number to verify
            .setTimeout(60L, TimeUnit.SECONDS) // Timeout and unit
            .setActivity(this)                 // Activity (for callback binding)
            .setCallbacks(callbacks)
            .setForceResendingToken(resendToken)// OnVerificationStateChangedCallbacks
            .build()
        PhoneAuthProvider.verifyPhoneNumber(options)
    }

    private val callbacks = object : PhoneAuthProvider.OnVerificationStateChangedCallbacks() {

        override fun onVerificationCompleted(credential: PhoneAuthCredential) {
            // This callback will be invoked in two situations:
            // 1 - Instant verification. In some cases the phone number can be instantly
            //     verified without needing to send or enter a verification code.
            // 2 - Auto-retrieval. On some devices Google Play services can automatically
            //     detect the incoming verification SMS and perform verification without
            //     user action.
            signInWithPhoneAuthCredential(credential)
        }

        override fun onVerificationFailed(e: FirebaseException) {
            // This callback is invoked in an invalid request for verification is made,
            // for instance if the the phone number format is not valid.


            if (e is FirebaseAuthInvalidCredentialsException) {
                // Invalid request
                Log.d("TAG", "Verification failed ${e.toString()}")
            } else if (e is FirebaseTooManyRequestsException) {
                // The SMS quota for the project has been exceeded
                Log.d("TAG", "Verification failed ${e.toString()}")
            }

            // Show a message and update the UI
        }

        override fun onCodeSent(
            verificationId: String,
            token: PhoneAuthProvider.ForceResendingToken
        ) {
            // The SMS verification code has been sent to the provided phone number, we
            // now need to ask the user to enter the code and then construct a credential
            // by combining the code with a verification ID.
            OTP = verificationId
            resendToken = token
        }
    }

}