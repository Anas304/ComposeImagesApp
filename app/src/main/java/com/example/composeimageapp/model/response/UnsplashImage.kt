package com.example.composeimageapp.model.response

import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable


@Serializable
data class UnsplashImage( val id: String, val description: String?, val urls: Urls )
/* @Serializable
 data class UnsplashUser(
     val name: String,
     val username: String
 ) {
     val attributionUrl get() = "https://unsplash.com/$username?utm_source=ComposeImageApp&utm_medium=referral"
 }*/
