package com.example.hangout.fragments.nav_drawer

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.hangout.R

class ReportFragment : Fragment() {
//    private lateinit var viewModel: ReportViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //todo wait for tonkla
        return inflater.inflate(R.layout.fragment_nav_report, container, false)
    }
}