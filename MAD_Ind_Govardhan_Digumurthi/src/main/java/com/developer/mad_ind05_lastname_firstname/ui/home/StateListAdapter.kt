package com.developer.mad_ind05_lastname_firstname.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.developer.mad_ind05_lastname_firstname.data.StateData
import com.developer.mad_ind05_lastname_firstname.databinding.StateNameNickNameItemBinding
import com.developer.mad_ind05_lastname_firstname.ui.home.StateListAdapter.StateViewHolder.Companion.inflateFrom
import com.developer.mad_ind05_lastname_firstname.ui.home.StateListAdapter.StateViewHolder.Companion.stateDataDiff

class StateListAdapter(private val clickListener: StateListener) : ListAdapter<StateData, StateListAdapter.StateViewHolder>(stateDataDiff) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StateViewHolder {
        return StateViewHolder(inflateFrom(parent))
    }

    override fun onBindViewHolder(holder: StateViewHolder, position: Int) {
        holder.bind(getItem(position), clickListener)
    }

    class StateViewHolder(
        private val binding: StateNameNickNameItemBinding
    ) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(item: StateData, clickListener: StateListener) {
            binding.state = item
            binding.clickListener = clickListener
            binding.executePendingBindings()
        }

        companion object {

            val stateDataDiff = object: DiffUtil.ItemCallback<StateData>() {
                override fun areItemsTheSame(oldItem: StateData, newItem: StateData): Boolean {
                    return oldItem == newItem
                }

                override fun areContentsTheSame(oldItem: StateData, newItem: StateData): Boolean {
                    return oldItem.name == newItem.name
                }
            }

            fun inflateFrom(parent: ViewGroup): StateNameNickNameItemBinding {
                val inflate = LayoutInflater.from(parent.context)
                return StateNameNickNameItemBinding.inflate(inflate, parent, false);
            }
        }
    }
}

class StateListener(val clickListener: (stateId: Int) -> Unit) {
    fun onClick(state: StateData) = clickListener(state.id)
}