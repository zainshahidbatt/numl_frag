package com.example.numl_frag.ui.meritlist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.numl_frag.R
import com.example.numl_frag.databinding.FragmentDashBoardBinding
import com.example.numl_frag.databinding.FragmentMeritListBinding

class MeritListFragment : Fragment(R.layout.fragment_merit_list) {
    private lateinit var _binding:FragmentMeritListBinding
    private val binding get() = _binding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding= FragmentMeritListBinding.bind(view)
    }

}