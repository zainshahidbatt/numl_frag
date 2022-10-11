package com.example.numl_frag.ui.apply.admissionform.upload_documents

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.numl_frag.R
import com.example.numl_frag.databinding.FragmentUploadDocBinding


class UploadDocFragment : Fragment(R.layout.fragment_upload_doc) {
    private lateinit var _binding: FragmentUploadDocBinding
    private val binding get() = _binding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentUploadDocBinding.bind(view)
    }

//    private fun componentView(){
//        binding.apply {
//            DocumentComponent(
//                binding = binding.cvCinc,
//                title = "CINC/Form-B",
//            )
//        }
//    }
}