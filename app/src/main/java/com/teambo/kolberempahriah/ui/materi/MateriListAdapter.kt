package com.teambo.kolberempahriah.ui.materi

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.teambo.kolberempahriah.R
import com.teambo.kolberempahriah.databinding.ExpandableChildItemBinding
import com.teambo.kolberempahriah.model.DataModel

class MateriListAdapter : RecyclerView.Adapter<MateriListAdapter.MateriViewHolder>() {

    private var materiList = ArrayList<DataModel>()
    private var list = ArrayList<String>()

    fun setData(data: List<DataModel>?) {
        if (data == null) return
        materiList.clear()
        materiList.addAll(data)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MateriViewHolder =
        MateriViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.expandable_child_item, parent, false)
        )

    override fun onBindViewHolder(holder: MateriViewHolder, position: Int) {
        val model = materiList[position]
        holder.bind(model)
    }

    override fun getItemCount(): Int = materiList.size

    inner class MateriViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val binding = ExpandableChildItemBinding.bind(itemView)
        fun bind(data: DataModel) {
            binding.itemTv.text = data.itemText
            val isExpandable = data.isExpandable
            binding.expandableLayout.visibility = if (isExpandable) View.VISIBLE else View.GONE
            if (isExpandable) {
                binding.arroImageview.setImageResource(R.drawable.ic_arrow_drop_up)
            } else {
                binding.arroImageview.setImageResource(R.drawable.ic_arrow_down)
            }

            val adapter = NestedMateriListAdapter()
            adapter.setData(list)

            binding.childRv.layoutManager = LinearLayoutManager(itemView.context)
            binding.childRv.setHasFixedSize(true)
            binding.childRv.adapter = adapter
            binding.linearLayout.setOnClickListener {
                data.isExpandable = !data.isExpandable
                list.clear()
                list.addAll(data.nestedList)
                notifyItemChanged(absoluteAdapterPosition)
            }
        }
    }
}