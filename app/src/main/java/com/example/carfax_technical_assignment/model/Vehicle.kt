package com.example.carfax_technical_assignment.model

import android.widget.ImageView

class Vehicle(
    var image: ImageView?,
    var year: String?,
    var make: String?,
    var model: String?,
    var trim: String?,
    var price: String?,
    var mileage: String?,
    var city: String?,
    var state: String?
) {
    fun createVehiclesList(vehiclesCount: Int): Array<Vehicle> {
        val vehicles = emptyArray<Vehicle>()

        for (i in 1..vehiclesCount) {
            vehicles[i] = Vehicle(
                image,
                year,
                make,
                model,
                trim,
                price,
                mileage,
                city,
                state
            )
        }

        return vehicles
    }
}