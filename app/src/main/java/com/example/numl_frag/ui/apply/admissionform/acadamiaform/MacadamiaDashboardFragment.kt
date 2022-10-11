package com.example.numl_frag.ui.apply.admissionform.acadamiaform

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.numl_frag.R
import com.example.numl_frag.databinding.FragmentAcadmaicDashboardBinding
import com.example.numl_frag.model.baObject
import com.example.numl_frag.model.fscObject
import com.example.numl_frag.model.maObject
import com.example.numl_frag.model.matricObject
import com.example.numl_frag.ui.apply.admissionform.acadamiaform.components.AcadamicComponent
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MacadamiaDashboardFragment : Fragment(R.layout.fragment_acadmaic_dashboard) {
    private lateinit var _binding: FragmentAcadmaicDashboardBinding
    private val binding get() = _binding

    private val matric: matricObject? = null
    private var fsc: fscObject?=null
    private lateinit var ba: baObject
    private lateinit var ma: maObject
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentAcadmaicDashboardBinding.bind(view)
        cardComponent()
        navFrag()
    }

    fun navFrag() {
        binding.apply {
            btnBack.setOnClickListener {
                findNavController().navigateUp()
            }
            matricCard.root.setOnClickListener {
                findNavController().navigate(MacadamiaDashboardFragmentDirections.actionAcadmaicDashboardFragmentToAddRecordFragment("Matric"))
            }
            fscCard.root.setOnClickListener {
                findNavController().navigate(MacadamiaDashboardFragmentDirections.actionAcadmaicDashboardFragmentToAddRecordFragment("Fsc"))
            }
            baCard.root.setOnClickListener {
                findNavController().navigate(MacadamiaDashboardFragmentDirections.actionAcadmaicDashboardFragmentToAddRecordFragment("Ba"))
            }
            mscCard.root.setOnClickListener {
                findNavController().navigate(MacadamiaDashboardFragmentDirections.actionAcadmaicDashboardFragmentToAddRecordFragment("Ma"))
            }
            btnNext.setOnClickListener {
                findNavController().navigate(MacadamiaDashboardFragmentDirections.actionAcadmaicDashboardFragmentToUploadDocFragment())
            }
        }
    }

    private fun cardComponent() {
        AcadamicComponent(
            binding = binding.matricCard,
            title = "Matric/Equilent",
            percentage = matric?.Matric_Percentage.toString(),
            status = "Incomplete"
        )
        AcadamicComponent(
            binding = binding.fscCard,
            title = "Fsc/Equilent",
            percentage = fsc?.Intermediate_Percentage.toString(),
            status = "Incomplete"
        )

        AcadamicComponent(
            binding = binding.baCard,
            title = "BA/(14 years)",
            percentage = "0%",
            status = "Incomplete"
        )
        AcadamicComponent(
            binding = binding.mscCard,
            title = "Msc/BS/(16 Years)",
            percentage = "0%",
            status = "Incomplete"
        )

    }
}