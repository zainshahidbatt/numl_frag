package com.example.numl_frag.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Acadamic_Table")
class AcadamicRecord(
    @PrimaryKey(autoGenerate = true)
    val id:Int?=null,
    //MATRIC DETAILS
    var Degree_Matric:String?=null,
    var Board_Matric:String?=null,
    var Passing_Year_Matric:String?=null,
    var Roll_Number_Matric:String?= null,
    var Total_Marks_Matric:String?=null,
    var Obtained_Marks_Matric:String?=null,
    var Matric_Percentage:String="0%",
    //INTERMEDIATE DETAILS
    var Degree_Intermediate:String?=null,
    var Board_Intermediate:String?=null,
    var Passing_Year_Intermediate:String?=null,
    var Roll_Number_Intermediate:String?= null,
    var Total_Marks_Intermediate:String?=null,
    var Obtained_Marks_Intermediate:String?=null,
    var Intermediate_Percentage:String="0%",
    var Result_Awaiting:String?="NO",
    //BA/BSC OR EQUILENT DETAILS
    var Degree_BA:String?=null,
    var Board_BA:String?=null,
    var Passing_Year_BA:String?=null,
    var Roll_Number_BA:String?= null,
    var Total_Marks_BA:String?=null,
    var Obtained_Marks_BA:String?=null,
    //MA/MSC OR EQUILENT
    var Degree_MA:String?=null,
    var Board_MA:String?=null,
    var Passing_Year_MA:String?=null,
    var Roll_Number_MA:String?= null,
    var Total_Marks_MA:String?=null,
    var Obtained_Marks_MA:String?=null,
)