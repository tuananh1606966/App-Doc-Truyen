package com.nghiemtuananh.baitapappdoctruyent3h

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class ItemAdapter(var context: ListStoryActivity, var listStory: MutableList<ItemStory>): RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        var view = LayoutInflater.from(context).inflate(R.layout.dong_story, parent, false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        var itemStory = listStory.get(position)
        holder.txtTitle.setText(itemStory.title)
        holder.txtContent.setText(itemStory.content)

        Glide.with(context)
            .load(itemStory.urlImage)
            .placeholder(R.drawable.loading)
            .error(R.drawable.error_image)
            .into(holder.imgHinh)

        holder.itemView.setOnClickListener {
            var intent = Intent(context, StoryActivity::class.java)
            intent.putExtra("itemStory", itemStory)
            context.startActivity(intent)
        }
        var animation = AnimationUtils.loadAnimation(context, R.anim.scale_list)
        holder.itemView.startAnimation(animation)
    }

    override fun getItemCount(): Int {
        return listStory.size
    }

    inner class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgHinh: ImageView
        var txtTitle: TextView
        var txtContent: TextView

        init {
            imgHinh = itemView.findViewById(R.id.iv_story)
            txtTitle = itemView.findViewById(R.id.tv_title_story)
            txtContent = itemView.findViewById(R.id.tv_content_story)
        }
    }
}