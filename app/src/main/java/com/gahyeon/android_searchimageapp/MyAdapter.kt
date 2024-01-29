package com.gahyeon.android_searchimageapp

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gahyeon.android_searchimageapp.data.Document
import com.gahyeon.android_searchimageapp.databinding.ItemRecyclerviewBinding

class MyAdapter(val dataList: MutableList<Document>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    inner class MyViewHolder(val binding: ItemRecyclerviewBinding) : RecyclerView.ViewHolder(binding.root) {
        val thumbnailUrl = binding.thumbnailUrl
        val displaySitename = binding.displaySitename
        val datetime = binding.datetime
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding = ItemRecyclerviewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        Log.d("myAdapter", "onCreateViewHolder()")
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        Log.d("myAdapter", "onBindViewHolder()  position = $position")
        // holder.thumbnailUrl
        holder.displaySitename.text = dataList[position].thumbnailUrl
        holder.datetime.text = dataList[position].datetime
    }

    override fun getItemCount() = dataList.size


}