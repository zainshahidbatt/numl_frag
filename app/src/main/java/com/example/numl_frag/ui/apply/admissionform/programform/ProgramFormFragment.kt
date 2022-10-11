package com.example.numl_frag.ui.apply.admissionform.programform

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.numl_frag.R
import com.example.numl_frag.databinding.FragmentProgramFormBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ProgramFormFragment : Fragment(R.layout.fragment_program_form) {
    private lateinit var _binding: FragmentProgramFormBinding
    private val binding get() = _binding
    private val viewModel by viewModels<ProgramVM>()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentProgramFormBinding.bind(view)
        navFrag()

    }


    fun navFrag() {
        binding.apply {
            btnBack.setOnClickListener {
                findNavController().navigateUp()
            }

            btnNext.setOnClickListener {
                if (
                    edCampus.text.toString().isNotEmpty() &&
                    edFaculty.text.toString().isNotEmpty() &&
                    edDegree.text.toString().isNotEmpty() &&
                    edShift.text.toString().isNotEmpty() &&
                    edProgramSec.text.toString().isNotEmpty() &&
                    edShiftSec.text.toString().isNotEmpty()
                ) {
                        viewModel.onBtnClicked(
                            edCampus.text.toString(),
                            edFaculty.text.toString(),
                            edDegree.text.toString(),
                            edShift.text.toString(),
                            edProgramSec.text.toString(),
                            edShiftSec.text.toString()
                        )
                    findNavController().navigate(ProgramFormFragmentDirections.actionProgramFormFragmentToPersonalFormFragment())

                } else {
                    viewModel.onBtnClicked(
                        edCampus.text.toString(),
                        edFaculty.text.toString(),
                        edDegree.text.toString(),
                        edShift.text.toString(),
                        edProgramSec.text.toString(),
                        edShiftSec.text.toString()
                    )
                    findNavController().navigate(ProgramFormFragmentDirections.actionProgramFormFragmentToPersonalFormFragment())
                    Toast.makeText(activity, "Please fill all fields", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}