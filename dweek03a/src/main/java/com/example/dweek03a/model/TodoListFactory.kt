package com.example.dweek03a.model

object TodoListFactory {
    //데이터 제공해주는 함수
    fun makeTodoList() = mutableListOf(
        Item("모프 공부하기1", "03-19 11:20"),
        Item("모프 공부하기2", "03-19 11:20", TodoStatus.COMPLETED),
        Item("모프 공부하기3", "03-19 11:20", TodoStatus.COMPLETED),
        Item("모프 공부하기4", "03-19 11:20"),

    )
}