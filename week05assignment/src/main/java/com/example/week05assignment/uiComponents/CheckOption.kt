package com.example.week05assignment.uiComponents

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.selection.toggleable
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun CheckOption(
    text: String,
    checked: Boolean,
    modifier: Modifier = Modifier,
    onCheckedChange: (Boolean) -> Unit,
) {

    Row(
        modifier = Modifier
            .toggleable(
                value = checked,
                onValueChange = { isChecked -> onCheckedChange(isChecked) },
                role = Role.Checkbox
            )
    ) {
        Checkbox(checked= checked,
            onCheckedChange={ isChecked ->
            onCheckedChange(isChecked)
        }, modifier=modifier)
        Text(
            text = text
        )
    }
}
