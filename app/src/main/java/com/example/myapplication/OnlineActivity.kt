package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class OnlineActivity : AppCompatActivity() {
    private lateinit var webss: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_online)

        webss = findViewById(R.id.webview)

        webss.settings.javaScriptEnabled = true

        webss.loadUrl("https://us06web.zoom.us/meeting/register/tZYuc-2hrzkpEtb1a-5M_y7XogAW_Ch2kr_y#/registration")
    }
}