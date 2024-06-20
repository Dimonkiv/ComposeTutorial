package com.dimonkiv.composetutorial

import androidx.annotation.DrawableRes

data class BottomMenuContent(
    var title: String,
    @DrawableRes
    val iconId: Int
)