package com.example.composeimageapp.model.api

import com.example.composeimageapp.BuildConfig
import com.example.composeimageapp.model.response.UnsplashImage
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Headers

@OptIn(ExperimentalSerializationApi::class)
class UnplashWebService {

    private lateinit var api: UnspalshApi
    val contentType = "application/json".toMediaType()
    val json = Json {
        ignoreUnknownKeys = true
        explicitNulls = false
    }

    init {
        val retrofit = Retrofit
            .Builder()
            .baseUrl("https://api.unsplash.com")
            .addConverterFactory(json.asConverterFactory(contentType))
            .build()
        api = retrofit.create(UnspalshApi::class.java)
    }

    suspend fun getPhotos(): List<UnsplashImage> {
        return api.getPhotoResponse()
    }

    interface UnspalshApi {
        @Headers("Authorization: Client-ID ${BuildConfig.API_KEY}")
        @GET("/photos")
        suspend fun getPhotoResponse(): List<UnsplashImage>
    }
}