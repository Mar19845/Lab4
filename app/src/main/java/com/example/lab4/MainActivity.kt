package com.example.lab4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.databinding.DataBindingUtil





class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("MainActivity", "onCreate Called")

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.FavButton.setOnClickListener {
            if (binding.Nombre.visibility == View.VISIBLE) {
                binding.PosNombre.visibility = View.VISIBLE
                binding.PosNombre.text = binding.infoNombre.text.toString()
                binding.infoNombre.visibility = View.INVISIBLE
                binding.Nombre.visibility = View.INVISIBLE
            } else {
                if (binding.Nombre.visibility == View.INVISIBLE) {
                    binding.PosNombre.visibility = View.INVISIBLE
                    binding.infoNombre.visibility = View.VISIBLE
                    binding.Nombre.visibility = View.VISIBLE
                    binding.PosNombre.text = binding.infoNombre.text.toString()
                }
            }
        }
    }
}

