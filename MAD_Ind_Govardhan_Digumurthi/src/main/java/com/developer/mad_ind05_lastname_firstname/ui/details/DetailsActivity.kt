package com.developer.mad_ind05_lastname_firstname.ui.details

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.developer.mad_ind05_lastname_firstname.R
import com.developer.mad_ind05_lastname_firstname.data.Repo
import com.developer.mad_ind05_lastname_firstname.databinding.ActivityDetailsBinding
import com.developer.mad_ind05_lastname_firstname.ui.MainViewModelFactory

class DetailsActivity: AppCompatActivity() {

    private lateinit var mBinding: ActivityDetailsBinding

    private val mViewModel: DetailsViewModel by lazy {
        val vmFactory = MainViewModelFactory(Repo())
        ViewModelProvider(this, vmFactory).get(DetailsViewModel::class.java)
    }

    private var id: Int = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_details)
        handleIntent(intent)
    }

    override fun onStart() {
        super.onStart()
        mViewModel.loadSelectedState(id)
    }

    override fun onResume() {
        super.onResume()
        mViewModel.selectedState.observe(this, Observer {
            Log.d("Testing", "selected id: $id && name: ${it.name}")
            mBinding.state = it
        })
    }

    private fun handleIntent(intent: Intent?) {
        intent?.let {
            id = it.getIntExtra("selected_id", 1)
        }
    }

}