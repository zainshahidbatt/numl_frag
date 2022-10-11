package com.example.numl_frag.ui.apply.admissionform

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.numl_frag.R
import com.example.numl_frag.databinding.FragmentInstructionBinding

class InstructionFragment : Fragment(R.layout.fragment_instruction) {
    private lateinit var _binding: FragmentInstructionBinding
    private val binding get() = _binding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentInstructionBinding.bind(view)
        navFrag()
    }

    private fun navFrag() {
        binding.apply {
            btnNext.setOnClickListener {
                findNavController().navigate(InstructionFragmentDirections.actionInstructionFragmentToProgramFormFragment())
            }
        }
    }

}