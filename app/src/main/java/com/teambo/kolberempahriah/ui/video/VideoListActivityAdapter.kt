package com.teambo.kolberempahriah.ui.video

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.teambo.kolberempahriah.R
import com.teambo.kolberempahriah.databinding.ItemYtListHomeBinding
import com.teambo.kolberempahriah.model.YoutubeModel
import com.teambo.kolberempahriah.ui.youtubeplay.YoutubePlayerActivity

class VideoListActivityAdapter : RecyclerView.Adapter<VideoListActivityAdapter.ListViewHolder>() {

    private var imageList = ArrayList<YoutubeModel>()

    fun setData(data: List<YoutubeModel>?) {
        if (data == null) return
        imageList.clear()
        imageList.addAll(data)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder =
        ListViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_video_list_activity, parent, false)
        )

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val data = imageList[position]
        holder.bind(data)
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, YoutubePlayerActivity::class.java)
            intent.putExtra(YoutubePlayerActivity.EXTRA_DATA, data.videoId)
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int = imageList.size

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val binding = ItemYtListHomeBinding.bind(itemView)
        fun bind(data: YoutubeModel) {
            with(binding) {
                Glide.with(itemView.context)
                    .load(data.videoImg)
                    .override(200, 150)
                    .transform(RoundedCorners(32))
                    .into(imgThumbnailYt)
                tvTitleYt.text = data.title
            }
        }

    }

}