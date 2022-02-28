package com.example.hangout

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.hangout.data.SharedPerf
import com.example.hangout.databinding.*
import kotlinx.coroutines.delay
import timber.log.Timber


class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    private var binding_nav_header: ADrawerHeaderNavBinding? = null
    lateinit var sharedPre: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        sharedPre = getSharedPreferences("data_stored", MODE_PRIVATE)

        var username = binding.txtUsername.text
        var logged_in: String? = sharedPre.getString("Username","no user")
        var rememberMe: Boolean? = sharedPre.getBoolean("RememberMe", false)

        if (sharedPre.contains("Username")){
            Timber.i("ara : already has USERNAME, login bypassed | sharedPre.contains(\"Username\") = ${sharedPre.contains("Username")}")
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            Toast.makeText(this, "Auto Logged in as ${logged_in}", Toast.LENGTH_SHORT).show()
        }

        binding.txtLoginAlert.visibility = View.GONE
        binding.btnLogin.setOnClickListener {
            if (username.isBlank()) {
                binding.txtLoginAlert.visibility = View.VISIBLE
                binding.txtLoginAlert.text = "Please enter the valid username"
//                Toast.makeText(this, "Please enter the valid username", Toast.LENGTH_SHORT).show()
            } else {
                val editor: SharedPreferences.Editor = sharedPre.edit()
                editor.putString("Username",username.toString() )
                editor.putBoolean("RememberMe", true)
                editor.commit()
                Toast.makeText(this, "Logged in as ${username}", Toast.LENGTH_SHORT).show()
                var intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}
//    Snackbar.make(view,"Logged in as ${username}", Snackbar.LENGTH_LONG).show
//    lateinit var sharedPre: SharedPreferences
//    val editor:SharedPreferences.Editor = sharedPre.edit()






