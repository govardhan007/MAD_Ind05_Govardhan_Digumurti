package com.developer.mad_ind05_lastname_firstname.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.developer.mad_ind05_lastname_firstname.data.Repo
import com.developer.mad_ind05_lastname_firstname.data.StateData

class MainViewModel(private val repo: Repo): ViewModel() {

    private val _stateData: MutableLiveData<List<StateData>> = MutableLiveData();
    val stateData: LiveData<List<StateData>>
        get() = _stateData

    fun loadStateData() {
        _stateData.postValue(repo.load())
    }

}