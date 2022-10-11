package com.example.numl_frag.ui.apply.admissionform.upload_documents.uploadcomponent

import androidx.annotation.DrawableRes
import com.example.numl_frag.databinding.DocumentComponentBinding

class DocumentComponent(
    binding: DocumentComponentBinding,
    title: String,
    @DrawableRes img: Int
) {
    init {
        binding.apply {
            tvTitle.text = title
            shapeableImageView.setImageResource(img)
        }
    }
}