package com.example.myapplication.ui.Notes

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentNotesBinding
import com.example.myapplication.ui.Songs.AlbumAdapter

class NotesFragment : Fragment() , AdapterView.OnItemSelectedListener{

    private lateinit var binding: FragmentNotesBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentNotesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupSpinner()
    }

    private fun setupSpinner(){
        binding.spinnerInstrument.apply {
            adapter = ArrayAdapter.createFromResource(
                requireContext(),
                R.array.instruments_array,
                android.R.layout.simple_spinner_item).apply {
                setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            }
            onItemSelectedListener = this@NotesFragment
        }
    }

    private fun setupListView(instrument: Album){
        binding.listViewInstrument.apply {
            adapter = AlbumAdapter(instrument)
        }
    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, pos: Int, id: Long) {
        val instrument = instruments.firstOrNull { it.name == instruments()[pos] }
        if(instrument != null)
            setupListView(instrument)
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {
        // TODO clear adapter
    }


    private fun instruments() : List<String>  = resources.getStringArray(R.array.instruments_array).toList()

}