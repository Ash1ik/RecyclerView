package com.example.recyclerview

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class NewsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)

        val headingNews : TextView = findViewById(R.id.heading)
        val imageNews : ImageView = findViewById(R.id.image_heading)
        val mainNews : TextView = findViewById(R.id.news)


        val bundle : Bundle? = intent.extras
        val heading  = bundle?.getString("heading")
        val imageId = bundle!!.getInt("imageId")
        val news = bundle.getString("news")

        headingNews.text = heading
        imageNews.setImageResource(imageId)
        mainNews.text = news

    }
}