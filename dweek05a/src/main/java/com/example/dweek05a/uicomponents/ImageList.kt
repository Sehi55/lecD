package com.example.dweek05a.uicomponents

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.dweek05a.model.ButtonType
import com.example.dweek05a.model.ImageData

@Composable
fun ImageList(modifier: Modifier = Modifier, imageList: MutableList<ImageData>) {
    imageList.forEachIndexed { index, imageData ->
        when (imageData.buttonType) {
            ButtonType.ICON -> {
                ImageWithButton(image = imageData.image) {
                    ButtonWithIcon(likes = imageData.likes) {
                        imageList[index] = imageData.copy(likes = imageData.likes + 1)
                    }
                }
            }
                    ButtonType.BADGE -> {
                    ImageWithButton(image = imageData.image) {
                        ButtonWithBadge(likes = imageData.likes) {
                            imageList[index] =
                                imageData.copy(likes = imageData.likes + 1)//likes++로 할 시, copy하는 객체 안에서는 immutable이어서 like값 변형이 되지 않음.
                        }
                    }
                }
                    ButtonType.EMOJI -> {
                    ImageWithButton(
                        image = imageData.image
                    ) {
                        ButtonWithEmoji(
                            likes = imageData.likes,
                            dislikes = imageData.dislikes,
                            onClickLikes = {
                                imageList[index] =
                                    imageData.copy(likes = imageData.likes + 1)
                            },
                            onClickDisLikes = {
                                imageList[index] =
                                    imageData.copy(dislikes = imageData.dislikes + 1)
                            }
                        )
                    }
                }
                }
            }
        }