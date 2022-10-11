package com.example.numl_frag.ui.apply.admissionform.personalform

import android.app.DatePickerDialog
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.numl_frag.R
import com.example.numl_frag.databinding.FragmentPersonalFormBinding
import dagger.hilt.android.AndroidEntryPoint
import java.text.SimpleDateFormat
import java.util.*

@AndroidEntryPoint
class PersonalFormFragment : Fragment(R.layout.fragment_personal_form) {
    private lateinit var _binding: FragmentPersonalFormBinding
    private val binding get() = _binding
    private var cal: Calendar = Calendar.getInstance()

    private val viewModel by viewModels<PersonalVM>()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentPersonalFormBinding.bind(view)
        navFrag()
        val dateSetListener =
            DatePickerDialog.OnDateSetListener { _, year, monthOfYear, dayOfMonth ->
                cal.set(Calendar.YEAR, year)
                cal.set(Calendar.MONTH, monthOfYear)
                cal.set(Calendar.DAY_OF_MONTH, dayOfMonth)
                updateDateInView()
            }
        binding.buttonDate.setOnClickListener {
            DatePickerDialog(
                requireActivity(),
                dateSetListener,
                // set DatePickerDialog to point to today's date when it loads up
                cal.get(Calendar.YEAR),
                cal.get(Calendar.MONTH),
                cal.get(Calendar.DAY_OF_MONTH)
            ).show()
        }
    }

    private fun uploadData() {
        binding.apply {
            viewModel.onBtnClicked(
                fullName.text.toString(),
                cincNumber.text.toString(),
                binding.dob.text.toString(),
                editGender.text.toString(),
                editBlood.text.toString(),
                editRelation.text.toString(),
                cellNumber.text.toString(),
                residenceNumber.text.toString(),
                editNationality.text.toString(),
                editCountry.text.toString(),
                editProvince.text.toString(),
                editDist.text.toString(),
                editTehsil.text.toString(),
                editDomicel.text.toString(),
                presentAddress.text.toString(),
                permanentAddress.text.toString(),
                fatherName.text.toString(),
                annualIncome.text.toString(),
                jobTitle.text.toString(),
                editFirst.text.toString(),
                editDisease.text.toString(),
                diseaseYes.text.toString()
            )
        }
    }

    private fun updateDateInView() {
        val myFormat = "MM/dd/yyyy" // mention the format you need
        val sdf = SimpleDateFormat(myFormat, Locale.US)
        binding.dob.setText(sdf.format(cal.time))
    }

    private fun navFrag() {
        binding.apply {
            btnBack.setOnClickListener {
                findNavController().navigateUp()
            }

            btnNext.setOnClickListener {
                if (fullName.text.toString().isNotEmpty() &&
                    cincNumber.text.toString().isNotEmpty() &&
                    binding.dob.text.toString().isNotEmpty() &&
                    editGender.text.toString().isNotEmpty() &&
                    editBlood.text.toString().isNotEmpty() &&
                    editRelation.text.toString().isNotEmpty() &&
                    cellNumber.text.toString().isNotEmpty() &&
                    residenceNumber.text.toString().isNotEmpty() &&
                    editNationality.text.toString().isNotEmpty() &&
                    editCountry.text.toString().isNotEmpty() &&
                    editProvince.text.toString().isNotEmpty() &&
                    editDist.text.toString().isNotEmpty() &&
                    editTehsil.text.toString().isNotEmpty() &&
                    editDomicel.text.toString().isNotEmpty() &&
                    presentAddress.text.toString().isNotEmpty() &&
                    permanentAddress.text.toString().isNotEmpty() &&
                    fatherName.text.toString().isNotEmpty() &&
                    annualIncome.text.toString().isNotEmpty() &&
                    jobTitle.text.toString().isNotEmpty() &&
                    editFirst.text.toString().isNotEmpty() &&
                    editDisease.text.toString().isNotEmpty() &&
                    diseaseYes.text.toString().isNotEmpty()
                ) {
                    findNavController().navigate(PersonalFormFragmentDirections.actionPersonalFormFragmentToAcadmaicDashboardFragment())
                    uploadData()
                } else {
                    findNavController().navigate(PersonalFormFragmentDirections.actionPersonalFormFragmentToAcadmaicDashboardFragment())
                    uploadData()
                    Toast.makeText(activity, "Please Fill all forms", Toast.LENGTH_SHORT).show()
                }
            }

        }
    }
}