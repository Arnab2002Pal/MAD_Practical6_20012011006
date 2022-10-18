package com.example.mad_practical6_20012011006

import android.content.Intent
import android.os.Bundle
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class YoutubeActivity : AppCompatActivity() {
    private val youtubeId="A4w8qrug6X4"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_youtube)
        val mywebview=findViewById<WebView>(R.id.web)
        val settings=mywebview.settings
        settings.javaScriptEnabled=true
        settings.loadWithOverviewMode=true
        settings.useWideViewPort=true

        mywebview.loadUrl("https://www.youtube.com/embed/$youtubeId")
        val button=findViewById<FloatingActionButton>(R.id.webfloat)
        button.setOnClickListener{
            Intent(this,MainActivity::class.java).apply{startActivity(this)}
        }
    }
}
