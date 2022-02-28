package com.example.hangout.fragments.nav_drawer

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hangout.R
import com.example.hangout.databinding.FragmentNavLogoutBinding

class LogoutFragment : Fragment() {

    private var _binding: FragmentNavLogoutBinding? = null
    private val binding get() = _binding!!
    private lateinit var viewModel: LogoutViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_nav_logout, container, false)
    }

}