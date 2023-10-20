package com.example.tugas6_pppb_pertemuan_8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.tugas6_pppb_pertemuan_8.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding) {
            viewPager.adapter = TabAdapter(supportFragmentManager)
            // Hubungkan ViewPager dengan TabLayout
            tabLayout.setupWithViewPager(viewPager)
            }
        }
    }



