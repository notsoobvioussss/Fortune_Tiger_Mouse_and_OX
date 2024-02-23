package com.fortunetiger.fortuneox.fortunemouse

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.fortunetiger.fortuneox.fortunemouse.databinding.ActivityMenuBinding

class MenuActivity : AppCompatActivity() {
    lateinit var menu_binding: ActivityMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        menu_binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(menu_binding.root)
        menu_binding.startgame.setOnClickListener {
            startActivity(Intent(this, Level11::class.java))
        }
        menu_binding.chapter.setOnClickListener {
            startActivity(Intent(this, Prologue1::class.java))
        }
        menu_binding.about.setOnClickListener {
            startActivity(Intent(this, About::class.java))
        }
        menu_binding.contactus.setOnClickListener {
            val email = "developerftmo@gmail.com"

            val intent = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("mailto:")
                putExtra(Intent.EXTRA_EMAIL, arrayOf(email))
            }

            if (intent.resolveActivity(packageManager) != null) {
                startActivity(intent)
            }
            else{
                Toast.makeText(this, "Email app not found", Toast.LENGTH_SHORT).show()
            }
        }
            menu_binding.privacy.setOnClickListener {
                startActivity(Intent(this, WebView::class.java))
            }
        }
}
