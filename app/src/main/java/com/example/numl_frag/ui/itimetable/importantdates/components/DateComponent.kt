package com.example.numl_frag.ui.itimetable.importantdates.components

import com.example.numl_frag.databinding.CalanderComponentBinding

class DateComponent(
    binding:CalanderComponentBinding,
    regDate:String,
    testDate:String,
    interDate:String,
    meritDate:String,
    classDate:String
) {
    init {
        binding.apply {
            dateReg.text=regDate
            entryDate.text=testDate
            interviewDate.text=interDate
            displayDate.text=meritDate
            startDate.text=classDate
        }
    }
}