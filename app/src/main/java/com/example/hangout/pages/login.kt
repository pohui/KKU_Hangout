//package com.example.hangout.pages
//
//import android.content.Context
//import android.content.SharedPreferences
//import android.os.Bundle
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.Toast
//import androidx.databinding.DataBindingUtil
//import androidx.fragment.app.Fragment
//import com.example.hangout.databinding.FragmentLoginBinding
//
//class login : Fragment() {
//
//    private var binding: FragmentLoginBinding? = null
//    private val lifecycle get() = binding!!
//    lateinit var sharedPre: SharedPreferences
////    val editor:SharedPreferences.Editor = sharedPre.edit()
//
//    override fun onCreateView(
//        inflater: LayoutInflater,
//        container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        val binding = FragmentLoginBinding.inflate(inflater, container, false)
//
//        val root: View = lifecycle.root
//
////        sharedPre= this.getSharedPreferences("data_stored",Context.MODE_PRIVATE)
//
//
//        binding.btnLogin.setOnClickListener {
//            var username = binding.txtUsername.text
//
//            if (username.isBlank()) {
//                binding.txtAlert!!.text = ("Please enter the valid username")
//            } else {
//                var editor = sharedPre.edit().putString("remember","true")
////                var editor = SharedPreferences.Editor.putString("remember", "true").apply()
//                Toast.makeText(root.context, "Logged in as ${username}", Toast.LENGTH_SHORT).show()
//            }
//
//
//        }
//        return binding.root
//
//
////        override fun onDestroyView() {
////            super.onDestroyView()
////            binding = null
////        }
//
//    }
//}
//
//
//
////    override fun onCreate(savedInstanceState: Bundle?) {
////        super.onCreate(savedInstanceState)
////        setContentView(R.layout.fragment_login)
////        var getusername = findViewById<EditText>(R.id.username)
////        var btnlogin = findViewById<Button>(R.id.btn_login)
////        var txtalert = findViewById<TextView>(R.id.txt_alert)
//
//
//
//
