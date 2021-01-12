package com.example.newsindproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)


        supportActionBar?.hide()
        val imageID: ImageView = findViewById(R.id.imageID)
        val textNameID: TextView = findViewById(R.id.textNameID)
        val textAppID: TextView = findViewById(R.id.textAppID)



        imageID.alpha = 0f
        textNameID.alpha = 1f
        textAppID.alpha = 1f

        imageID.animate().setDuration(1500).alpha(1f).withEndAction {
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
            finish()
        }

    }
}