package com.example.numl_frag.ui.apply.admissionform.submitapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.numl_frag.R
import com.example.numl_frag.databinding.FragmentSubmitionBinding

class SubmitionFragment : Fragment(R.layout.fragment_submition) {
    private lateinit var _binding:FragmentSubmitionBinding
    private val binding get() = _binding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding= FragmentSubmitionBinding.bind(view)
    }

}