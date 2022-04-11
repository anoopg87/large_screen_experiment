package com.example.twopanetest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.twopanetest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.open.setOnClickListener {
            binding.slidingLayout.open()
        }
    }

    override fun onBackPressed() {
        if(binding.slidingLayout.isOpen && binding.slidingLayout.isSlideable) {
            binding.slidingLayout.close()
            return
        }
        super.onBackPressed()
    }
}