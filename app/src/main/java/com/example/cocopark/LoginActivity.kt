package com.example.cocopark

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cocopark.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.noTengoBtn.setOnClickListener{
            startActivity(Intent(this, RegisterActivity::class.java));
            println("Presiono No tengo");
        }

        binding.loginBtn2.setOnClickListener{
            startActivity(Intent(this, ParkingScreenActivity::class.java));
            println("Presiono No tengo");
        }
    }
}