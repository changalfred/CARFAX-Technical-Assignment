package com.example.carfax_technical_assignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.carfax_technical_assignment.ui.MainFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .add(R.id.main_container, MainFragment())
                .commit()
        }
    }
}