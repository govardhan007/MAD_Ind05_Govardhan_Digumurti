package com.developer.mad_ind05_lastname_firstname.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.developer.mad_ind05_lastname_firstname.data.Repo
import com.developer.mad_ind05_lastname_firstname.ui.details.DetailsViewModel
import com.developer.mad_ind05_lastname_firstname.ui.home.MainViewModel

class MainViewModelFactory(private val repo: Repo): ViewModelProvider.Factory {
    @Suppress("unchecked_cast")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(repo) as T
        }
        if (modelClass.isAssignableFrom(DetailsViewModel::class.java)){
            return DetailsViewModel(repo) as T
        }
        throw IllegalArgumentException("unknown arguments.")
    }
}