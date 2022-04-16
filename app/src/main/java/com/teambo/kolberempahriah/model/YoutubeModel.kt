package com.teambo.kolberempahriah.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class YoutubeModel(
    val title: String,
    val videoId: String,
    val videoImg: Int
) : Parcelable
