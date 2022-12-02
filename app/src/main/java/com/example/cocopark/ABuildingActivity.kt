package com.example.cocopark

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cocopark.databinding.ActivityAbuildingBinding

class ABuildingActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAbuildingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAbuildingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backBtn.setOnClickListener{
            startActivity(Intent(this, ScreenBuildActivity::class.java));
            println("Presiono No tengo");
        }
    }
}