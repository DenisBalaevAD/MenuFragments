package com.example.menufragments

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager

class Navigation(private val supportFragmentManager: FragmentManager) {
    fun navigation(fragment:Int,fragmentClass: Fragment){
        supportFragmentManager.beginTransaction()
            .add(fragment, fragmentClass, null)
            .commit()
    }
}