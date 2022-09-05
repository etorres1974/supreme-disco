package com.example.myapplication.ui.music

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.myapplication.R
import com.example.myapplication.databinding.MusicItemBinding

class MusicAdapter(val songs : List<Int>) : BaseAdapter() {

    override fun getCount(): Int = songs.size

    override fun getItem(p0: Int): Any = songs.get(p0)

    override fun getItemId(p0: Int): Long = p0.toLong()

    override fun getView(position : Int, view: View?, parent: ViewGroup?): View {
        val context = parent?.context
        val inflater = LayoutInflater.from(context)
        val binding = MusicItemBinding.inflate(inflater, parent, false)
        binding.btPlay.setOnClickListener {
            if (context != null) {
                val song = songs.getOrNull(position) ?: R.raw.jazz
                MusicPlayer(context).playSong(song)
            }
        }
        return binding.root
    }

}