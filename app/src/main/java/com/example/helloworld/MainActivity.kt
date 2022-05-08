package com.example.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnBMI: Button
    lateinit var btnSendMoney:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnBMI =findViewById(R.id.btnBMI)
        btnBMI.setOnClickListener {
            val intent=Intent(this,calculatebmi::class.java)
            startActivity(intent)
        }

        btnSendMoney = findViewById(R.id.btnSendMoney)
        btnSendMoney.setOnClickListener {
            val intent = Intent(this,sendMoney::class.java)
            startActivity(intent)
        }
    }
}