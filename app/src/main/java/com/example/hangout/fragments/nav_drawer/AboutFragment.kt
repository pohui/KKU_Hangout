package com.example.hangout.fragments.nav_drawer

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hangout.databinding.FragmentNavAboutBinding

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

}