package com.example.student.ui.search

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SearchViewModel :ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "This is search fragment"
    }
    val text: LiveData<String> = _text
}