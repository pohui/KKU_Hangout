package com.example.hangout.fragments.nav_drawer

import android.content.SharedPreferences
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.hangout.databinding.DrawerButtonBinding
import com.example.hangout.databinding.DrawerHeaderBinding
import com.example.hangout.databinding.DrawerSwitchBinding
import timber.log.Timber

class Drawer : Fragment(){
    private lateinit var binding :DrawerHeaderBinding
    private lateinit var binding_btn: DrawerButtonBinding //todo
    private lateinit var binding_switch: DrawerSwitchBinding //todo
    lateinit var sharedPre: SharedPreferences

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DrawerHeaderBinding.inflate(inflater, container, false)
        val root: View = binding!!.root
        Timber.i("ARA : onCreateView in Drawer is running")

//        sharedPre = binding.getSharedPreferences("data_stored", Context.MODE_PRIVATE)
//        var MA = MainActivity()
//        var getUsername = MA.sharedPre.getString("Username","no")
//        binding!!.usernameDisplay.text = getUsername
//        binding!!.usernameDisplay.text = sharedPre.getString("Username","no")
//
        binding!!.usernameDesc.text="onCreateView"

        return binding!!.root
    }


}