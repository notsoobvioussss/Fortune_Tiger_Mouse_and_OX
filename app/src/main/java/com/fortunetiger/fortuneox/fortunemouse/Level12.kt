package com.fortunetiger.fortuneox.fortunemouse

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.fortunetiger.fortuneox.fortunemouse.databinding.ActivityLevel12Binding

class Level12 : AppCompatActivity() {
    lateinit var lvl12: ActivityLevel12Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        lvl12 = ActivityLevel12Binding.inflate(layoutInflater)
        setContentView(lvl12.root)
        lvl12.a12.setOnClickListener {
            val rootView = lvl12.f12
            rootView.setBackgroundColor(Color.RED)
            val delayMillis = 2000L
            Handler().postDelayed({
                rootView.setBackgroundResource(R.drawable.level12)
            }, delayMillis)
        }
        lvl12.b12.setOnClickListener {
            startActivity(Intent(this, Level13::class.java))
            finish()
        }
        lvl12.ex12.setOnClickListener {
            startActivity(Intent(this, MenuActivity::class.java))
            finish()
        }
    }
}
