package com.teambo.kolberempahriah.ui.materi.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.recyclerview.widget.GridLayoutManager
import com.teambo.kolberempahriah.R
import com.teambo.kolberempahriah.databinding.ActivityDetailMateriBinding
import com.teambo.kolberempahriah.model.YoutubeModel
import com.teambo.kolberempahriah.ui.video.VideoListActivityAdapter
import com.teambo.kolberempahriah.utils.DataDummy

class DetailMateriActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_TITLE = "extra_title"
    }

    private lateinit var binding: ActivityDetailMateriBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailMateriBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = intent.getStringExtra(EXTRA_TITLE)

        val title = intent.getStringExtra(EXTRA_TITLE)
        val listAdapter = VideoListActivityAdapter()
        if (title == "Bilangan cacah" || title == "Satuan Panjang dan Waktu" || title == "Bangun Ruang" || title == "Bangun Datar" || title == "Satuan Berat") {
            listAdapter.setData(
                DataDummy.generateBAB1()
            )
        } else if (title == "Penjumlahan" || title == "Pengurangan" || title == "Pembagian" || title == "Perkalian" ) {
            listAdapter.setData(
                DataDummy.generateBAB2()
            )
        }

        with(binding.rvVideoListActivity) {
            layoutManager = GridLayoutManager(context, 2)
            setHasFixedSize(true)
            adapter = listAdapter
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            finish()
        }
        return super.onOptionsItemSelected(item)
    }
}