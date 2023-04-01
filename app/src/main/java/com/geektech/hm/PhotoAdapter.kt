package com.geektech.hm

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.geektech.hm.databinding.PhotoItemBinding

class PhotoAdapter(
    val PhotoList: ArrayList<Photo>,
    val onClick: (position: Int)-> Unit
): Adapter<PhotoAdapter.PhotoViewHolder>() {
    private val selectedPhotos = mutableListOf<Photo>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhotoViewHolder {
        return PhotoViewHolder(
            PhotoItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: PhotoViewHolder, position: Int) {
        holder.bind()
    }

    override fun getItemCount(): Int = selectedPhotos.size

    inner class PhotoViewHolder(private val binding: PhotoItemBinding): ViewHolder(binding.root){
        fun bind() {
            val item = PhotoList[adapterPosition]
//            binding.apply {
//                photoIv.loadImage(item.image)
//            }

//            itemView.setOnClickListener {
//                onClick(adapterPosition)
//                item.isSelected = !item.isSelected
//                if (item.isSelected) {
//                    binding.photoIv.alpha = 0.5f
//                    selectedPhotos.add(item)
//                } else if (selectedPhotos.contains(item)) {
//                    selectedPhotos.remove(item)
//                    binding.photoIv.alpha = 1.0f
//                } else {
//                    binding.photoIv.alpha = 1.0f
//                }
//            }
        }
    }
}