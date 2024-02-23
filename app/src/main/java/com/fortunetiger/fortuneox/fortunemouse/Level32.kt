package com.fortunetiger.fortuneox.fortunemouse

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fortunetiger.fortuneox.fortunemouse.databinding.ActivityLevel32Binding

class Level32 : AppCompatActivity() {
    lateinit var lvl32: ActivityLevel32Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        lvl32 = ActivityLevel32Binding.inflate(layoutInflater)
        setContentView(lvl32.root)
        lvl32.ex32.setOnClickListener {
            startActivity(Intent(this, MenuActivity::class.java))
            finish()
        }
        lvl32.ar32.setOnClickListener {
            startActivity(Intent(this, Level33::class.java))
            finish()
        }
    }
}