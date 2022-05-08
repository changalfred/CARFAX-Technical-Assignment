package com.example.carfax_technical_assignment.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.carfax_technical_assignment.model.Vehicle

class DetailFragment(private val vehicleItem: View) : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        println("Received item: $vehicleItem")
        return super.onCreateView(inflater, container, savedInstanceState)
    }
}