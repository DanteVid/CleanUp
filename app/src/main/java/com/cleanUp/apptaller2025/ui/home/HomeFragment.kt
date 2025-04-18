package com.cleanUp.apptaller2025.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.cleanUp.apptaller2025.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root



        //-------------------------------------------------------



        binding.buttonLogin.setOnClickListener{
            val nombre = binding.editTextText.text.toString();
            val toast = Toast.makeText(context, "Bienvenido" + nombre, Toast.LENGTH_SHORT)
            toast.show()
        }

        //-------------------------------------------------------


        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}