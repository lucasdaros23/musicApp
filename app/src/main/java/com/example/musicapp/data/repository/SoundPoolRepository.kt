package com.example.musicapp.data.repository

import android.content.Context
import android.media.AudioAttributes
import android.media.SoundPool
import com.example.musicapp.R
import jakarta.inject.Inject

class SoundPoolRepository @Inject constructor(
    private val context: Context
) {
    private var soundPool: SoundPool? = null
    private val soundMap = mutableMapOf<Int, Int>()
    private var isLoaded = false

    init{
        initializeSoundPool()
        loadSounds()
    }

    private fun initializeSoundPool() {
        val audioAttributes = AudioAttributes.Builder()
            .setUsage(AudioAttributes.USAGE_MEDIA)
            .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
            .build()

        soundPool = SoundPool.Builder()
            .setMaxStreams(6)
            .setAudioAttributes(audioAttributes)
            .build()

        soundPool?.setOnLoadCompleteListener { _, _, status ->
            if (status == 0) {
                isLoaded = true
            }
        }

    }

    private fun loadSounds() {
        soundPool?.let { pool ->
            soundMap[0] = pool.load(context, R.raw.kick_808, 1)
            soundMap[1] = pool.load(context, R.raw.hihat_808, 1)
            soundMap[2] = pool.load(context, R.raw.clap_808, 1)
        }
    }

    fun playSound(padIndex: Int, volume: Float = 1f) {
        if (!isLoaded) return

        soundMap[padIndex]?.let { soundId ->
            soundPool?.play(soundId, volume, volume, 1, 0, 1f)
        }
    }

    fun release() {
        soundPool?.release()
        soundPool = null
        soundMap.clear()
    }
}