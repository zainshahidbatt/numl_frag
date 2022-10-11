package com.example.numl_frag.ui.itimetable.importantdates

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.numl_frag.R
import com.example.numl_frag.databinding.FragmentImportantDateBinding
import com.example.numl_frag.ui.itimetable.importantdates.components.DateComponent

class ImportantDateFragment : Fragment(R.layout.fragment_important_date) {
    private lateinit var _binding: FragmentImportantDateBinding
    private val binding get() = _binding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding= FragmentImportantDateBinding.bind(view)
        navFag()
        cardComponent()
    }

    private fun navFag() {
        binding.apply {
            btnBack.setOnClickListener {
                findNavController().navigateUp()
            }
            cvCalander.root.setOnClickListener {
                findNavController().navigate(ImportantDateFragmentDirections.actionImportantDateFragmentToAcadamicCalanderFragment())
            }
        }
    }

    private fun cardComponent() {
        DateComponent(
            binding = binding.cvCalander,
            regDate = "12/12/2022",
            testDate = "12/12/2022",
            interDate = "12/12/2022",
            meritDate = "12/12/2022",
            classDate = "12/12/2022",

            )
    }
}