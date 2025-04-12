package com.example.week05assignment.viewModel

import androidx.lifecycle.ViewModel
import com.example.week05assignment.model.Option
import com.example.week05assignment.model.OptionFactory

class OptionViewModel: ViewModel() {
    private val _optionList = OptionFactory.makeOptionList()

    val optionList: MutableList<Option>
        get() = _optionList
}