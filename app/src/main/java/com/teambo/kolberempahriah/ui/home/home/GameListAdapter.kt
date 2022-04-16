package com.teambo.kolberempahriah.ui.home.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.teambo.kolberempahriah.R
import com.teambo.kolberempahriah.databinding.ItemGameListHomeBinding
import com.teambo.kolberempahriah.domain.game.GameList

class GameListAdapter : RecyclerView.Adapter<GameListAdapter.ListViewHolder>() {

    private var gameList = ArrayList<GameList>()

    fun setData(data: List<GameList>?) {
        if (data == null) return
        gameList.clear()
        gameList.addAll(data)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ListViewHolder = ListViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_game_list_home, parent, false)
    )

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val data = gameList[position]
        holder.bind(data)
    }

    override fun getItemCount(): Int = gameList.size

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val binding = ItemGameListHomeBinding.bind(itemView)
        fun bind(data: GameList) {
            with(binding) {
                Glide.with(itemView.context)
                    .load(data.image)
                    .transform(RoundedCorners(32))
                    .into(imgThumbnailGameListHome)
                tvTitleMateriListHome.text = data.title
            }
        }
    }
}