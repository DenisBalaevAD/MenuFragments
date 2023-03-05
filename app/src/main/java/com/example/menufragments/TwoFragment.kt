package com.example.menufragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.menufragments.databinding.FragmentTwoBinding

class TwoFragment : Fragment() {

    lateinit var binding: FragmentTwoBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentTwoBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding.root.setOnClickListener {
            Toast.makeText(context,"click 2",Toast.LENGTH_LONG).show()
        }
    }
}