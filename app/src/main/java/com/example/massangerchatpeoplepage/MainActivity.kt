package com.example.massangerchatpeoplepage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.massangerchatpeoplepage.fragment.PageOneFragment
import com.example.massangerchatpeoplepage.fragment.PageTwoFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var bottomNavigationView: BottomNavigationView
    private var firstFragment = PageOneFragment()
    private var secondFragment = PageTwoFragment()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()

    }


    private fun initViews() {

        bottomNavigationView = findViewById(R.id.bottom)
        replaceFragment(firstFragment)

        bottomNavigationView.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.home_item -> replaceFragment(firstFragment)
                R.id.setting_item -> replaceFragment(secondFragment)
            }
            true
        }

    }

    private fun replaceFragment(fragment: Fragment) {
        if (fragment != null) {
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.viewpager,fragment)
            transaction.commit()
        }
    }

}