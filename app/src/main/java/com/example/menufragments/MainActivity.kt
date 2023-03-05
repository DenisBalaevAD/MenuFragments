package com.example.menufragments

import android.opengl.Visibility
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.View
import android.widget.Button
import android.widget.PopupMenu
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.menufragments.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    lateinit var binding:ActivityMainBinding
     var fragmentTwoHost:Int = 0
    var view = View.VISIBLE

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fragmentOneHost = binding.fragmentContainerView.id
        fragmentTwoHost = binding.fragmentContainerView2.id

        navigation(fragmentOneHost,OneFragment())

        binding.root.setOnClickListener {
            if(binding.fragmentContainerView2.visibility == View.VISIBLE) {
                binding.fragmentContainerView2.visibility = View.GONE
                return@setOnClickListener
            }

            if(binding.fragmentContainerView.visibility == View.VISIBLE) {
                binding.fragmentContainerView.visibility = View.GONE
                return@setOnClickListener
            }
        }

        binding.btn.setOnClickListener {
            binding.fragmentContainerView.visibility = View.VISIBLE
        }
        //showPopupMenu()
        //showPopupMenu()
    }

    fun navigation(fragment:Int,fragmentClass:Fragment){
        supportFragmentManager.beginTransaction().apply {
            replace(fragment, fragmentClass)
            commit()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(
            R.menu.pop,menu
        )
        return true
    }
}