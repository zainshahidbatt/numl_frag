package com.example.numl_frag.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.numl_frag.model.AcadamicRecord
import com.example.numl_frag.model.PersonalRecord
import com.example.numl_frag.model.ProgramRecord
import kotlinx.coroutines.flow.Flow


@Dao
interface AdmissionDao {
    //Program Details Queries
    @Query("SELECT * FROM Program_Table")
    fun getProgramRecord(): Flow<List<ProgramRecord>>

    @Insert
    suspend fun insertProgram(programRecord: ProgramRecord)

    @Update
    suspend fun updateProgram(programRecord: ProgramRecord)

    //Personal Information Queries
    @Query("SELECT * FROM Personal_Table")
    fun getPersonalRecord(): Flow<List<PersonalRecord>>

    @Insert
    suspend fun insertPersonal(personalRecord: PersonalRecord)

    @Update
    suspend fun updatePersonal(personalRecord: PersonalRecord)

    @Query("SELECT * FROM Acadamic_Table")
    fun getAcadamicRecord(): Flow<List<AcadamicRecord>>

    @Insert
    suspend fun insertAcadamic(acadamicRecord: AcadamicRecord)

    @Update
    suspend fun updateAcadamic(acadamicRecord: AcadamicRecord)
}