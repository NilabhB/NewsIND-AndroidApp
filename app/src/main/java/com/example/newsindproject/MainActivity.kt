package com.example.newsindproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, "Greetings from NewsIND!", Toast.LENGTH_LONG).show()

    }


    fun headlineExecute(view: View) {
        Toast.makeText(this, "Headline Section", Toast.LENGTH_LONG).show()
        val intent = Intent(this, HeadlineActivity::class.java)
        startActivity(intent)
    }

    fun businessExecute(view: View) {
        Toast.makeText(this, "Business Section", Toast.LENGTH_LONG).show()
        val intent = Intent(this, BusinessActivity::class.java)
        startActivity(intent)
    }

    fun technologyExecute(view: View) {
        Toast.makeText(this, "Technology Section", Toast.LENGTH_LONG).show()
        val intent = Intent(this, TechnologyActivity::class.java)
        startActivity(intent)
    }

    fun scienceExecute(view: View) {
        Toast.makeText(this, "Science Section", Toast.LENGTH_LONG).show()
        val intent = Intent(this, ScienceActivity::class.java)
        startActivity(intent)
    }

    fun sportsExecute(view: View) {
        Toast.makeText(this, "Sports Section", Toast.LENGTH_LONG).show()
        val intent = Intent(this, SportsActivity::class.java)
        startActivity(intent)
    }

    fun healthExecute(view: View) {
        Toast.makeText(this, "Health Section", Toast.LENGTH_LONG).show()
        val intent = Intent(this, HealthActivity::class.java)
        startActivity(intent)
    }

    fun BBCexecute(view: View) {
        Toast.makeText(this, "BBC Headlines", Toast.LENGTH_LONG).show()
        val intent = Intent(this, BBCheadlineActivity::class.java)
        startActivity(intent)
    }


}