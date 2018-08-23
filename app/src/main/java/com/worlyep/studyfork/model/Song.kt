package com.worlyep.studyfork.model

import com.google.gson.annotations.SerializedName
import com.worlyep.studyfork.constant.KaraokeType

class Song {
    @SerializedName("singer") var singer: String? = null
    @SerializedName("brand") var karaokeTypeType: String? = null
    @SerializedName("no") var code: String? = null
    @SerializedName("title") var title: String? = null
    var isFavorites: Boolean = false
}
