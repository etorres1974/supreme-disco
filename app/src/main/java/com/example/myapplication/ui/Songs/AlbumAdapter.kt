package com.example.myapplication.ui.Songs

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.myapplication.databinding.SongItemBinding
import com.example.myapplication.ui.Notes.Album
import com.example.myapplication.ui.Notes.Sound

class AlbumAdapter(val instrument: Album) : BaseAdapter() {

    override fun getCount(): Int = instrument.sounds.size

    override fun getItem(p0: Int): Any = instrument.sounds[p0]

    override fun getItemId(p0: Int): Long = p0.toLong()

    override fun getView(position : Int, view: View?, parent: ViewGroup?): View {
        val context = parent?.context
        val inflater = LayoutInflater.from(context)
        val binding = SongItemBinding.inflate(inflater, parent, false)
        val sound = instrument.sounds.getOrNull(position)
        setupView(sound, binding, context)
        return binding.root
    }

    private fun setupView(sound: Sound?, binding: SongItemBinding, context : Context?){
        if(sound != null) {
            binding.cardView.setOnClickListener {
                if (context != null) {
                    SongPlayer(context).playSong(sound.audio)
                }
            }
            binding.imageView.setImageDrawable(context?.getDrawable(sound.image))
        }
    }

}