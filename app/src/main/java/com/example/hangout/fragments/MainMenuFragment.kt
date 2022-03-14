package com.example.hangout.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.hangout.adapter.PlaceAdapter
import com.example.hangout.data.PlaceList
import com.example.hangout.databinding.FragmentMainmenuBinding

class MainMenuFragment: Fragment() {
    private lateinit var binding: FragmentMainmenuBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainmenuBinding.inflate(inflater,container,false)

        binding.placeRV.adapter = PlaceAdapter(PlaceList.listOfPlace)
        binding.placeRV.layoutManager = LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)

//        val myAdapter = MyAdapter(friends,email,arrImg)
////      val myAdapter = MyAdapter()
//        // นําข้อมูลที่ผ่านการจัดรูปแบบแล้วมาใส่ลงใน recyclerView
//        var recyclerView: RecyclerView? = root.findViewById<RecyclerView>(R.id.recycleView1)
//        recyclerView!!.adapter = myAdapter
//        recyclerView!!.layoutManager = LinearLayoutManager(context)

        return view
    }

}