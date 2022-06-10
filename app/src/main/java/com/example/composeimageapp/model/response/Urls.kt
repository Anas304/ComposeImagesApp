package com.example.composeimageapp.model.response

import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable

/*@Serializable
data class Urls(val regular: String )*/

@Serializable
data class Urls(@SerializedName("regular") val regularImage: String = "" )
