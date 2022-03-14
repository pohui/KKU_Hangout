package com.example.hangout.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hangout.data.Place
import com.example.hangout.databinding.RecyclerviewItemsPlaceBinding

class PlaceAdapter(private val placeList: List<Place>)
    :RecyclerView.Adapter<PlaceAdapter.PlaceViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlaceViewHolder {
        return PlaceViewHolder(
            RecyclerviewItemsPlaceBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: PlaceViewHolder, position: Int) {
        holder.bindItem(placeList[position])
    }

    override fun getItemCount(): Int {
        return placeList.size
    }

    inner class PlaceViewHolder(private val itemsBinding: RecyclerviewItemsPlaceBinding)
        :RecyclerView.ViewHolder(itemsBinding.root) {
        fun bindItem(place: Place) {
            itemsBinding.PlaceTitle.text = place.title
            itemsBinding.PlaceRating.text = place.rating
            itemsBinding.PlaceDesc.text = place.desc
        }
    }

}