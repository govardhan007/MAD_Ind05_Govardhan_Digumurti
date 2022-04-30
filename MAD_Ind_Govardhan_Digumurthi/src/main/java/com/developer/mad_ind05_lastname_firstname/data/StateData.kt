package com.developer.mad_ind05_lastname_firstname.data

import androidx.annotation.DrawableRes

data class StateData(val id: Int, val name: String,
                     val nickName: String,
                     val area: String,
                     @DrawableRes
                     val flag: Int,
                     @DrawableRes
                     val areaPic: Int)
