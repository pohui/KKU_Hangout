package com.example.hangout

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hangout.databinding.ActivityLoginBinding
import com.example.hangout.databinding.ActivityWelcomeBinding
import timber.log.Timber




class WelcomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityWelcomeBinding
    lateinit var sharedPre: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWelcomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        sharedPre = getSharedPreferences("data_stored", Context.MODE_PRIVATE)

        if (sharedPre.contains("BypassWelcomeActivity")) {
            var intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }

        binding.btnEnter.setOnClickListener {
            val editor: SharedPreferences.Editor = sharedPre.edit()
            editor.putBoolean("BypassWelcomeActivity",true)

            var intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}