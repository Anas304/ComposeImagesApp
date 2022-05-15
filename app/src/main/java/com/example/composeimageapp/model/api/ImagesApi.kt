package com.example.composeimageapp.model.api

import com.example.composeimageapp.model.response.UnsplashResponse
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

class UnplashWebService {

    private lateinit var api: UnspalshApi

    companion object{
        const val CLIENT_ID = "7SuF5qAkLFcn2navxYJ8AveQakOBTH5dZvfkXI6uM70"
    }

    init {
        val retrofit = Retrofit
            .Builder()
            .baseUrl("https://api.unsplash.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        api = retrofit.create(UnspalshApi::class.java)
    }

    suspend fun getPhotos() : UnsplashResponse{
        return api.getPhotoResponse()
    }

    interface UnspalshApi {
        @Headers("Accept-Version: v1", "Authorization: Client-ID $CLIENT_ID")
        @GET("/photos")
        suspend fun getPhotoResponse(): UnsplashResponse
    }

}