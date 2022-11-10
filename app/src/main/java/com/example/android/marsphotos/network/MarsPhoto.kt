package com.example.android.marsphotos.network

import com.squareup.moshi.Json

/** Kelas data ini mendefinisikan foto Mars yang menyertakan ID, dan URL gambar.
 * Nama properti dari kelas data ini digunakan oleh Moshi untuk mencocokkan nama nilai di JSON.
 */
data class MarsPhoto(
        val id: String,
        // digunakan untuk memetakan img_src dari JSON ke imgSrcUrl
        @Json(name = "img_src") val imgSrcUrl: String
)