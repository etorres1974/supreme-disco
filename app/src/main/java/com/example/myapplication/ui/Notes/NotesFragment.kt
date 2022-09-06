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

class NotesFragment : Fragment() , AdapterView.OnItemSelectedListener{

    private lateinit var binding: FragmentNotesBinding
    //private val viewModel : NotesViewModel = ViewModelProvider(this)[NotesViewModel::class.java]

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
        val spinnerAdapter = ArrayAdapter.createFromResource(
            requireContext(),
            R.array.instruments_array,
            android.R.layout.simple_spinner_item)
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spinnerInstrument.apply {
            adapter = spinnerAdapter
            onItemSelectedListener = this@NotesFragment
        }
    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, pos: Int, id: Long) {
        // TODO submit sounds to adapter
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {
        // TODO clear adapter
    }

}