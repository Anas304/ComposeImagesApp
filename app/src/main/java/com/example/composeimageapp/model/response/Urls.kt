package com.example.composeimageapp.model.response

import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable

// I Think this is the Gson data we get from the url.
// We kinda convert it from JSON to a kotlin object with this dataclass
@Serializable
data class Urls(val regular: String )

//@Serializable
//data class Urls(@SerializedName("regular") val regularImage: String = "" )
