package com.example.hangout.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.hangout.databinding.FragmentMainmenuBinding

class MainMenuFragment: Fragment() {
    private lateinit var binding: FragmentMainmenuBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainmenuBinding.inflate(inflater,container,false)

//        val myAdapter = MyAdapter(friends,email,arrImg)
////      val myAdapter = MyAdapter()
//        // นําข้อมูลที่ผ่านการจัดรูปแบบแล้วมาใส่ลงใน recyclerView
//        var recyclerView: RecyclerView? = root.findViewById<RecyclerView>(R.id.recycleView1)
//        recyclerView!!.adapter = myAdapter
//        recyclerView!!.layoutManager = LinearLayoutManager(context)
        return binding.root
    }
}