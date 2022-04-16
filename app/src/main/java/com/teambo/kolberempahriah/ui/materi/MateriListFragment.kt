package com.teambo.kolberempahriah.ui.materi

import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.teambo.kolberempahriah.R
import com.teambo.kolberempahriah.databinding.FragmentMateriListBinding
import com.teambo.kolberempahriah.utils.DataDummy

class MateriListFragment : Fragment(R.layout.fragment_materi_list) {

    private val binding: FragmentMateriListBinding by viewBinding()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (activity != null) {

            binding.rvListMateri.setHasFixedSize(true)
            binding.rvListMateri.layoutManager = LinearLayoutManager(context)

            val dataList = DataDummy.generateMateriKelas1()
            val adapter = MateriListAdapter()
            adapter.setData(dataList)
            binding.rvListMateri.adapter = adapter
        }
    }
}