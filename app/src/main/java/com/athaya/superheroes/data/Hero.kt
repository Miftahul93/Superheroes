package com.athaya.superheroes.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Hero(
    @StringRes val name: Int,
    @StringRes val description: Int,
    @DrawableRes val image: Int
)
