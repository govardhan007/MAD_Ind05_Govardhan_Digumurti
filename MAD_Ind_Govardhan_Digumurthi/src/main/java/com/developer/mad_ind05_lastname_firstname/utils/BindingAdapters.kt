package com.developer.mad_ind05_lastname_firstname.utils

import android.widget.ImageView
import androidx.annotation.DrawableRes
import androidx.databinding.BindingAdapter
import com.developer.mad_ind05_lastname_firstname.R

@BindingAdapter("loadPic")
fun ImageView.loadPic(@DrawableRes resource: Int) {
    setImageResource(resource)
}