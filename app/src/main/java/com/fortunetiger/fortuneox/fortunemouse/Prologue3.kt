package com.fortunetiger.fortuneox.fortunemouse

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fortunetiger.fortuneox.fortunemouse.databinding.ActivityPrologue3Binding

class Prologue3 : AppCompatActivity() {
    lateinit var pr3: ActivityPrologue3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        pr3 = ActivityPrologue3Binding.inflate(layoutInflater)
        setContentView(pr3.root)
        pr3.pe3.setOnClickListener {
            startActivity(Intent(this, MenuActivity::class.java))
            finish()
        }
        pr3.ps3.setOnClickListener {
            startActivity(Intent(this, Level11::class.java))
        }
    }
}