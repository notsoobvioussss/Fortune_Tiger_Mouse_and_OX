package com.fortunetiger.fortuneox.fortunemouse

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.fortunetiger.fortuneox.fortunemouse.databinding.ActivityLevel13Binding

class Level13 : AppCompatActivity() {
    lateinit var lvl13: ActivityLevel13Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        lvl13 = ActivityLevel13Binding.inflate(layoutInflater)
        setContentView(lvl13.root)
        lvl13.b13.setOnClickListener {
            val rootView = lvl13.f13
            rootView.setBackgroundColor(Color.RED)
            val delayMillis = 2000L
            Handler().postDelayed({
                rootView.setBackgroundResource(R.drawable.level12)
            }, delayMillis)
        }
        lvl13.a13.setOnClickListener {
            startActivity(Intent(this, Level14::class.java))
            finish()
        }
        lvl13.ex13.setOnClickListener {
            startActivity(Intent(this, MenuActivity::class.java))
            finish()
        }
    }
}