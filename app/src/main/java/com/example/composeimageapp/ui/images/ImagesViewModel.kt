package com.example.composeimageapp.ui.images

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.composeimageapp.model.UnsplashRepo
import com.example.composeimageapp.model.response.UnsplashSingleResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ImagesViewModel (val unsplashRepo: UnsplashRepo = UnsplashRepo()) : ViewModel(){


     var photosState : MutableState<List<UnsplashSingleResponse>> =
        mutableStateOf(emptyList<UnsplashSingleResponse>())

    init {
        viewModelScope.launch(Dispatchers.IO){
            val photos = getUnsplashResponse()
            photosState.value = photos
        }
    }

    private suspend fun getUnsplashResponse() : List<UnsplashSingleResponse>{
        return unsplashRepo.getUnsplashResponse().photos
    }


}