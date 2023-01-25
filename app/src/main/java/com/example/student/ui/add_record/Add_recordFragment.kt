package com.example.student.ui.add_record

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.student.databinding.FragmentAddRecordBinding


import com.example.student.ui.search.SearchViewModel

class Add_recordFragment :Fragment() {

    private var _binding :FragmentAddRecordBinding? = null

    private val binding get() =_binding!!
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val add_recordViewModel = ViewModelProvider(this).get(Add_recordViewModel::class.java)
        _binding = FragmentAddRecordBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textAddRecord
        add_recordViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}