package com.teambo.kolberempahriah.ui.home.video

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.teambo.kolberempahriah.R
import com.teambo.kolberempahriah.databinding.FragmentVideoBinding
import com.teambo.kolberempahriah.utils.DataDummy

class VideoFragment : Fragment(R.layout.fragment_video) {

    private val binding: FragmentVideoBinding by viewBinding()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (activity != null) {
            val videoAdapter = ListAdapter()
            videoAdapter.setData(
                DataDummy.generateVideoListData()
            )

            with(binding.rvVideoDataList) {
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                adapter = videoAdapter
            }
        }
    }
}
//        val dashboardViewModel =
//            ViewModelProvider(this).get(VideoViewModel::class.java)
//
////        val textView: TextView = binding.textDashboard
////        dashboardViewModel.text.observe(viewLifecycleOwner) {
////            textView.text = it
////        }