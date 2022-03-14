package com.example.hangout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.hangout.databinding.ActivityLoginOnlineBinding



class LoginOnlineActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginOnlineBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginOnlineBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //todo: for online

    }
}