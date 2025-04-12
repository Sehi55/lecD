package com.example.week05assignment.uiComponents

import android.content.res.Configuration
import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.week05assignment.viewModel.OptionViewModel
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun MainScreen(modifier: Modifier = Modifier, optionViewModel: OptionViewModel = viewModel()) {
    val optionList = optionViewModel.optionList
    val configuration = LocalConfiguration.current
    val orientation = configuration.orientation
    if (orientation == Configuration.ORIENTATION_PORTRAIT) {
        Log.d("화면전ㄴ환1","화면전환1")
        Column(
            modifier = Modifier.fillMaxHeight().background(Color.White),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            ImageBox(optionList, Modifier.padding(top = 200.dp).weight(1f))
            ListOption(optionList, Modifier.weight(1f))
        }
    } else {
        Log.d("2","화면전환2")
        Row(modifier = Modifier.fillMaxWidth().fillMaxHeight().background(Color.White),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,

        ) {

            ImageBox(optionList, Modifier.padding(start = 200.dp).weight(1f))
            ListOption(optionList, Modifier.weight(1f))
        }
    }
}