package com.example.numl_frag.ui.apply.admissionform.acadamiaform.acadamic_record

import androidx.lifecycle.ViewModel
import com.example.numl_frag.model.baObject
import com.example.numl_frag.model.fscObject
import com.example.numl_frag.model.maObject
import com.example.numl_frag.model.matricObject
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
@HiltViewModel
class AddRecordVM @Inject constructor() : ViewModel() {
    private val matric: matricObject?=null
    private lateinit var fsc:fscObject
    private lateinit var ba:baObject
    private lateinit var ma:maObject

    fun onClickedMatric(
        Degree_Matric: String,
        Board_Matric: String,
        Passing_Year_Matric: String,
        Roll_Number_Matric: String,
        Total_Marks_Matric: String,
        Obtained_Marks_Matric: String,
        Matric_Percentage: String
    ) {
        matric?.Degree_Matric = Degree_Matric
        matric?.Board_Matric = Board_Matric
        matric?.Passing_Year_Matric = Passing_Year_Matric
        matric?.Roll_Number_Matric = Roll_Number_Matric
        matric?.Total_Marks_Matric = Total_Marks_Matric
        matric?.Obtained_Marks_Matric = Obtained_Marks_Matric
        matric?.Matric_Percentage = Matric_Percentage
    }

    fun onClickedFsc(
        Degree_Intermediate: String,
        Board_Intermediate: String,
        Passing_Year_Intermediate: String,
        Roll_Number_Intermediate: String,
        Total_Marks_Intermediate: String,
        Obtained_Marks_Intermediate: String,
        Intermediate_Percentage: String,
        Result_Awaiting: String
    ) {
        fsc.Degree_Intermediate=Degree_Intermediate
        fsc.Board_Intermediate=Board_Intermediate
        fsc.Passing_Year_Intermediate=Passing_Year_Intermediate
        fsc.Roll_Number_Intermediate=Roll_Number_Intermediate
        fsc.Total_Marks_Intermediate=Total_Marks_Intermediate
        fsc.Obtained_Marks_Intermediate=Obtained_Marks_Intermediate
        fsc.Intermediate_Percentage=Intermediate_Percentage
        fsc.Result_Awaiting=Result_Awaiting
    }

    fun onClickBA(
        Degree_BA: String,
        Board_BA: String,
        Passing_Year_BA: String,
        Roll_Number_BA: String,
        Total_Marks_BA: String,
        Obtained_Marks_BA: String
    ) {
        ba.Degree_BA=Degree_BA
        ba.Board_BA=Board_BA
        ba.Passing_Year_BA=Passing_Year_BA
        ba.Roll_Number_BA=Roll_Number_BA
        ba.Total_Marks_BA=Total_Marks_BA
        ba.Obtained_Marks_BA=Obtained_Marks_BA
    }

    fun onClickMA(
        Degree_MA: String,
        Board_MA: String,
        Passing_Year_MA: String,
        Roll_Number_MA: String,
        Total_Marks_MA: String,
        Obtained_Marks_MA: String
    ) {
        ma.Degree_MA=Degree_MA
        ma.Board_MA=Board_MA
        ma.Passing_Year_MA=Passing_Year_MA
        ma.Roll_Number_MA=Roll_Number_MA
        ma.Total_Marks_MA=Total_Marks_MA
        ma.Obtained_Marks_MA=Obtained_Marks_MA
    }

}