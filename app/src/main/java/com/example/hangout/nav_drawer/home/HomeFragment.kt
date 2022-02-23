package com.example.hangout.nav_drawer.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.hangout.R
import com.example.hangout.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

//        val textView: TextView = binding.textHome
//        homeViewModel.text.observe(viewLifecycleOwner) {
//            textView.text = it
//        }

        var card_cafe: CardView? = root.findViewById(R.id.card_cafe)
        var card_bar: CardView? = root.findViewById(R.id.card_bar)
        var card_restaurant: CardView? = root.findViewById(R.id.card_restaurant)
        var card_mall: CardView? = root.findViewById(R.id.card_mall)

            //click on cafe card
//            card_bar!!.setOnClickListener {
//                val intent = Intent(root.this, code_bar::class.java)
//                this.startActivity(intent)
//            }
//            card_restaurant!!.setOnClickListener {
//                val intent = Intent(root, code_restaurant::class.java)
//                this.startActivity(intent)
//            }
//            card_mall!!.setOnClickListener {
//                val intent = Intent(this, code_mall::class.java)
//                this.startActivity(intent)
//            }



        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}