package com.example.composeimageapp.model.response

import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable

// This works
//@Serializable
//data class UnsplashImage( val id: String, val description: String?, val urls: Urls)

// I think this is describing the values we get from the serialised JSON URL -
// Here we define wich values we want to use in our app
@Serializable
data class UnsplashImage( val id: String, val description: String?, val urls: Urls, val likes: Int)


/* @Serializable
 data class UnsplashUser(
     val name: String,
     val username: String
 ) {
     val attributionUrl get() = "https://unsplash.com/$username?utm_source=ComposeImageApp&utm_medium=referral"
 }*/
