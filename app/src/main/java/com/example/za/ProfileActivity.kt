package com.example.za

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.example.za.databinding.ActivityProfileBinding
import com.example.za.fragments.ProfileFragment
import com.example.za.fragments.TasksFragment

class ProfileActivity : AppCompatActivity() {
    lateinit var binding: ActivityProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bottomNavigationView.setOnItemSelectedListener { menuitem->
            when (menuitem.itemId) {
                R.id.profileItemMenu-> {
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.fragmentContainerViewProfile, ProfileFragment())
                        .commit()
                }
                R.id.tasksItemMenu->{
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.fragmentContainerViewProfile, TasksFragment())
                }

            }
            return@setOnItemSelectedListener true
        }
    }
}
