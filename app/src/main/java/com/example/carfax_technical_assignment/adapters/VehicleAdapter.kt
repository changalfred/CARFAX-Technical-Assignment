package com.example.carfax_technical_assignment.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.carfax_technical_assignment.R
import com.example.carfax_technical_assignment.model.Vehicle
import com.google.android.material.snackbar.Snackbar

class VehicleAdapter(private val vehicleDataset: Array<Vehicle>) : RecyclerView.Adapter<VehicleAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.vehicle_row_item, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val vehicle = vehicleDataset[position]

        val image = holder.image
        vehicle.image = image

        val year = holder.year.text
        vehicle.year = year.toString()

        val make = holder.make
        vehicle.make = make.toString()

        val model = holder.model
        vehicle.model = model.toString()

        val trim = holder.trim
        vehicle.trim = trim.toString()

        val price = holder.price
        vehicle.price = price.toString()

        val mileage = holder.mileage
        vehicle.mileage = mileage.toString()

        val city = holder.city
        vehicle.city = city.toString()

        val state = holder.state
        vehicle.state = state.toString()

        val callButton = holder.callButton
        callButton.setOnClickListener {
            Snackbar.make(it, "Replace with call action.", Snackbar.LENGTH_SHORT)
                .show()
        }
    }

    override fun getItemCount(): Int {
        return vehicleDataset.size
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val image = view.findViewById<ImageView>(R.id.vehicle_image)
        val year = view.findViewById<TextView>(R.id.vehicle_year)
        val make = view.findViewById<TextView>(R.id.vehicle_make)
        val model = view.findViewById<TextView>(R.id.vehicle_model)
        val trim = view.findViewById<TextView>(R.id.vehicle_trim)
        val price = view.findViewById<TextView>(R.id.vehicle_price)
        val mileage = view.findViewById<TextView>(R.id.vehicle_mileage)
        val city = view.findViewById<TextView>(R.id.vehicle_city)
        val state = view.findViewById<TextView>(R.id.vehicle_state)
        val callButton = view.findViewById<Button>(R.id.call_dealer_button)
    }

}