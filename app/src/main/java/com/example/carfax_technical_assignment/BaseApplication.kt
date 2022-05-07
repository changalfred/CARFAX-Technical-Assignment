package com.example.carfax_technical_assignment

import android.app.Application
import timber.log.Timber

class BaseApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        Timber.plant(Timber.DebugTree())
    }
}