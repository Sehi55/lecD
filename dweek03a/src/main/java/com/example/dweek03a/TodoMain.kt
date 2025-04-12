package com.example.dweek03a

import com.example.dweek03a.model.TodoListFactory

fun main(){
    val todoService = TodoService(TodoListFactory.makeTodoList())


    while(true){
        println("====202212372 임세희====")
        println("=====TodoList 메뉴=====")
        println("1. 메모 등록")
        println("2. 메모 완료 체크")
        println("3. 메모 검색")
        println("4. 메모 전체 리스트 보기")
        println("5. 종료")
        print("메뉴 선택: ")
        val answer = readlnOrNull()?.toIntOrNull()
        if (answer == null) {
            println("입력값이 잘못되었거나 숫자가 아닙니다. 다시 입력해주세요")
            continue
        } else if (answer >=6){
            println("메뉴에 없는 숫자입니다. 다시 입력해주세요")
            continue
        }
        when(answer){
            1->{
                print("추가할 일정을 등록하세요:")
                val addTodo = readlnOrNull()
                if(!addTodo.isNullOrBlank()){
                    todoService.addContent(addTodo)
                }else {
                    println("빈칸을 입력하셨습니다. 메뉴로 돌아갑니다.")
                    continue
                }
            }
            2->{
                todoService.listTodos()
                print("완료 처리할 메모의 인덱스를 입력하세요: ")
                val index = readlnOrNull()?.toIntOrNull()
                if(index!=null) {
                    todoService.completeTodo(index)
                } else {
                    println("잘못된 입력입니다.메뉴로 돌아갑니다.")
                    continue
                }

            }
            3->{
                print("검색할 키워드를 입력하세요:")
                val searchKeyword = readlnOrNull()
                if(!searchKeyword.isNullOrBlank()){
                    todoService.searchTodos(searchKeyword)
                } else {
                    println("빈칸을 입력하셨습니다. 메뉴로 돌아갑니다.")
                    continue
                }
            }
            4->{
                todoService.listTodos()

            }
            5-> System.exit(1)
        }
    }



}