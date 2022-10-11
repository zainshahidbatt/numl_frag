package com.example.numl_frag.ui.apply.admissionform.acadamiaform.components

import com.example.numl_frag.databinding.AcadamiaCardComponentBinding

class AcadamicComponent(
    binding: AcadamiaCardComponentBinding,
    title: String,
    percentage: String,
    status: String
) {
    init {
        binding.apply {
            tvTitle.text=title
            tvChangAble.text=percentage
            picPng.text=status
        }
    }
}