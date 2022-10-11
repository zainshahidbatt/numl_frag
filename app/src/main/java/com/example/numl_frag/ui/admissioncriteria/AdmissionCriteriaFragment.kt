package com.example.numl_frag.ui.admissioncriteria

import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.numl_frag.R
import com.example.numl_frag.databinding.FragmentAdmissionCriteriaBinding

class AdmissionCriteriaFragment : Fragment(R.layout.fragment_admission_criteria) {
    private lateinit var _binding: FragmentAdmissionCriteriaBinding
    private val binding get() = _binding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentAdmissionCriteriaBinding.bind(view)
        navFrag()
        adaptArray()
        showList()
    }

    private fun navFrag() {
        binding.apply {
            btnBack.setOnClickListener {
                findNavController().navigateUp()
            }
            btnNext.setOnClickListener {
                findNavController().navigate(AdmissionCriteriaFragmentDirections.actionAdmissionCriteriaFragmentToCriteriaResultFragment())
            }
        }
    }

    private fun adaptArray() {
        binding.apply {
            val adapterCampus = ArrayAdapter(
                requireActivity(),
                android.R.layout.simple_spinner_dropdown_item,
                resources.getStringArray(R.array.Campus)
            )
            edCampus.setAdapter(adapterCampus)
            edCampus.threshold = 1
            faculty()
        }
    }

    private fun faculty() {

        binding.apply {
            edCampus.setOnItemClickListener { parent, view, position, id ->
               if (position==0){
                   val adapterMain=ArrayAdapter(requireActivity(),android.R.layout.simple_spinner_dropdown_item,resources.getStringArray(R.array.main_faculties))
                   edFaculty.setAdapter(adapterMain)
               }
                if (position==1){
                    val adapterGawadar=ArrayAdapter(requireActivity(),android.R.layout.simple_spinner_dropdown_item,resources.getStringArray(R.array.gawadar_faculties))
                    edFaculty.setAdapter(adapterGawadar)
                }
                if (position>=2){
                    val adapterFaculties=ArrayAdapter(requireActivity(),android.R.layout.simple_spinner_dropdown_item,resources.getStringArray(R.array.lahore_faculties))
                    edFaculty.setAdapter(adapterFaculties)
            }
            }
        }

    }


    private fun showList() {
        binding.apply {
            edCampus.setOnClickListener {
                edCampus.showDropDown()
            }
            edFaculty.setOnClickListener {
                edFaculty.showDropDown()
            }

        }
    }
}



