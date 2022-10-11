package com.example.numl_frag

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.numl_frag.databinding.FragmentNextProgramFragmetBinding


class nextProgramFragmet : Fragment(R.layout.fragment_next_program_fragmet) {
    private lateinit var _binding:FragmentNextProgramFragmetBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding= FragmentNextProgramFragmetBinding.bind(view)
    }

}