package com.example.numl_frag.repository

import com.example.numl_frag.db.AdmissionDao
import com.example.numl_frag.model.AcadamicRecord
import com.example.numl_frag.model.PersonalRecord
import com.example.numl_frag.model.ProgramRecord
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class AdmissionRepository @Inject constructor(private val admissionDao: AdmissionDao) {

    //program form repos
    fun getProgram(): Flow<List<ProgramRecord>> {
        return admissionDao.getProgramRecord()
    }

    suspend fun insertProgram(programRecord: ProgramRecord) {
        admissionDao.insertProgram(programRecord)
    }

    suspend fun updateProgram(programRecord: ProgramRecord) {
        admissionDao.updateProgram(programRecord)
    }

    //acadamic form repos
    fun getAcadamic(): Flow<List<AcadamicRecord>> {
        return admissionDao.getAcadamicRecord()
    }

    suspend fun insertAcadamic(acadamicRecord: AcadamicRecord) {
        admissionDao.insertAcadamic(acadamicRecord)
    }

    suspend fun updateAcadamic(acadamicRecord: AcadamicRecord) {
        admissionDao.updateAcadamic(acadamicRecord)
    }

    //personal info form repos
    fun getPersonal(): Flow<List<PersonalRecord>> {
        return admissionDao.getPersonalRecord()
    }

    suspend fun insertPersonal(personalRecord: PersonalRecord) {
        admissionDao.insertPersonal(personalRecord)
    }

    suspend fun updatePersonal(personalRecord: PersonalRecord) {
        admissionDao.updatePersonal(personalRecord)
    }
}