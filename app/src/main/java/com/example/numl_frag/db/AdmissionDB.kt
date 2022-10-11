package com.example.numl_frag.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.numl_frag.model.AcadamicRecord
import com.example.numl_frag.model.PersonalRecord
import com.example.numl_frag.model.ProgramRecord

@Database(entities = [ProgramRecord::class,PersonalRecord::class,AcadamicRecord::class], version = 1)
abstract class AdmissionDB :RoomDatabase(){
    abstract fun admissionDao():AdmissionDao
}