package com.example.musicapp.feature.main

import androidx.lifecycle.ViewModel
import com.example.musicapp.data.audio.SoundPoolRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import jakarta.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val soundPoolRepository: SoundPoolRepository
) : ViewModel(){

    fun onPadClick(index: Int) = soundPoolRepository.playSound(index)

    override fun onCleared() {
        soundPoolRepository.release()
        super.onCleared()
    }

    
}