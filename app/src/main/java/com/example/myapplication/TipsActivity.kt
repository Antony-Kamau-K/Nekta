package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class TipsActivity : AppCompatActivity() {

    private lateinit var webss: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tips)

        webss = findViewById(R.id.webview)

        webss.settings.javaScriptEnabled = true

        webss.loadUrl("https://wildflower-bee-farm.teachable.com/p/beekeepin" +
                "g-for-beginners?gclid=CjwKCAjwvJyjBhApEiwAWz2nLY8UNcM_SsBiTgyEWExW8ufNwR7uyFHAyd7ZgMHhUcHloCCAvt6v3BoCnMgQAvD_BwE")
    }
}