package com.gahyeon.android_searchimageapp.data

import com.google.gson.annotations.SerializedName

data class SearchImageData(
    val documents: List<Document>,
    val meta: Meta
)

data class Document(
    val collection: String,
    val datetime: String,
    @SerializedName("display_sitename")
    val displaySitename: String,
    val doc_url: String,
    val height: Int,
    val image_url: String,
    @SerializedName("thumbnail_url")
    val thumbnailUrl: String,
    val width: Int
)

data class Meta(
    val is_end: Boolean,
    val pageable_count: Int,
    val total_count: Int
)