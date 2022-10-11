package com.example.numl_frag.ui.apply.admissionform.personalform

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.numl_frag.model.PersonalRecord
import com.example.numl_frag.repository.AdmissionRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PersonalVM @Inject constructor(private val repository: AdmissionRepository) : ViewModel() {
    fun onBtnClicked(
        Full_Name: String,
        CINC_Number: String,
        Date_Of_Birth: String,
        Gender: String,
        Blood_Group: String,
        Relationship_Status: String,
        Cell_Number: String,
        Residence_Number: String,
        Nationality: String,
        Country: String,
        Province: String,
        District: String,
        Tehsil: String,
        Domicel: String,
        Present_Address: String,
        Permanent_Address: String,
        Father_Name: String,
        Father_Annual_Income: String,
        Father_Profession: String,
        First_Persons: String,
        Disease: String,
        Disease_Description: String
    ) {
        viewModelScope.launch {
            repository.insertPersonal(
            PersonalRecord(
                Full_Name = Full_Name,
                CINC_Number = CINC_Number,
                Date_Of_Birth = Date_Of_Birth,
                Gender = Gender,
                Blood_Group = Blood_Group,
                Relationship_Status = Relationship_Status,
                Cell_Number = Cell_Number,
                Residence_Number = Residence_Number,
                Nationality = Nationality,
                Country = Country,
                Province = Province,
                District = District,
                Tehsil = Tehsil,
                Domicel = Domicel,
                Present_Address = Present_Address,
                Permanent_Address = Permanent_Address,
                Father_Name = Father_Name,
                Father_Annual_Income = Father_Annual_Income,
                Father_Profession = Father_Profession,
                First_Persons = First_Persons,
                Disease = Disease,
                Disease_Description = Disease_Description
            )
            )
        }
    }
}