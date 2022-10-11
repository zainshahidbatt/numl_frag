package com.example.numl_frag.ui.feestucture

import android.net.Uri
import androidx.lifecycle.ViewModel
import com.example.numl_frag.repository.AdmissionRepository
import javax.inject.Inject

class FeeStuctureVM @Inject constructor(private val repository: AdmissionRepository):ViewModel(){
fun onBtnClick(){
    val path = Uri.parse("android.resource://com.example.numl_frag/raw/fee_stucture.pdf")
}

}