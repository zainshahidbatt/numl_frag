package com.example.numl_frag.ui.dashboard

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.numl_frag.R
import com.example.numl_frag.adapter.DashAdapter
import com.example.numl_frag.databinding.FragmentDashBoardBinding
import com.example.numl_frag.model.ItemsViewModel
import com.example.numl_frag.ui.dashboard.components.DashBoardComponent
import com.example.numl_frag.ui.offeredprograms.programs_dashboard.OfferedProgramsFragmentDirections
import com.example.numl_frag.utilis.recyleclick.RecyclerItemClickListenr

class DashBoardFragment : Fragment(R.layout.fragment_dash_board) {
    private lateinit var _binding: FragmentDashBoardBinding
    private val binding get() = _binding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentDashBoardBinding.bind(view)
        navFrag()
        makeView()

    }




    private fun navFrag() {
        binding.apply {
            recyclerview.addOnItemTouchListener(
                RecyclerItemClickListenr(
                    requireActivity(),
                    recyclerview,
                    object : RecyclerItemClickListenr.OnItemClickListener {

                        override fun onItemClick(view: View, position: Int) {
                            if (position==0){
                                findNavController().navigate(DashBoardFragmentDirections.actionDashBoardFragmentToFragmentApplyDashboard())
                            }
                            if (position==1){

                            }
                            if (position==2){

                            }
                            if (position==3){
                                findNavController().navigate(DashBoardFragmentDirections.actionDashBoardFragmentToAdmissionCriteriaFragment())
                            }
                            if (position==4){
                                findNavController().navigate(DashBoardFragmentDirections.actionDashBoardFragmentToAdmitCardFragment())
                            }
                            if (position==5){
                                findNavController().navigate(DashBoardFragmentDirections.actionDashBoardFragmentToMeritListFragment())
                            }
                            if (position==6){
                                findNavController().navigate(DashBoardFragmentDirections.actionDashBoardFragmentToFeeStuctureFragment())
                            }
                            if (position==7){
                                findNavController().navigate(DashBoardFragmentDirections.actionDashBoardFragmentToOfferedProgramsFragment())
                            }
                            if (position==8){
                                findNavController().navigate(DashBoardFragmentDirections.actionDashBoardFragmentToImportantDateFragment())
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
                    R.drawable.forward,
                    "Apply"
                )
            )
            data.add(
                ItemsViewModel(
                    R.drawable.forward,
                    "My Application"
                )
            )
            data.add(
                ItemsViewModel(
                    R.drawable.forward,
                    "Application Preview"
                )
            )
            data.add(
                ItemsViewModel(
                    R.drawable.forward,
                    "Admission Criteria"
                )
            )
            data.add(
                ItemsViewModel(
                    R.drawable.forward,
                    "Admit Card"
                )
            )
            data.add(
                ItemsViewModel(
                    R.drawable.forward,
                    "Merit List"
                )

            )
            data.add(
                ItemsViewModel(
                    R.drawable.forward,
                    "Fee Stucture"
                )
            )
            data.add(
                ItemsViewModel(
                    R.drawable.forward,
                    "Offered Program"
                )
            )
            data.add(
                ItemsViewModel(
                    R.drawable.forward,
                    "Important Dates"
                )
            )
            val adapter = DashAdapter(data)
            recyclerview.adapter = adapter
        }

    }

}