package com.example.carfax_technical_assignment.model

data class Vehicle(
    var dealer: Dealer?,
    var images: Photos?,
    var year: String?,
    var make: String?,
    var model: String?,
    var trim: String?,
    var vin: String?,
    var mileage: Int?,
    var currentPrice: Double?,
    var exteriorColor: String?,
    var interiorColor: String?,
    var engine: String?,
    var drivetype: String?,
    var transmission: String?,
    var bodytype: String?,
)

data class Dealer(
    var city: String?,
    var phone: String?,
    var state: String?
)

data class Photos(
    var firstPhoto: Photo?
)

data class Photo(
    var large: String?
)
