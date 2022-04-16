package com.teambo.kolberempahriah.ui.home.video

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.teambo.kolberempahriah.R
import com.teambo.kolberempahriah.databinding.ItemVideoListBinding
import com.teambo.kolberempahriah.model.DataModel
import com.teambo.kolberempahriah.model.VideoDataModel
import com.teambo.kolberempahriah.ui.video.VideoListActivity

class ListAdapter : RecyclerView.Adapter<ListAdapter.ListViewHolder>() {

    private var listData = ArrayList<VideoDataModel>()
    private var listImage = ArrayList<Int>()

    fun setData(data: List<VideoDataModel>?) {
        if (data == null) return
        listData.clear()
        listData.addAll(data)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListAdapter.ListViewHolder =
        ListViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_video_list, parent, false)
        )

    override fun onBindViewHolder(holder: ListAdapter.ListViewHolder, position: Int) {
        val model = listData[position]
        holder.bind(model)
    }

    override fun getItemCount(): Int = listData.size

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val binding = ItemVideoListBinding.bind(itemView)
        fun bind(data: VideoDataModel) {
            binding.tvRekomendasiVideoMatematika.text = data.title

            val adapter = VideoListAdapter()
            adapter.setData(data.img)

            binding.rvRekomendasiVideo.layoutManager = LinearLayoutManager(itemView.context, LinearLayoutManager.HORIZONTAL, false)
            binding.rvRekomendasiVideo.setHasFixedSize(true)
            binding.rvRekomendasiVideo.adapter = adapter

            binding.llMore.setOnClickListener {
                val intent = Intent(itemView.context, VideoListActivity::class.java)
                intent.putExtra(VideoListActivity.EXTRA_DATA, data.title)
                itemView.context.startActivity(intent)
            }

//            binding.itemTv.text = data.itemText
//            val isExpandable = data.isExpandable
//            binding.expandableLayout.visibility = if (isExpandable) View.VISIBLE else View.GONE
//            if (isExpandable) {
//                binding.arroImageview.setImageResource(R.drawable.ic_arrow_drop_up)
//            } else {
//                binding.arroImageview.setImageResource(R.drawable.ic_arrow_down)
//            }
//
//            val adapter = NestedMateriListAdapter()
//            adapter.setData(list)
//
//            binding.childRv.layoutManager = LinearLayoutManager(itemView.context)
//            binding.childRv.setHasFixedSize(true)
//            binding.childRv.adapter = adapter
//            binding.linearLayout.setOnClickListener {
//                data.isExpandable = !data.isExpandable
//                list.clear()
//                list.addAll(data.nestedList)
//                notifyItemChanged(absoluteAdapterPosition)
//            }
        }
    }
}