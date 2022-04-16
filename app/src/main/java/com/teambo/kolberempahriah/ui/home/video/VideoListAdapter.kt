package com.teambo.kolberempahriah.ui.home.video

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.teambo.kolberempahriah.R
import com.teambo.kolberempahriah.databinding.ItemYtListVideoOnlyBinding

class VideoListAdapter : RecyclerView.Adapter<VideoListAdapter.ListViewHolder>() {

    private var listImage = ArrayList<Int>()

    fun setData(data: List<Int>?) {
        if (data == null) return
        listImage.clear()
        listImage.addAll(data)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VideoListAdapter.ListViewHolder =
        ListViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_yt_list_video_only, parent, false)
        )

    override fun onBindViewHolder(holder: VideoListAdapter.ListViewHolder, position: Int) {
        val model = listImage[position]
        holder.bind(model)
    }

    override fun getItemCount(): Int = listImage.size

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val binding = ItemYtListVideoOnlyBinding.bind(itemView)
        fun bind(data: Int) {
            Glide.with(itemView.context)
                .load(data)
                .into(binding.imgThumbnailYt)
        }
    }
}