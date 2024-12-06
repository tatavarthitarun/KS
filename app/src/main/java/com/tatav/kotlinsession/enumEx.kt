package com.tatav.kotlinsession

fun main(){
    println("Enum Example")
    println("Enum means Enumeration /fixed set of constants")
}

enum class Direction {
    NORTH, SOUTH, EAST, WEST
}

fun navigate(direction: Direction) {
    when (direction) {
        Direction.NORTH -> println("Moving North!")
        Direction.SOUTH -> println("Moving South!")
        Direction.EAST -> println("Moving East!")
        Direction.WEST -> println("Moving West!")
    }
}

fun navEx(){
navigate(Direction.NORTH)
}

enum class Day(val isWeekend: Boolean) {
    MONDAY(false),
    SATURDAY(true),
    SUNDAY(true);

    fun isWorkDay(): Boolean = !isWeekend
}

fun enumPropExample() {
    val today = Day.SATURDAY
    println(today.isWeekend)
    println(today.isWorkDay())
}

fun regularFunc(action: () -> Unit) {
    println("Before action")
    action()
    println("After action")
}

inline fun inlineFunc(action: () -> Unit) {
    println("Before action")
    action()
    println("After action")
}

data class Users(val name: String, val age: Int)

fun usersEx() {
    val user1 = Users("Tarun", 27)
    println(user1)

    val user2 = user1.copy(age = 28)
    println(user2)
}

sealed class Result {
    data class Success(val data: String) : Result()
    data class Error(val message: String) : Result()
}

fun handleResult(result: Result) {
    when (result) {
        is Result.Success -> println("Success: ${result.data}")
        is Result.Error -> println("Error: ${result.message}")
    }
}

fun sealedExample() {
    val success = Result.Success("Data Loaded")
    val error = Result.Error("Something went wrong")

    handleResult(success)
    handleResult(error)
}

object Singleton {
    fun sayHello() = "Hello from Singleton!"
}

fun objectExample(){
println(Singleton.sayHello())
}

class Utils {
    companion object {
        const val PI = 3.14
        fun square(x: Int) = x * x
    }
}

fun compObjEx() {
    println(Utils.PI)
    println(Utils.square(5))
}

