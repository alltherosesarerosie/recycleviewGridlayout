package com.geektech.hm

import java.io.Serializable

data class Photo(
    val image: String,
    var isSelected: Boolean = false
) : Serializable
