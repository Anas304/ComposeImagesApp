package com.example.composeimageapp.model.repository

import com.example.composeimageapp.model.api.UnplashWebService
import com.example.composeimageapp.model.response.UnsplashImage

class UnsplashRepo(val webService: UnplashWebService = UnplashWebService()) {

    private var cachePhotos = listOf<UnsplashImage>()

    suspend fun getUnsplashResponse(): List<UnsplashImage> {
        val response = webService.getPhotos()
        return response
    }

}