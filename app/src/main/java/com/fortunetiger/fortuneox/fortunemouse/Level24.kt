package com.fortunetiger.fortuneox.fortunemouse

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fortunetiger.fortuneox.fortunemouse.databinding.ActivityLevel24Binding

class Level24 : AppCompatActivity() {
    lateinit var lvl24: ActivityLevel24Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        lvl24 = ActivityLevel24Binding.inflate(layoutInflater)
        setContentView(lvl24.root)
        lvl24.ex24.setOnClickListener {
            startActivity(Intent(this, MenuActivity::class.java))
            finish()
        }
        lvl24.ar24.setOnClickListener {
            startActivity(Intent(this, Level25::class.java))
            finish()
        }
    }
}