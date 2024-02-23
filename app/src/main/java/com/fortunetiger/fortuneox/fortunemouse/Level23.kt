package com.fortunetiger.fortuneox.fortunemouse

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fortunetiger.fortuneox.fortunemouse.databinding.ActivityLevel23Binding

class Level23 : AppCompatActivity() {
    lateinit var lvl23: ActivityLevel23Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        lvl23 = ActivityLevel23Binding.inflate(layoutInflater)
        setContentView(lvl23.root)
        lvl23.ex23.setOnClickListener {
            startActivity(Intent(this, MenuActivity::class.java))
            finish()
        }
        lvl23.ne23.setOnClickListener {
            startActivity(Intent(this, Level24::class.java))
            finish()
        }
    }
}