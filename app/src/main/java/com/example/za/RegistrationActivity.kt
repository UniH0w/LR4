package com.example.za

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.za.databinding.ActivityRegistrationBinding

class RegistrationActivity : AppCompatActivity() {
    val validatorEror = Validator()
    lateinit var binding: ActivityRegistrationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityRegistrationBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.RegisterButton.setOnClickListener {
            val email = binding.registerEnterEmail.text.toString()
            val password = binding.registerPasswrord.text.toString()
            val name = binding.registrName.text.toString()
            if (validatorEror.email_all(email) && validatorEror.enterPassword_regestration(password)
            ) {
                val intent = Intent(this, MainActivity::class.java)
                intent.putExtra("Name", name)
                startActivity(intent)
            } else {
                if (!validatorEror.email_all(email)) {
                    binding.registerEnterEmail.error = "Введена не коректная почта"
                }
                if (!validatorEror.enterPassword_regestration(password)) {
                    binding.registerPasswrord.error = "Вы ввели не коректный пароль"
                }
            }
        }
    }
}
