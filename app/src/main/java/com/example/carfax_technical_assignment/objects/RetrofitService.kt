package com.example.carfax_technical_assignment.objects

import com.example.carfax_technical_assignment.model.VehiclesResult
import com.example.carfax_technical_assignment.util.NetworkUtils
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface RetrofitService {

    @GET("assignment.json")
    fun getVehicles(): Call<VehiclesResult>

    companion object {
        fun create(): RetrofitService {
            val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
                .baseUrl(NetworkUtils.BASE_URL)
                .build()

            return retrofit.create(RetrofitService::class.java)
        }
    }
}