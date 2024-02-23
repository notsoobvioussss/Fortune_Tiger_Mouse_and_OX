package com.fortunetiger.fortuneox.fortunemouse

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fortunetiger.fortuneox.fortunemouse.databinding.ActivityPrologue2Binding

class Prologue2 : AppCompatActivity() {
    lateinit var pr2: ActivityPrologue2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        pr2 = ActivityPrologue2Binding.inflate(layoutInflater)
        setContentView(pr2.root)
        pr2.pe2.setOnClickListener {
            startActivity(Intent(this, MenuActivity::class.java))
            finish()
        }
        pr2.pn2.setOnClickListener {
            startActivity(Intent(this, Prologue3::class.java))
        }
    }
}