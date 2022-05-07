package com.example.carfax_technical_assignment.model

import android.widget.ImageView

data class Vehicle(
    var image: ImageView?,
    var year: String?,
    var make: String?,
    var model: String?,
    var trim: String?,
    var price: String?,
    var mileage: String?,
    var city: String?,
    var state: String?
)

data class