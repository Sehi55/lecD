package com.example.dweek05a.model

import androidx.compose.runtime.mutableStateListOf
import com.example.dweek05a.R


object ImageListFactory {
    fun makeImageList() = mutableStateListOf(
        ImageData(
            image = ImageUri.ResImage(R.drawable.img1),
            buttonType = ButtonType.BADGE,
            likes = 5,
            dislikes = 5
        ),
        ImageData(
            image = ImageUri.ResImage(R.drawable.img2),
            buttonType = ButtonType.ICON,
            likes = 50,
            dislikes = 50
        ),ImageData(
            image = ImageUri.ResImage(R.drawable.img3),
            buttonType = ButtonType.BADGE,
            likes = 10,
            dislikes = 20
        ),ImageData(
            image = ImageUri.ResImage(R.drawable.img3),
            buttonType = ButtonType.EMOJI,
            likes = 50,
            dislikes = 50
        ),
        ImageData(
            image = ImageUri.ResImage(R.drawable.img1),
            buttonType = ButtonType.EMOJI,
            likes = 50,
            dislikes = 50
        )
    )
}