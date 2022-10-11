package com.example.numl_frag.ui.apply.admissionform.uploadchallan

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.numl_frag.R
import com.example.numl_frag.databinding.FragmentUploadDocBinding


class UploadChallanFragment : Fragment(R.layout.fragment_upload_challan) {
    private lateinit var _binding:FragmentUploadDocBinding
    private val binding get() = _binding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding= FragmentUploadDocBinding.bind(view)
    }

}