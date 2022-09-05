package com.example.myapplication.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.ui.music.MusicPlayer
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentDashboardBinding
import com.example.myapplication.ui.music.MusicAdapter

class DashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null
    val songs = listOf<Int>(
        R.raw.beat,
        R.raw.jazz,
        R.raw.space,
        R.raw.think
    )

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val dashboardViewModel =
            ViewModelProvider(this).get(DashboardViewModel::class.java)

        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textDashboard
        dashboardViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        binding.lvMusic.adapter = MusicAdapter(songs)

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}