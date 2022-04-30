package com.developer.mad_ind05_lastname_firstname.ui.details

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.developer.mad_ind05_lastname_firstname.data.Repo
import com.developer.mad_ind05_lastname_firstname.data.StateData

class DetailsViewModel(private val repo: Repo): ViewModel() {

    private val _selectedState: MutableLiveData<StateData> = MutableLiveData()
    val selectedState: LiveData<StateData> = _selectedState

    fun loadSelectedState(id: Int) {
        _selectedState.postValue(repo.getById(id))
    }
}