package com.example.myapplication

import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.example.myapplication.databinding.ActivityAddProdctsBinding
import com.example.myapplication.databinding.ActivityPayOptionBinding

class Pay_optionActivity : AppCompatActivity() {
    private lateinit var binding : ActivityPayOptionBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPayOptionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra("name")
        val price = intent.getStringExtra("price")
        val imageId = intent.getIntExtra("imageId",R.drawable.a)


        binding.name.text = name
        binding.price.text = price
        binding.circleImageView.setImageResource(imageId)
        binding.pay.setOnClickListener {
            val simToolKitLaunchIntent =
                applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")
            simToolKitLaunchIntent?.let{startActivity(it)}
        }

        binding.call.setOnClickListener {
            val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:"+ "0757002921"))
            if (ContextCompat.checkSelfPermission(this@Pay_optionActivity,android.Manifest.permission.CALL_PHONE)!=PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(this@Pay_optionActivity, arrayOf<String>(android.Manifest.permission.CALL_PHONE),1)
            }else{
                startActivity(intent)
            }
        }




    }
}