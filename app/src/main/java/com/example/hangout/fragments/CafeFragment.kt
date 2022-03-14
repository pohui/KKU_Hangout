//package com.example.hangout.fragments
//
//import android.content.Intent
//import android.net.Uri
//import android.os.Bundle
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import androidx.fragment.app.Fragment
//import com.example.hangout.databinding.TestFragmentCafeBinding
//
//
//class CafeFragment: Fragment() {
//    private var binding: TestFragmentCafeBinding? = null
//
//    override fun onCreateView(
//        inflater: LayoutInflater,
//        container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//
//        binding = TestFragmentCafeBinding.inflate(inflater,container,false)
//
//        binding!!.cafe1Txt.text = ("ร้านคาเฟ่ขอนแก่น คาเฟ่ใน มข ร้านนี้มีบรรยากาศดี ส่วนใหญ่เป็นคนเข้ามานั่งอ่านหนังสือ ทำงาน มีบริการอาหารจานหลัก" +
//                "ช่วงดึกจะมีแค่ของขนมหวาน เครื่องดื่ม แนะนำชาเขียวปั่น กับชาไทยปั่น รสชาติพอดีไม่หวานมาก " +
//                "ร้านนี้ปิดดึกมาก เด็กนักศึกษา หรือใครนอนไม่หลับอยากให้ลองมานั่งชิล ๆ ได้")
//
//        binding!!.cafe1OpenInMap.setOnClickListener {
//            val intent = Intent(Intent.ACTION_VIEW)
//            intent.data = Uri.parse("geo:16.476810406379904, 102.82301638253365")
//            val chooser = Intent.createChooser(intent, "Launch Map")
//            startActivity(chooser)
//        }
//
//
//        return binding!!.root
//
//    }
//}