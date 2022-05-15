package com.example.composeimageapp.model

import com.example.composeimageapp.model.api.UnplashWebService
import com.example.composeimageapp.model.response.UnsplashSingleResponse
import com.example.composeimageapp.model.response.UnsplashResponse

class UnsplashRepo (val webService: UnplashWebService = UnplashWebService()){


    private var cachePhotos = listOf<UnsplashSingleResponse>()

    suspend fun getUnsplashResponse() : UnsplashResponse{
        val response = webService.getPhotos()
        cachePhotos = response.photos
        return response
    }
}