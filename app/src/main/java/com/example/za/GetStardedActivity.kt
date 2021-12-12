package com.example.za

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.za.databinding.ActivityGetStardedBinding

class GetStardedActivity : AppCompatActivity() {
    lateinit var binding: ActivityGetStardedBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGetStardedBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.GetStartedButtion.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
