package com.example.rizky.kotlinsub1

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Club(val img: Int?, val nama: String?, val deskripsi: String?): Parcelable