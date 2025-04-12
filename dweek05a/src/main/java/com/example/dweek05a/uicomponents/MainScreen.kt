package com.example.dweek05a.uicomponents

import android.content.pm.ConfigurationInfo
import android.content.res.Configuration
import android.graphics.Paint
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.dweek05a.model.ButtonType
import com.example.dweek05a.model.ImageData
import com.example.dweek05a.model.ImageUri
import com.example.dweek05a.R
import com.example.dweek05a.viewmodel.ImageViewModel

@Composable
fun MainScreen(modifier: Modifier = Modifier,imageViewModel : ImageViewModel = viewModel()) {
    val imageList = imageViewModel.imageList
    val orientation = LocalConfiguration.current.orientation
    val scrollState = rememberScrollState()
    if(orientation== Configuration.ORIENTATION_PORTRAIT){
        Column(modifier = Modifier.fillMaxWidth().verticalScroll(scrollState), horizontalAlignment = Alignment.CenterHorizontally) {
            ImageList(imageList= imageList)
        }
    }//세로모드냐 아니냐
    else{

        Row(modifier= Modifier.fillMaxHeight().horizontalScroll(scrollState), verticalAlignment = Alignment.CenterVertically) {
            ImageList(imageList= imageList)
        }
    }

//    var img1State by rememberSaveable(stateSaver = ImageData.ImageSaver){
//        mutableStateOf(
//            ImageData(
//                image = ImageUri.ResImage(R.drawable.img1),
//                buttonType = ButtonType.BADGE,
//                likes = 50,
//                dislikes = 50
//            )
//        )
//    }
//
//    var img2State by rememberSaveable (stateSaver = ImageData.ImageSaver){
//        mutableStateOf(
//            ImageData(
//                image = ImageUri.ResImage(R.drawable.img2),
//                buttonType = ButtonType.EMOJI,
//                likes = 2,
//                dislikes = 1,
//            )
//        )
//    }
//
//    Column {
//        ImageWithButton(image = img1State.image) {
//            ButtonWithBadge(likes = img1State.likes) {
//                img1State =
//                    img1State.copy(likes = img1State.likes + 1)//likes++로 할 시, copy하는 객체 안에서는 immutable이어서 like값 변형이 되지 않음.
//            }
//        }
//
//        ImageWithButton(
//            image = img2State.image
//        ) {
//            ButtonWithEmoji(
//                likes = img2State.likes,
//                dislikes = img2State.dislikes,
//                onClickLikes = {
//                    img2State =
//                        img2State.copy(likes = img2State.likes + 1)
//                },
//                onClickDisLikes =  {
//                    img2State =
//                        img2State.copy(dislikes = img2State.dislikes + 1)
//                }
//            )
//        }


   // }
}