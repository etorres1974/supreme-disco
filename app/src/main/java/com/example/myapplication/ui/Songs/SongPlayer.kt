package com.example.myapplication.ui.Songs

import android.content.Context
import android.media.AudioAttributes
import android.media.MediaPlayer

class SongPlayer(private val context: Context) {

    lateinit var player : MediaPlayer

    fun playSong(resource : Int){
        MediaPlayer.create(context, resource).apply {
            player = this
            setAudioAttributes(
                AudioAttributes.Builder()
                    .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                    .setUsage(AudioAttributes.USAGE_MEDIA)
                    .build()
            )
            start()
        }
    }
}