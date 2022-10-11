package com.example.numl_frag.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Program_Table")
class ProgramRecord(
    @PrimaryKey(autoGenerate = true)
    val id:Int?=null,
    var campus: String ?= null,
    var faculty: String?=null,
    var program: String? =null,
    var shift: String? = null,
    var programSecond: String?=null,
    var shiftSecond: String?=null
)