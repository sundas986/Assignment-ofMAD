package com.example.student.ui.search

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.student.databinding.FragmentHomeBinding
import com.example.student.databinding.FragmentSearchBinding
import com.example.student.ui.favourite.FavouriteViewModel

class SearchFragment :Fragment() {
    private lateinit var searchViewModel: SearchViewModel
    private var _binding : FragmentSearchBinding? = null

    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val searchViewModel = ViewModelProvider(this).get(SearchViewModel::class.java)

        _binding = FragmentSearchBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textSearch
        searchViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root

    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}