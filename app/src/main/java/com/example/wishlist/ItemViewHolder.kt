package com.example.wishlist

import android.content.ClipData
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(item: Item) {
        val nameTextView: TextView = itemView.findViewById(R.id.nameTextView)
        val priceTextView: TextView = itemView.findViewById(R.id.priceTextView)
        val urlTextView: TextView = itemView.findViewById(R.id.urlTextView)

        nameTextView.text = item.name
        priceTextView.text = "$${item.price}"
        urlTextView.text = item.url
    }

}
