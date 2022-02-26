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

        sharedPre = this.getSharedPreferences("data_stored", Context.MODE_PRIVATE)
//        removeData("AlreadyLoggedIn")
//        clearData()
//        readData("AlreadyLoggedIn")
//        readData("Username")
        var username = binding.txtUsername.text
        var logged_in: String = readData("AlreadyLoggedIn").toString()
        var logged_in2: String = readData("Username").toString()
        Toast.makeText(this, "MODE AlreadyLoggedIn: ${logged_in} as ${logged_in2}", Toast.LENGTH_SHORT).show()

        if (logged_in == "yes"){
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            Toast.makeText(this, "by Auto Login", Toast.LENGTH_SHORT).show()
        }

        binding.btnLogin.setOnClickListener {
            if (username.isBlank()) {
                binding.txtAlert!!.text = ("Please enter the valid username")
            } else if (username.isNotBlank()) {
                addData("AlreadyLoggedIn","yes")
                addData("Username",username.toString())
                Toast.makeText(this, "Logged in as ${username}, ${readData("AlreadyLoggedIn")}", Toast.LENGTH_SHORT).show()
                var intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
        }
    }

//    fun loginPass(username: String) {
//        var intent = Intent(this, MainActivity::class.java)
//        startActivity(intent)
//        addData("AlreadyLoggedIn","yes")
//        addData("Username","${username}")
//        Toast.makeText(this, "Logged in as ${username}", Toast.LENGTH_SHORT).show()
//        finish()
//    }

    public fun addData(KEY_NAME: String, data: String) {
        var editor: SharedPreferences.Editor = sharedPre.edit()
        editor.putString(KEY_NAME, data)
//        editor.commit()
        editor.commit()
    }

    //check for next login
    public fun readData(KEY_NAME: String): String {
        var dataA = sharedPre.getString(KEY_NAME, "NO DATA")
        return dataA.toString()
    }

    public fun clearData() {
        var editor: SharedPreferences.Editor = sharedPre.edit()
        editor.clear()
        editor.commit()
    }

    public fun removeData(KEY_NAME: String) {
        sharedPre = this.getSharedPreferences("data_stored", Context.MODE_PRIVATE)
        var editor: SharedPreferences.Editor = sharedPre.edit()
        editor.remove(KEY_NAME)
        editor.commit()
    }

    fun logout() {
        removeData("AlreadyLoggedIn")
        removeData("Username")
//        clearData()
//        var temp = removeData("AlreadyLoggedIn")
        Toast.makeText(applicationContext, "You're logged out", Toast.LENGTH_SHORT).show()
//finish()
//        var intent = Intent(this, LoginActivity::class.java)
//        startActivity(intent)
    }

}
//    Snackbar.make(view,"Logged in as ${username}", Snackbar.LENGTH_LONG).show
//    lateinit var sharedPre: SharedPreferences
//    val editor:SharedPreferences.Editor = sharedPre.edit()






