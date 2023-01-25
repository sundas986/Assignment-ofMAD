package com.example.student.ui.add_record

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Add_recordViewModel :ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "This is add record fragment"
    }
    val text: LiveData<String> = _text
}