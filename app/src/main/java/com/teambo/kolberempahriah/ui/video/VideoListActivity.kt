package com.teambo.kolberempahriah.ui.video

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.teambo.kolberempahriah.R
import com.teambo.kolberempahriah.databinding.ActivityVideoListBinding
import com.teambo.kolberempahriah.utils.DataDummy

class VideoListActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_DATA = "extra_data"
    }

    private lateinit var binding: ActivityVideoListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityVideoListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (intent.getStringExtra(EXTRA_DATA) != null) {
            supportActionBar?.title = intent.getStringExtra(EXTRA_DATA)
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
        }

        val rvAdapter = VideoListActivityAdapter()
        rvAdapter.setData(
            DataDummy.generateYoutubeList()
        )

        with(binding.rvVideoListActivity) {
            layoutManager = GridLayoutManager(context, 2)
            setHasFixedSize(true)
            adapter = rvAdapter
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            finish()
        }
        return super.onOptionsItemSelected(item)
    }
}