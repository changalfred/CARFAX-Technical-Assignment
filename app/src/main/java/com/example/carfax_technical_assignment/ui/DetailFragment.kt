package com.example.carfax_technical_assignment.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.carfax_technical_assignment.R

class DetailFragment(private val vehicleView: View) : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)

        val rootView = inflater.inflate(R.layout.fragment_detail, container, false)

        renderImage()

        println("Received item: $vehicleView")
        return rootView
    }

    override fun onResume() {
        super.onResume()

        activity?.actionBar?.hide()
    }

    private fun renderImage() {
//        Glide.with(requireContext())
//            .load(vehicleView.context)
    }
}