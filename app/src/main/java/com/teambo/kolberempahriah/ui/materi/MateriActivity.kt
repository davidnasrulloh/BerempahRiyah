package com.teambo.kolberempahriah.ui.materi

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.teambo.kolberempahriah.databinding.ActivityMateriBinding
import com.teambo.kolberempahriah.utils.DataDummy

class MateriActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_KELAS = "extra_kelas"
    }

    private lateinit var binding: ActivityMateriBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMateriBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = intent.getStringExtra(EXTRA_KELAS)

        binding.rvListMateri.setHasFixedSize(true)
        binding.rvListMateri.layoutManager = LinearLayoutManager(this)

        val dataList = DataDummy.generateMateriKelas1()
        val adapter = MateriListAdapter()
        adapter.setData(dataList)
        binding.rvListMateri.adapter = adapter
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            finish()
        }
        return super.onOptionsItemSelected(item)
    }
}