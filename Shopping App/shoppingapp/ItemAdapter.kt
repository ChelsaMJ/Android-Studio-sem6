package com.example.shoppingapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import android.widget.ImageView

class ItemAdapter(private val items: List<Item>) :
    RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemImage: ImageView = itemView.findViewById(R.id.itemImage)
        val itemName: TextView = itemView.findViewById(R.id.itemName)
        val itemRatingBar: RatingBar = itemView.findViewById(R.id.itemRatingBar)
        val itemRatingText: TextView = itemView.findViewById(R.id.itemRatingText)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_view, parent, false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val currentItem = items[position]
        holder.itemImage.setImageResource(currentItem.imageResId)
        holder.itemName.text = currentItem.name

        // Set Rating
        holder.itemRatingBar.setOnRatingBarChangeListener { _, rating, _ ->
            holder.itemRatingText.text = "Rating: $rating"
        }
    }

    override fun getItemCount() = items.size
}
