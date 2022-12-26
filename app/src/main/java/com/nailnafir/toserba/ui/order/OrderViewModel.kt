package com.nailnafir.toserba.ui.order

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class OrderViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "HALAMAN PESANAN"
    }
    val text: LiveData<String> = _text
}