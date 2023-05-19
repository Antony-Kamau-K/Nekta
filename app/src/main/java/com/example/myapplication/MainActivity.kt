package com.example.myapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btn:Button
    lateinit var tips:Button
    lateinit var send:Button
    lateinit var flower:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn = findViewById(R.id.bee)
        tips = findViewById(R.id.tips)
        send = findViewById(R.id.send)
        flower = findViewById(R.id.flower)


        btn.setOnClickListener {
            var intent = Intent(this,Add_prodctsActivity::class.java)
            startActivity(intent)
        }
        tips.setOnClickListener {
            var intent = Intent(this,TipsActivity::class.java)
            startActivity(intent)
        }
        flower.setOnClickListener {
            var intent = Intent(this,TipsActivity::class.java)
            startActivity(intent)
        }


        send.setOnClickListener {
            val uri: Uri =Uri.parse("smsto:0757002921")
            val intent = Intent(Intent.ACTION_SENDTO,uri)
            intent.putExtra("sms_body","Pin Your Location and Mpesa Message For Delivery")
            startActivity(intent)
        }
    }
}