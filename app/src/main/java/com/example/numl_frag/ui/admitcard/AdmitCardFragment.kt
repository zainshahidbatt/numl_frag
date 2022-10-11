package com.example.numl_frag.ui.admitcard

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.numl_frag.R
import com.example.numl_frag.databinding.FragmentAdmitCardBinding


class AdmitCardFragment : Fragment(R.layout.fragment_admit_card) {
    private lateinit var _binding:FragmentAdmitCardBinding
    private val binding get() = _binding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding= FragmentAdmitCardBinding.bind(view)
        navFrag()
    }
private fun navFrag(){
binding.btnBack.setOnClickListener{
    findNavController().navigateUp()
}
}
}