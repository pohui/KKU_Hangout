//package com.example.hangout
//
//import android.content.Context
//import android.content.Intent
//import android.content.SharedPreferences
//import android.os.Bundle
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.Toast
//import androidx.databinding.DataBindingUtil
//import androidx.fragment.app.Fragment
//import com.example.hangout.databinding.ActivityLoginBinding
//
//
//class LoginFragment : Fragment() {
//
//    private lateinit var binding: ActivityLoginBinding
//    private val PreName = "db"
//    lateinit var sharedPre: SharedPreferences
//
//    override fun onCreateView(
//        inflater: LayoutInflater,
//        container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        binding = ActivityLoginBinding.inflate(inflater, container, false)
//        val root: View = binding.root
//
////        getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
////        getSupportActionBar()
////        getActionBar.hide();
//
//
////        sharedPre = this.getSharedPreferences("data_stored", Context.MODE_PRIVATE)
//
//        var username = binding.txtUsername.text
//        var bypass = readData("Username")
////        if (bypass != null){
////            var intent = Intent(this, MainActivity::class.java)
////            startActivity(intent)
////            Toast.makeText(this, "Logged in as ${username}", Toast.LENGTH_SHORT).show()
////            finish()
////        }
//
//        binding.btnLogin.setOnClickListener {
//            if (username.isBlank()) {
//                binding.txtAlert!!.text = ("Please enter the valid username")
//            } else {
//                lauchOtherActivity(this, MainActivity::class.java)
//                addData("AlreadyLoggedIn", "true")
//                addData("Username", "${username}")
////                Toast.makeText(this, "Logged in as ${username}", Toast.LENGTH_SHORT).show()
//            }
//        }
//
//        binding.button.setOnClickListener {
//            var intent:Intent = Intent(this, TestActivity2::class.java)
//            startActivity(intent)
//        }
//        binding.button2.setOnClickListener {
//            lauchOtherActivity(this, TestActivity2::class.java)
//        }
//        return root
//    }
//
//    fun lauchOtherActivity(now:Any,next:Any ){
//        var intent:Intent = Intent(now,next)
//        startActivity(intent)
//    }
//
//
//    fun addData(KEY_NAME: String, data: String) {
//        val editor: SharedPreferences.Editor = sharedPre.edit()
//        editor.putString(KEY_NAME, data)
//        editor.commit()
//    }
//
//    //check for next login
//    fun readData(KEY_NAME: String) {
//        val data = sharedPre.getString(KEY_NAME, "No data")
//    }
//
//    fun clearData() {
//        val editor: SharedPreferences.Editor = sharedPre.edit()
//        editor.clear()
//        editor.commit()
//    }
//
//    fun removeData(KEY_NAME: String) {
//        val editor: SharedPreferences.Editor = sharedPre.edit()
//        editor.remove(KEY_NAME)
//        editor.commit()
//    }
//
//}