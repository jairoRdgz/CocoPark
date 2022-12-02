package com.example.cocopark

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cocopark.databinding.ActivityParkingScreenBinding

class ParkingScreenActivity : AppCompatActivity() {

    private lateinit var binding: ActivityParkingScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityParkingScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.goBtn.setOnClickListener{
            startActivity(Intent(this, ScreenBuildActivity::class.java));
            println("Presiono go");
        }
    }
}