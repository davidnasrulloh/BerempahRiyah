package com.teambo.kolberempahriah.ui.home.home

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.teambo.kolberempahriah.R
import com.teambo.kolberempahriah.databinding.FragmentHomeBinding
import com.teambo.kolberempahriah.domain.game.GameList
import com.teambo.kolberempahriah.ui.materi.MateriActivity
import com.teambo.kolberempahriah.utils.DataDummy

class HomeFragment : Fragment(R.layout.fragment_home), MateriHomeListener {

    private val binding: FragmentHomeBinding by viewBinding()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (activity != null) {

            // Video List
            val videoListAdapter = VideoListAdapter()
            videoListAdapter.setData(
                DataDummy.generateYoutubeList()
            )

            with(binding.rvYtListHome) {
                layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
                setHasFixedSize(true)
                adapter = videoListAdapter
            }

            // Game List
            val gameListAdapter = GameListAdapter()
            gameListAdapter.setData(
                listOf(
                    GameList(R.drawable.img_penjumlahan, "Penjumlahan"),
                    GameList(R.drawable.img_pengurangan, "Pengurangan"),
                    GameList(R.drawable.img_perkalian, "Perkalian"),
                    GameList(R.drawable.img_pembagian, "Addition")
                )
            )

            with(binding.rvGameListHome) {
                layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
                setHasFixedSize(true)
                adapter = gameListAdapter
            }

            // Materi List
            val materiListAdapter = MateriListAdapter(this)
            materiListAdapter.setData(
                listOf(
                    "Kelas 1",
                    "Kelas 2",
                    "Kelas 3",
                    "Kelas 4",
                    "Kelas 5",
                    "Kelas 6"
                )
            )

            with(binding.rvListMateriHome) {
                layoutManager = GridLayoutManager(context, 2)
                setHasFixedSize(true)
                adapter = materiListAdapter
            }
        }

    }

    override fun onMateriItemClick(kelas: String) {
        val intent = Intent(context, MateriActivity::class.java)
        intent.putExtra(MateriActivity.EXTRA_KELAS, kelas)
        context?.startActivity(intent)
    }
}