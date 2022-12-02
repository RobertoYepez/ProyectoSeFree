package com.example.proyectosefree


import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.DatePicker
import android.widget.DatePicker.OnDateChangedListener
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.example.proyectosefree.databinding.ActivityMovimientosBinding


class ActivityMovimientos : AppCompatActivity() {
    lateinit var binding: ActivityMovimientosBinding



    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMovimientosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var etDates = binding.etdate
        var dpDates = binding.dpFecha



        etDates.setText(getDatePicker())



        dpDates.setOnDateChangedListener { dpDates, year, month, day ->
            etDates.setText(getDatePicker())
            dpDates.visibility = View.GONE


        }

    }

    fun getDatePicker(): String {

        var day = binding.dpFecha .dayOfMonth.toString().padStart(2, '0')
        var month = (binding.dpFecha.month + 1).toString().padStart(2, '0')
        var year = binding.dpFecha.year.toString().padStart(4, '0')
        return day + "/" + month + "/" + year
    }

    fun showCalendary(view: View) {

        binding.dpFecha.visibility = View.VISIBLE
    }

}


