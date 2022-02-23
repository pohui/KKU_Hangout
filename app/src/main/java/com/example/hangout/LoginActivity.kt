package com.example.hangout

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.Window
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.hangout.databinding.ActivityLoginBinding


class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    private val PreName = "db"
    lateinit var sharedPre: SharedPreferences


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        getWindow().requestFeature(Window.FEATURE_ACTION_BAR);

        sharedPre = this.getSharedPreferences("data_stored", Context.MODE_PRIVATE)

        var username = binding.txtUsername.text
        var bypass = readData("Username")
//        if (bypass != null){
//            var intent = Intent(this, MainActivity::class.java)
//            startActivity(intent)
//            Toast.makeText(this, "Logged in as ${username}", Toast.LENGTH_SHORT).show()
//            finish()
//        }

        binding.btnLogin.setOnClickListener {
            if (username.isBlank()) {
                binding.txtAlert!!.text = ("Please enter the valid username")
            } else {
                var intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                addData("AlreadyLoggedIn","true")
                addData("Username","${username}")
                Toast.makeText(this, "Logged in as ${username}", Toast.LENGTH_SHORT).show()
                finish()
            }
        }

        binding.button.setOnClickListener {
            var intent = Intent(this, TestActivity::class.java)
            startActivity(intent)
        }
        binding.button2.setOnClickListener {
            var intent = Intent(this, TestActivity2::class.java)
            startActivity(intent)
        }
    }

    fun addData(KEY_NAME: String, data: String) {
        val editor: SharedPreferences.Editor = sharedPre.edit()
        editor.putString(KEY_NAME, data)
        editor.commit()
    }

    //check for next login
    fun readData(KEY_NAME: String) {
        val data = sharedPre.getString(KEY_NAME, "No data")
    }

    fun clearData() {
        val editor: SharedPreferences.Editor = sharedPre.edit()
        editor.clear()
        editor.commit()
    }

    fun removeData(KEY_NAME: String) {
        val editor: SharedPreferences.Editor = sharedPre.edit()
        editor.remove(KEY_NAME)
        editor.commit()
    }

}
//    Snackbar.make(view,"Logged in as ${username}", Snackbar.LENGTH_LONG).show
//    lateinit var sharedPre: SharedPreferences
//    val editor:SharedPreferences.Editor = sharedPre.edit()






