package com.fortunetiger.fortuneox.fortunemouse

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.fortunetiger.fortuneox.fortunemouse.databinding.ActivityLevel14Binding

class Level14 : AppCompatActivity() {
    lateinit var lvl14: ActivityLevel14Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        lvl14 = ActivityLevel14Binding.inflate(layoutInflater)
        setContentView(lvl14.root)
        lvl14.b14.setOnClickListener {
            val rootView = lvl14.f14
            rootView.setBackgroundColor(Color.RED)
            val delayMillis = 2000L
            Handler().postDelayed({
                rootView.setBackgroundResource(R.drawable.level12)
            }, delayMillis)
        }
        lvl14.a14.setOnClickListener {
            startActivity(Intent(this, Level15::class.java))
            finish()
        }
        lvl14.ex14.setOnClickListener {
            startActivity(Intent(this, MenuActivity::class.java))
            finish()
        }
    }
}