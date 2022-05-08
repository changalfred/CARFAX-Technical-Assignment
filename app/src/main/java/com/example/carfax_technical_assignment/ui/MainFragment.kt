package com.example.carfax_technical_assignment.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.carfax_technical_assignment.R
import com.example.carfax_technical_assignment.adapters.VehicleAdapter
import com.example.carfax_technical_assignment.model.Vehicle
import com.example.carfax_technical_assignment.model.VehiclesResult
import com.example.carfax_technical_assignment.objects.RetrofitService
import com.example.carfax_technical_assignment.util.LogUtils
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainFragment : Fragment() {

    lateinit var apiClient: RetrofitService

    var vehicleDataset: MutableList<Vehicle> = mutableListOf()
    var adapter: VehicleAdapter? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        activity?.setTitle(R.string.company_name)

        val rootView = inflater.inflate(R.layout.fragment_main, container, false)

        apiClient = RetrofitService.create()

        val recyclerView = rootView.findViewById<RecyclerView>(R.id.recyclerview_car_items)
        recyclerView.layoutManager = LinearLayoutManager(context)
        adapter = VehicleAdapter(requireContext())
        recyclerView.adapter = adapter
        recyclerView.setHasFixedSize(true)

        getVehiclesFromNetwork()

        return rootView
    }

    private fun getVehiclesFromNetwork() {
        val vehiclesResponse = apiClient.getVehicles()
        vehiclesResponse.enqueue(object : Callback<VehiclesResult> {
            override fun onResponse(call: Call<VehiclesResult>, response: Response<VehiclesResult>) {
                val jsonResult = response.body()
                if (jsonResult != null) {
                    for (vehicle in jsonResult.listings) {
                        vehicleDataset.add(vehicle)
                    }
                    adapter?.setDataset(vehicleDataset)
                }
            }

            override fun onFailure(call: Call<VehiclesResult>, t: Throwable) {
                LogUtils.log("Network error: %s", t.message)
            }
        })
    }
}