package com.example.week05assignment.model




import androidx.compose.runtime.mutableStateListOf

import com.example.week05assignment.R
object OptionFactory {
    fun makeOptionList()= mutableStateListOf<Option>(
        Option("arms", Status.HIDDEN, R.drawable.arms),
        Option("shoes", Status.HIDDEN, R.drawable.shoes),
        Option("ears", Status.HIDDEN, R.drawable.ears),
        Option("eyes", Status.HIDDEN, R.drawable.eyes),
        Option("eyebrows", Status.HIDDEN, R.drawable.eyebrows),
        Option("glasses", Status.HIDDEN, R.drawable.glasses),
        Option("hat", Status.HIDDEN, R.drawable.hat),
        Option("mouth", Status.HIDDEN, R.drawable.mouth),
        Option("mustache", Status.HIDDEN, R.drawable.mustache),
        Option("nose", Status.HIDDEN, R.drawable.nose),
    )
}