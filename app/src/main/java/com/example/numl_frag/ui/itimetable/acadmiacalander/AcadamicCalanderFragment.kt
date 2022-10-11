package com.example.numl_frag.ui.itimetable.acadmiacalander

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.numl_frag.R
import com.example.numl_frag.databinding.FragmentAcadamicCalanderBinding

class AcadamicCalanderFragment : Fragment(R.layout.fragment_acadamic_calander) {
    private lateinit var _binding:FragmentAcadamicCalanderBinding
    private val binding get() = _binding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding= FragmentAcadamicCalanderBinding.bind(view)
        navFrag()
    }
    private fun navFrag(){
        binding.apply {
            btnBack.setOnClickListener {
                findNavController().navigateUp()
            }
        }
    }
}