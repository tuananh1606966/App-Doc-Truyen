package com.nghiemtuananh.baitapappdoctruyent3h

import java.io.Serializable

data class ItemTopic(var topic: String, var listStory: MutableList<ItemStory>): Serializable
