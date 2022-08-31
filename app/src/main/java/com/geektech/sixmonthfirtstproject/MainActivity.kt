package com.geektech.sixmonthfirtstproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.geektech.sixmonthfirtstproject.databinding.ActivityMainBinding
import com.geektech.sixmonthfirtstproject.fragments.HistoryFragment
import com.geektech.sixmonthfirtstproject.fragments.HomeFragment
import com.geektech.sixmonthfirtstproject.fragments.ResultFragment
import com.geektech.sixmonthfirtstproject.pagerAdapter.pagerAdapter


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel

    private val fragmentList= arrayOf(HistoryFragment(),HomeFragment(),ResultFragment())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        val adapter = pagerAdapter(this, fragmentList)
        binding.viewPager.adapter = adapter



    }

}