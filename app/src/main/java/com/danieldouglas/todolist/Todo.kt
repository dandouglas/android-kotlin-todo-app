package com.danieldouglas.todolist

data class Todo(
    val title: String,
    var isChecked: Boolean = false
) {

}