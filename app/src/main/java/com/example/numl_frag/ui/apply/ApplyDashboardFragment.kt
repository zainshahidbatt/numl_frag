package com.example.numl_frag.ui.apply

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.numl_frag.R
import com.example.numl_frag.databinding.FragmentApplyDashboardBinding
import com.example.numl_frag.ui.dashboard.components.DashBoardComponent
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ApplyDashboardFragment : Fragment(R.layout.fragment_apply_dashboard) {
    private lateinit var _binding: FragmentApplyDashboardBinding
    private val binding get() = _binding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentApplyDashboardBinding.bind(view)
        cardView()
        onBack()
    }

    private fun cardView() {
        DashBoardComponent(
            binding = binding.cvAdmission,
            title = "Regular Admission"
        )

    }

    private fun onBack() {
        binding.apply {
            btnBack.setOnClickListener {
                findNavController().navigateUp()
            }
            cvAdmission.root.setOnClickListener {
                findNavController().navigate(ApplyDashboardFragmentDirections.actionFragmentApplyDashboardToInstructionFragment())
            }
        }
    }
}