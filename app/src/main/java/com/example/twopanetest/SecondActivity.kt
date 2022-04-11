package com.example.twopanetest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.twopanetest.databinding.ActivitySecondBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigationrail.NavigationRailView

class SecondActivity : AppCompatActivity() {
    lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}