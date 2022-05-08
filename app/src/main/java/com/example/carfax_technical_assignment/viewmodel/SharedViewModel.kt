package com.example.carfax_technical_assignment.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.carfax_technical_assignment.model.Vehicle

class SharedViewModel : ViewModel() {
    private val _selectedVehicleItem = MutableLiveData<Vehicle>()
    var selectedVehicleItem: LiveData<Vehicle> = _selectedVehicleItem

    fun passSelectedVehicleItem(vehicle: Vehicle) {
        _selectedVehicleItem.value = vehicle
        selectedVehicleItem = _selectedVehicleItem
    }
}