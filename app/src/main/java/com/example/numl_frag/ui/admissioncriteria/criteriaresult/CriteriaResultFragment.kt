package com.example.numl_frag.ui.admissioncriteria.criteriaresult

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.numl_frag.R
import com.example.numl_frag.databinding.FragmentCriteriaResultBinding

class CriteriaResultFragment : Fragment(R.layout.fragment_criteria_result) {
    private lateinit var _binding:FragmentCriteriaResultBinding
    private val binding get() = _binding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding= FragmentCriteriaResultBinding.bind(view)
        navFrag()
    }

    private fun navFrag() {
        binding.apply {
            btnBack.setOnClickListener {
                findNavController().navigateUp()
            }
        }
    }

}