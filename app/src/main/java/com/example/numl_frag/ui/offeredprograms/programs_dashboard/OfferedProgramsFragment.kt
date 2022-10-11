package com.example.numl_frag.ui.offeredprograms.programs_dashboard

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.numl_frag.R
import com.example.numl_frag.databinding.FragmentOfferedProgramsBinding
import com.example.numl_frag.adapter.DashAdapter
import com.example.numl_frag.model.ItemsViewModel
import com.example.numl_frag.utilis.recyleclick.RecyclerItemClickListenr


class OfferedProgramsFragment : Fragment(R.layout.fragment_offered_programs) {
    private lateinit var _binding: FragmentOfferedProgramsBinding
    private val binding get() = _binding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentOfferedProgramsBinding.bind(view)

        navFrag()
        makeView()
    }

    fun navFrag() {
        binding.apply {
            btnBack.setOnClickListener {
                findNavController().navigateUp()
            }

            recyclerview.addOnItemTouchListener(
                RecyclerItemClickListenr(
                    requireActivity(),
                    recyclerview,
                    object : RecyclerItemClickListenr.OnItemClickListener {

                        override fun onItemClick(view: View, position: Int) {
                            if (position==1){
                                findNavController().navigate(OfferedProgramsFragmentDirections.actionOfferedProgramsFragmentToNextProgramFragmet())
                            }
                        }

                        override fun onItemLongClick(view: View?, position: Int) {
                            TODO("do nothing")
                        }
                    })
            )
        }
    }

    fun makeView() {
        binding.apply {
            recyclerview.layoutManager =
                LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
            val data = ArrayList<ItemsViewModel>()
            data.add(
                ItemsViewModel(
                    R.drawable.engineer,
                    "Faculty of Engineering and Computer Science"
                )
            )
            data.add(
                ItemsViewModel(
                    R.drawable.language,
                    "Faculty of Languages"
                )
            )
            data.add(
                ItemsViewModel(
                    R.drawable.manag,
                    "Faculty of Management Sciences"
                )
            )
            data.add(
                ItemsViewModel(
                    R.drawable.social,
                    "Faculty of Social Sciences"
                )
            )
            data.add(
                ItemsViewModel(
                    R.drawable.arts,
                    "Faculty of Arts and Humanities"
                )
            )
            data.add(
                ItemsViewModel(
                    R.drawable.inst,
                    "Confucius Institute"
                )
            )
            val adapter = DashAdapter(data)
            recyclerview.adapter = adapter
        }

    }
}