package com.developer.mad_ind05_lastname_firstname.ui.home

import android.content.Intent
import android.graphics.Rect
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.developer.mad_ind05_lastname_firstname.R
import com.developer.mad_ind05_lastname_firstname.data.Repo
import com.developer.mad_ind05_lastname_firstname.databinding.ActivityMainBinding
import com.developer.mad_ind05_lastname_firstname.ui.MainViewModelFactory
import com.developer.mad_ind05_lastname_firstname.ui.details.DetailsActivity

class MainActivity: AppCompatActivity() {

    private lateinit var mBinding: ActivityMainBinding

    private val mViewModel: MainViewModel by lazy {
        val vmFactory = MainViewModelFactory(Repo())
        ViewModelProvider(this, vmFactory).get(MainViewModel::class.java)
    }

    private val mAdapter: StateListAdapter by lazy {
        StateListAdapter(StateListener {
            Log.d("Testing", "stateName:- $it")
            val intent = Intent(this, DetailsActivity::class.java).apply {
                putExtra("selected_id", it)
            }
            startActivity(intent)
        })
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        mViewModel.loadStateData()
    }

    override fun onResume() {
        super.onResume()
        mViewModel.stateData.observe(this, Observer {
            mBinding.stateList.apply {
                adapter = mAdapter
                addItemDecoration(BottomLineItemDecoration())
            }
            mAdapter.submitList(it)
        })
    }

}

class BottomLineItemDecoration: RecyclerView.ItemDecoration() {
    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        val item = parent.getChildViewHolder(view).itemView
        val line = item.findViewById<View>(R.id.border)
        val lastItem = parent.getChildAdapterPosition(view) == state.itemCount - 1
        line.visibility = if (lastItem) View.GONE else View.VISIBLE
    }
}
