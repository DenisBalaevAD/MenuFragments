package com.example.menufragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.menufragments.databinding.ActivityMainBinding
import com.example.menufragments.databinding.FragmentOneBinding


class OneFragment : Fragment() {

    lateinit var binding:FragmentOneBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = FragmentOneBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.btn.setOnClickListener {
            val activity = view.context as MainActivity
            activity.binding.fragmentContainerView2.visibility = View.VISIBLE
            activity.supportFragmentManager.beginTransaction()
                .replace(activity.binding.fragmentContainerView2.id, TwoFragment())
                .commit();
        }
    }

}