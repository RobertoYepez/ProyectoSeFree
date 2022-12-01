package com.example.proyectosefree

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.proyectosefree.databinding.ActivityMainBinding
import com.example.proyectosefree.databinding.ActivityMovimientosBinding

class ActivityMovimientos : AppCompatActivity() {
    lateinit var binding : ActivityMovimientosBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMovimientosBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}