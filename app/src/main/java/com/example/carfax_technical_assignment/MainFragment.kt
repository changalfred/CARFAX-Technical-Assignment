package com.example.carfax_technical_assignment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class MainFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                     savedInstanceState: Bundle?): View? {
        activity?.setTitle(R.string.company_name)

        return inflater.inflate(R.layout.fragment_main, container, false)
    }
}