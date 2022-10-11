package com.example.numl_frag.ui.apply.admissionform.programform

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.numl_frag.model.ProgramRecord
import com.example.numl_frag.repository.AdmissionRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ProgramVM @Inject constructor(private val repository: AdmissionRepository) : ViewModel() {
    fun onBtnClicked(
        campus: String,
        faculty: String,
        program: String,
        shift: String,
        programSec: String,
        shiftSec: String
    ) {
        viewModelScope.launch{
           repository.insertProgram(
               ProgramRecord(
                   campus = campus,
                   faculty = faculty,
                   program = program,
                   shift = shift,
                   programSecond = programSec,
                   shiftSecond = shiftSec
               )
           )
        }
    }
}