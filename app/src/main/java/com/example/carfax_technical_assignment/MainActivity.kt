package com.example.carfax_technical_assignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.carfax_technical_assignment.adapters.VehicleAdapter
import com.example.carfax_technical_assignment.ui.DetailFragment
import com.example.carfax_technical_assignment.ui.MainFragment

class MainActivity : AppCompatActivity(), ClickHandler {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .add(R.id.main_container, MainFragment())
                .commit()
        }
    }

    override fun onClick(holder: View) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.main_container, DetailFragment(holder))
            .commit()
    }
}