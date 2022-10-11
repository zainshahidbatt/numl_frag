package com.example.numl_frag.model

import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity(tableName = "Personal_Table")
class PersonalRecord(
    @PrimaryKey(autoGenerate = true)
    val id:Int?=null,
    var Full_Name: String? = null,
    var CINC_Number: String? = null,
    var Date_Of_Birth: String? = null,
    var Gender: String? = null,
    var Blood_Group: String? = null,
    var Relationship_Status: String? = null,
    var Cell_Number: String? = null,
    var Residence_Number: String? = null,
    var Nationality: String? = null,
    var Country: String? = null,
    var Province: String? = null,
    var District: String? = null,
    var Tehsil: String? = null,
    var Domicel: String? = null,
    var Present_Address: String? = null,
    var Permanent_Address: String? = null,
    var Father_Name: String? = null,
    var Father_Annual_Income: String? = null,
    var Father_Profession: String? = null,
    var First_Persons: String? = null,
    var Disease: String? = null,
    var Disease_Description: String? = null,
    //var File_Path:String?=null
)