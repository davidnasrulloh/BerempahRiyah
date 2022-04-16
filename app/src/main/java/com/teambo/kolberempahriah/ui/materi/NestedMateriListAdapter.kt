package com.teambo.kolberempahriah.ui.materi

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.teambo.kolberempahriah.R
import com.teambo.kolberempahriah.databinding.ExpandableParentItemBinding
import com.teambo.kolberempahriah.ui.materi.detail.DetailMateriActivity

class NestedMateriListAdapter :
    RecyclerView.Adapter<NestedMateriListAdapter.NestedViewHolder>() {

    private var materiList = ArrayList<String>()

    fun setData(data: List<String>?) {
        if (data == null) return
        materiList.clear()
        materiList.addAll(data)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NestedViewHolder =
        NestedViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.expandable_parent_item, parent, false)
        )

    override fun onBindViewHolder(holder: NestedViewHolder, position: Int) {
        val model = materiList[position]
        holder.bind(model)
    }

    override fun getItemCount(): Int = materiList.size

    inner class NestedViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val binding = ExpandableParentItemBinding.bind(itemView)
        fun bind(title: String) {
            binding.nestedItemTv.text = title
            binding.cardView.setOnClickListener {
                val intent = Intent(itemView.context, DetailMateriActivity::class.java)
                intent.putExtra(DetailMateriActivity.EXTRA_TITLE, binding.nestedItemTv.text.toString())
                itemView.context.startActivity(intent)
            }
        }
    }
}