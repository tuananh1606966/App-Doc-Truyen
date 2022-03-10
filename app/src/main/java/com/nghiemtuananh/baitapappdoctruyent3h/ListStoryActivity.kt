package com.nghiemtuananh.baitapappdoctruyent3h

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_list_story.*

class ListStoryActivity : AppCompatActivity() {
    lateinit var adapter: ItemAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_story)
        var itemTopic: ItemTopic = intent.getSerializableExtra("liststory") as ItemTopic
        tv_title_topic_list.setText(itemTopic.topic)
        rcv_topic_list.layoutManager = LinearLayoutManager(this)
        adapter = ItemAdapter(this, itemTopic.listStory)
        rcv_topic_list.adapter = adapter
    }
}