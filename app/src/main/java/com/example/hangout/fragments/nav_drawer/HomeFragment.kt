package com.example.hangout.fragments.nav_drawer

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import com.example.hangout.R
import com.example.hangout.databinding.FragmentNavHomeBinding


class HomeFragment : Fragment() {

    private var binding: FragmentNavHomeBinding? = null
    private val bindingB get() = binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        binding = FragmentNavHomeBinding.inflate(inflater, container, false)
        val root: View = bindingB.root

//        val textView: TextView = binding.textHome
//        homeViewModel.text.observe(viewLifecycleOwner) {
//            textView.text = it
//        }

//        var card_cafe: CardView? = root.findViewById(R.id.card_cafe)
//        var card_bar: CardView? = root.findViewById(R.id.card2)
//        var card_restaurant: CardView? = root.findViewById(R.id.card3)
//        var card_mall: CardView? = root.findViewById(R.id.card4)


    binding!!.cafe.setOnClickListener {
//        view: View -> view.findNavController().navigate(R.id.action_nav_home_to_cafeFragment)
        view?.findNavController()?.navigate(R.id.action_nav_home_to_cafeFragment)
        /*can't use below this*/
//        Navigation.createNavigateOnClickListener(R.id.action_nav_home_to_cafeFragment)

    }




        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}