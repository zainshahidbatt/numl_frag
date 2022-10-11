package com.example.numl_frag.ui.dashboard.components

import com.example.numl_frag.databinding.DashboardComponentBinding

class DashBoardComponent(
    binding:DashboardComponentBinding,
    title:String
){
    init {
        binding.apply {
            tvTitle.text = title
        }
    }

}