package com.example.cocopark

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cocopark.databinding.ActivitySuccesfullBinding

class SuccesfullActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySuccesfullBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySuccesfullBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.chuloBtn.setOnClickListener{
                startActivity(Intent(this, ParkingScreenActivity::class.java));
                println("Presiono chulo");
        }
    }
}