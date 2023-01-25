package com.example.student.ui.favourite

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.student.databinding.ItemFavRecBinding
import com.example.student.databinding.ItemUnlikeRecBinding
import com.example.student.model.datamodel.FavouriteRecord

class FavouriteAdaptor(private val fav_records:List<FavouriteRecord>) : RecyclerView.Adapter<FavouriteAdaptor.FavViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FavViewHolder {
        return FavouriteAdaptor.FavViewHolder(ItemFavRecBinding.inflate(LayoutInflater.from(parent.context),parent,false))

    }

    override fun onBindViewHolder(holder: FavViewHolder, position: Int) {
        val fav_records = fav_records.get(position)
        holder.binding.tvFavName.text = fav_records.name

        if (fav_records.isFav)
            holder.binding.ivFavIcon.visibility = View.GONE
    }

    override fun getItemCount(): Int {
        return fav_records.size
    }
    class FavViewHolder(val binding: ItemFavRecBinding): RecyclerView.ViewHolder(binding.root)
    class UnlikeViewHolder(val binding:ItemUnlikeRecBinding): RecyclerView.ViewHolder(binding.root)
}