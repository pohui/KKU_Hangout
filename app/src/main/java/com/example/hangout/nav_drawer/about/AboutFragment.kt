package com.example.hangout.nav_drawer.about

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.hangout.R
import com.example.hangout.databinding.FragmentNavAboutBinding
import com.example.hangout.databinding.FragmentNavHomeBinding
import com.example.hangout.nav_drawer.home.HomeViewModel

class AboutFragment : Fragment() {
    private var _binding: FragmentNavAboutBinding? = null
    private val binding get() = _binding!!
    private lateinit var viewModel: AboutViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        val homeViewModel = ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentNavAboutBinding.inflate(inflater,container,false)
        val root: View = binding.root

        binding.txtholder.text = "This is ${binding}"

        return root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(AboutViewModel::class.java)
        // TODO: Use the ViewModel
    }

}