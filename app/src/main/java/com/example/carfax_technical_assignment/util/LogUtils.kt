package com.example.carfax_technical_assignment.util

import timber.log.Timber

object LogUtils {

    fun log(message: String, value: Any? = "") {
        Timber.d(message, value)
    }
}