package com.diegovaldez.coursesapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val stringResourceId: Int,
    val numberCourse: Int,
    @DrawableRes val imageResourceId: Int
)
