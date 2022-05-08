package com.example.carfax_technical_assignment.adapters

import android.content.Context
import android.service.autofill.Dataset
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.carfax_technical_assignment.R
import com.example.carfax_technical_assignment.model.Vehicle
import com.example.carfax_technical_assignment.util.LogUtils
import com.google.android.material.snackbar.Snackbar

class VehicleAdapter(val context: Context) : RecyclerView.Adapter<VehicleAdapter.ViewHolder>() {

    private var vehicleDataset: MutableList<Vehicle> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.vehicle_row_item, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val vehicle = vehicleDataset[position]
        println("Vehicle: $vehicle")

        val image = holder.image
        Glide.with(context)
            .load(vehicle.images?.firstPhoto?.large)
//            .placeholder(R.color.white)
            .into(image)

        val year = holder.year
        year.text = vehicle.year

        val make = holder.make
        make.text = vehicle.make

        val model = holder.model
        model.text = vehicle.model

        val trim = holder.trim
        trim.text = vehicle.trim

        val price = holder.price
        price.text = vehicle.currentPrice.toString()

        val mileage = holder.mileage
        mileage.text = vehicle.mileage.toString()

        val city = holder.city
        city.text = vehicle.dealer?.city

        val state = holder.state
        state.text = vehicle.dealer?.state

        val callButton = holder.callButton
        val dealerNumber = vehicle.dealer?.phone
        callButton.setOnClickListener {
            Snackbar.make(it, "Replace with call action.", Snackbar.LENGTH_SHORT)
                .show()
        }
    }

    override fun getItemCount(): Int {
        return vehicleDataset.size
    }

    fun setDataset(dataset: MutableList<Vehicle>) {
        vehicleDataset = dataset
        notifyDataSetChanged()
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