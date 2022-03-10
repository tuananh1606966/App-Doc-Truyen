package com.nghiemtuananh.baitapappdoctruyent3h

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TopicAdapter(var context: MainActivity, var listTopic: MutableList<ItemTopic>): RecyclerView.Adapter<TopicAdapter.TopicViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TopicViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.dong_topic, parent, false)
        return TopicViewHolder(view)
    }

    override fun onBindViewHolder(holder: TopicViewHolder, position: Int) {
        var topic = listTopic.get(position)
        holder.titleTopic.setText(topic.topic)
        holder.itemView.setOnClickListener {
            var intent = Intent(context , ListStoryActivity::class.java)
            intent.putExtra("liststory", topic)
            context.startActivity(intent)
        }
        var animation = AnimationUtils.loadAnimation(context, R.anim.translate_alpha_list)
        holder.itemView.startAnimation(animation)
    }

    override fun getItemCount(): Int {
        return listTopic.size
    }

    inner class TopicViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var titleTopic: TextView
        init {
            titleTopic = itemView.findViewById(R.id.tv_title_topic)
        }
    }
}