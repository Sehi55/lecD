package com.example.dweek03a

import com.example.dweek03a.model.Item
import com.example.dweek03a.model.TodoStatus
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class TodoService(val todoList:MutableList<Item>) {
    fun addContent(content:String){
        val currentTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("MM-dd HH:mm"))
        todoList.add(Item(content,currentTime))
    }
    fun completeTodo (index:Int){
        if(todoList.size<index+1){
            println("잘못된 인덱스를 입력하였습니다. 메뉴로 돌아갑니다.")
            return
        }
        todoList[index].status = TodoStatus.COMPLETED
        println("메모 완료 처리됨: ${todoList[index]}")

    }
    fun searchTodos(search:String){
        val indexedTodos = todoList.filter { it.content.contains(search) }
        println("검색 결과: ")
        indexedTodos.forEachIndexed{index, item ->
            println("$index : $item")
        }
    }
    fun listTodos(){
        if(todoList.isEmpty()){
            println("등록된 일정이 없습니다. ")
        } else {
            println("전체 메모: ")
            todoList.forEachIndexed{index, item ->
                println("$index : $item")
            }
        }
    }




}