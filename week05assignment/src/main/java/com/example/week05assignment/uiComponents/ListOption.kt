package com.example.week05assignment.uiComponents

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.week05assignment.model.Option
import com.example.week05assignment.model.Status

@Composable
fun ListOption(optionList: MutableList<Option> ,modifier: Modifier = Modifier) {
    val halfSize = optionList.size / 2
    val firstHalf = optionList.take(halfSize)   // 첫 번째 그룹
    val secondHalf = optionList.takeLast(optionList.size - halfSize) // 두 번째 그룹

    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(16.dp), // 두 Column 사이 간격
        verticalAlignment = Alignment.Top
    ) {
        // 첫 번째 Column
        Column(
            modifier = Modifier.weight(1f).padding(start = 30.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
            horizontalAlignment = Alignment.Start
        ) {
            firstHalf.forEach { option ->
                CheckOption(
                    text = option.text,
                    checked = option.visuality == Status.VISIBLE,
                    onCheckedChange = { checked ->
                        optionList[optionList.indexOf(option)] = option.copy(
                            visuality = if (checked) Status.VISIBLE else Status.HIDDEN
                        )
                    }
                )
            }
        }

        // 두 번째 Column
        Column(
            modifier = Modifier.weight(1f).padding(end = 30.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
            horizontalAlignment = Alignment.Start
        ) {
            secondHalf.forEach { option ->
                CheckOption(
                    text = option.text,
                    checked = option.visuality == Status.VISIBLE,
                    onCheckedChange = { checked ->
                        optionList[optionList.indexOf(option)] = option.copy(
                            visuality = if (checked) Status.VISIBLE else Status.HIDDEN
                        )
                    }
                )
            }
        }
    }

    }
