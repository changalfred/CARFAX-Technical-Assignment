package com.example.carfax_technical_assignment.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.carfax_technical_assignment.R
import com.example.carfax_technical_assignment.adapters.CarAdapter
import com.example.carfax_technical_assignment.model.Vehicle

class MainFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                     savedInstanceState: Bundle?): View? {
        activity?.setTitle(R.string.company_name)

        val rootView = inflater.inflate(R.layout.fragment_main, container, false)

        val recyclerView = rootView.findViewById<RecyclerView>(R.id.recyclerview_car_items)
        recyclerView.layoutManager = LinearLayoutManager(context)

        val vehicleDataset = emptyArray<Vehicle>()
        val adapter = CarAdapter(vehicleDataset)
        recyclerView.adapter = adapter

        return rootView
    }
}