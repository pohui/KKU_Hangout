package com.example.hangout.fragments.nav_drawer

import android.content.SharedPreferences
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.hangout.MainActivity
import com.example.hangout.databinding.DrawerButtonBinding
import com.example.hangout.databinding.DrawerHeaderBinding
import com.example.hangout.databinding.DrawerSwitchBinding

class Drawer : Fragment(){
    private lateinit var binding :DrawerHeaderBinding
    private lateinit var binding_btn: DrawerButtonBinding
//    private lateinit var binding_switch: DrawerSwitchBindingBinding
    lateinit var sharedPre: SharedPreferences

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DrawerHeaderBinding.inflate(inflater, container, false)
//        val root: View = binding.root
//
//        sharedPre = this.getSharedPreferences("data_stored", Context.MODE_PRIVATE)

        var MA = MainActivity()
        var getUsername = MA.sharedPre.getString("Username","no")
        binding.usernameDisplay.text = getUsername
//        binding.usernameDisplay.text = sharedPre.getString("Username","no")
        binding.textView.text="onCreateView"

        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var MA = MainActivity()
        var getUsername = MA.sharedPre.getString("Username","no")
        binding.usernameDisplay.text = getUsername

        binding.textView.text = "onCreate"
//        binding.usernameDisplay.text = sharedPre.getString("Username","no")

    }
}