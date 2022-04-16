package com.teambo.kolberempahriah.ui.home.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.teambo.kolberempahriah.R
import com.teambo.kolberempahriah.databinding.ItemListMateriHomeBinding

class MateriListAdapter(private val materiHomeListener: MateriHomeListener) : RecyclerView.Adapter<MateriListAdapter.ListViewHolder>() {

    private var materiList = ArrayList<String>()

    fun setData(data: List<String>?) {
        if (data == null) return
        materiList.clear()
        materiList.addAll(data)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder =
        ListViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_list_materi_home, parent, false)
        )

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val data = materiList[position]
        holder.bind(data)
        holder.itemView.setOnClickListener {
            materiHomeListener.onMateriItemClick(data)
        }
    }

    override fun getItemCount(): Int = materiList.size

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val binding = ItemListMateriHomeBinding.bind(itemView)
        fun bind(title: String) {
            binding.tvTitleMateriListHome.text = title
        }

    }
}