package com.fortunetiger.fortuneox.fortunemouse

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fortunetiger.fortuneox.fortunemouse.databinding.ActivityLevel42Binding

class Level42 : AppCompatActivity() {
    lateinit var lvl42: ActivityLevel42Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        lvl42 = ActivityLevel42Binding.inflate(layoutInflater)
        setContentView(lvl42.root)
        lvl42.ex42.setOnClickListener {
            startActivity(Intent(this, MenuActivity::class.java))
            finish()
        }
        lvl42.th42.setOnClickListener {
            startActivity(Intent(this, Level43::class.java))
            finish()
        }
    }
}