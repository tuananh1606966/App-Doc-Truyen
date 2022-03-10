package com.nghiemtuananh.baitapappdoctruyent3h

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_story.*

class StoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_story)
        var itemStory: ItemStory = intent.getSerializableExtra("itemStory") as ItemStory
        Glide.with(this)
            .load(itemStory.urlImage)
            .placeholder(R.drawable.loading)
            .error(R.drawable.error_image)
            .into(iv_story_1)
        tv_title_story_1.setText(itemStory.title)
        tv_content_story_1.setText(itemStory.content)
        var animation = AnimationUtils.loadAnimation(this, R.anim.translate_alpha_list)
        ll_story.startAnimation(animation)
    }
}