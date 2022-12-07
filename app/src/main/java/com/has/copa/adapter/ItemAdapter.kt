package com.has.copa.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.has.copa.R
import com.has.copa.model.escalacao

class ItemAdapter(
    private val context: Context,
    private val dataset: List<escalacao>
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
    class ItemViewHolder(private val view: View):
        RecyclerView.ViewHolder(view) {
        val textView: TextView =
            view.findViewById(R.id.item_title)
        val imageView: ImageView =
            view.findViewById(R.id.item_image)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
// create a new view
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.item, parent, false)
        return ItemViewHolder(adapterLayout)
    }
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringResourceId)
    }
    override fun getItemCount() = dataset.size

}