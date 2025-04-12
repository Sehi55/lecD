package com.example.week05assignment.uiComponents


import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import coil3.compose.AsyncImagePainter
import com.example.week05assignment.model.Option
import com.example.week05assignment.R
import com.example.week05assignment.model.Status

@Composable
fun ImageBox(optionList: MutableList<Option>, modifier: Modifier = Modifier) {
    var loading by remember { mutableStateOf(true) }


    Box(
        modifier = modifier,
        contentAlignment = Alignment.Center
    ) {
        AsyncImage(
            model = R.drawable.body,
            contentDescription = null,
            modifier = Modifier.size(300.dp, 300.dp),
            onState = { state ->
                if (state is AsyncImagePainter.State.Success) {
                    loading = false
                }
            }
        )


        optionList.filter { it.visuality == Status.VISIBLE }.forEachIndexed { index, option ->
            if (!loading) {
                AsyncImage(
                    model = option.img,
                    contentDescription = null,
                    modifier = Modifier.size(300.dp, 300.dp)
                )
            }
        }
    }
}
