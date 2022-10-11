package com.example.numl_frag.ui.apply.admissionform.acadamiaform.acadamic_record

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.numl_frag.R
import com.example.numl_frag.databinding.FragmentAddRecordBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AddRecordFragment : Fragment(R.layout.fragment_add_record) {
    private lateinit var _binding: FragmentAddRecordBinding
    private val binding get() = _binding
    private val args:AddRecordFragmentArgs by navArgs()
    private val viewModel by viewModels<AddRecordVM>()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentAddRecordBinding.bind(view)
        navFrag()
    }

    private fun navFrag() {
        binding.apply {
            btnAdd.setOnClickListener {
                if (obtainedMarks.text.toString().toInt()<=edTotalMarks.text.toString().toInt()) {
                    val percentage:Int=obtainedMarks.text.toString().toInt()/edTotalMarks.text.toString().toInt()*100
                    if (args.resultType == "Matric") {
                        viewModel.onClickedMatric(
                            edDegree.text.toString(),
                            edBoard.text.toString(),
                            edYear.text.toString(),
                            rollNumber.text.toString(),
                            edTotalMarks.text.toString(),
                            obtainedMarks.text.toString(),
                            "$percentage%"
                        )
                        findNavController().navigate(AddRecordFragmentDirections.actionAddRecordFragmentToAcadmaicDashboardFragment())
                    }
                }
            }
            btnBack.setOnClickListener {
                findNavController().navigateUp()
            }
        }
    }
}