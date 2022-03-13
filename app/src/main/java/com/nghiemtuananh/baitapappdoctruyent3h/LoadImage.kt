package com.nghiemtuananh.baitapappdoctruyent3h

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

object LoadImage {
    @JvmStatic
    @BindingAdapter("imageUrl")
    fun loadImageGlide(imageView: ImageView, url: String) {
        Glide.with(imageView.context)
            .load(url)
            .error(R.drawable.error_image)
            .placeholder(R.drawable.loading)
            .into(imageView)
    }
}