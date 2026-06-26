package com.example.musicapp.di

import android.content.Context
import com.example.musicapp.data.repository.SoundPoolRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideSoundPoolRepository(
        @ApplicationContext context: Context
    ): SoundPoolRepository {
        return SoundPoolRepository(context)
    }
}