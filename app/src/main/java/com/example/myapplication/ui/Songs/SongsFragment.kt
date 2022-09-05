package com.example.myapplication.ui.SongsFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentSongsBinding
import com.example.myapplication.ui.music.MusicAdapter

class SongsFragment : Fragment() {

    private lateinit var binding: FragmentSongsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSongsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.lvMusic.adapter = MusicAdapter(getSongs())
    }

    private fun getSongs() = listOf<Int>(
        R.raw.beat,
        R.raw.jazz,
        R.raw.space,
        R.raw.think
    )
}