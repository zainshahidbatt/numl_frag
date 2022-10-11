package com.example.numl_frag.ui.feestucture

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.numl_frag.R
import com.example.numl_frag.databinding.FragmentFeeStuctureBinding


class FeeStuctureFragment : Fragment(R.layout.fragment_fee_stucture) {
    private lateinit var _binding: FragmentFeeStuctureBinding
    private val binding get() = _binding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentFeeStuctureBinding.bind(view)
        navFag()
    }

    private fun navFag() {
        binding.apply {
            btnBack.setOnClickListener{
            findNavController().navigateUp()
            }
        }
    }
}