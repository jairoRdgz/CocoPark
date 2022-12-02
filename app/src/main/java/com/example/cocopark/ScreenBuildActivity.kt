package com.example.cocopark

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cocopark.databinding.ActivityScreenBuildBinding

class ScreenBuildActivity : AppCompatActivity() {
    private lateinit var binding: ActivityScreenBuildBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityScreenBuildBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.edicioaBtn.setOnClickListener{
            startActivity(Intent(this, ABuildingActivity::class.java));
            println("Presiono go A");
        }

        binding.ediciobBtn.setOnClickListener{
            startActivity(Intent(this, ABuildingActivity::class.java));
            println("Presiono go B ");
        }

        binding.ediciocBtn.setOnClickListener{
            startActivity(Intent(this, ABuildingActivity::class.java));
            println("Presiono go C");
        }

        binding.ediciodBtn.setOnClickListener{
            startActivity(Intent(this, ABuildingActivity::class.java));
            println("Presiono go D");
        }
    }
}