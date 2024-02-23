package com.fortunetiger.fortuneox.fortunemouse

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fortunetiger.fortuneox.fortunemouse.databinding.ActivityLevel26Binding

class Level26 : AppCompatActivity() {
    lateinit var lvl26: ActivityLevel26Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        lvl26 = ActivityLevel26Binding.inflate(layoutInflater)
        setContentView(lvl26.root)
        lvl26.ex26.setOnClickListener {
            startActivity(Intent(this, MenuActivity::class.java))
            finish()
        }
        lvl26.ar26.setOnClickListener {
            startActivity(Intent(this, Level27::class.java))
            finish()
        }
    }
}