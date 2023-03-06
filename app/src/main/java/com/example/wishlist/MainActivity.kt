package com.example.wishlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var itemRecyclerView: RecyclerView
    private lateinit var itemAdapter: ItemAdapter
    private lateinit var itemList: MutableList<Item>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        itemList = mutableListOf()
        itemAdapter = ItemAdapter(itemList)

        itemRecyclerView = findViewById(R.id.itemRecyclerView)
        itemRecyclerView.layoutManager = LinearLayoutManager(this)
        itemRecyclerView.adapter = itemAdapter
    }

    fun addItem(view: View) {
        val nameEditText = findViewById<EditText>(R.id.nameEditText)
        val priceEditText = findViewById<EditText>(R.id.priceEditText)
        val urlEditText = findViewById<EditText>(R.id.urlEditText)

        val name = nameEditText.text.toString()
        val price = priceEditText.text.toString().toDouble()
        val url = urlEditText.text.toString()

        val newItem = Item(name, price, url)
        itemList.add(newItem)
        itemAdapter.notifyItemInserted(itemList.size - 1)

        nameEditText.text.clear()
        priceEditText.text.clear()
        urlEditText.text.clear()
    }
}
