package com.geektech.sixmonthfirtstproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.geektech.sixmonthfirtstproject.databinding.ActivityMainBinding
import com.geektech.sixmonthfirtstproject.fragments.HistoryFragment
import com.geektech.sixmonthfirtstproject.fragments.HomeFragment
import com.geektech.sixmonthfirtstproject.fragments.ResultFragment
import com.geektech.sixmonthfirtstproject.pagerAdapter.pagerAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel

    private val fragmentList = arrayOf(HistoryFragment(), HomeFragment(), ResultFragment())
    private val fragmetTitles = listOf("Первый", "Второй", "Третий")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        val adapter = pagerAdapter(this, fragmentList)
        binding.viewPager.adapter = adapter
        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab: TabLayout.Tab, i: Int ->
            tab.text = fragmetTitles[i]
        }.attach()
    }

}

