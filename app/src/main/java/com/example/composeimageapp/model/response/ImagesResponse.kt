package com.example.composeimageapp.model.response

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize



data class UnsplashResponse(val listUnsplash : List<UnpslashSingleResponse>)

@Parcelize
data class UnpslashSingleResponse(
    val id: String,
    val description: String?,
    val urls : UnSplashPhotoUrls,
    val user : UnsplashUser
) : Parcelable {

    @Parcelize
    data class UnSplashPhotoUrls(
        val raw: String,
        val full: String,
        val regular: String,
        val small: String,
        val thumb: String,
    ) : Parcelable

    @Parcelize
    data class UnsplashUser(
        val name: String,
        val username: String
    ) : Parcelable {
        val attributionUrl get() = "https://unsplash.com/$username?utm_source=ComposeImageApp&utm_medium=referral"
    }



}