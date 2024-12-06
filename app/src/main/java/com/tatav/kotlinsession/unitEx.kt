package com.tatav.kotlinsession

fun main(){
    val something: Unit? = null

    println("Unit Examples")
}

fun sayHello() {
    println("Hello, buddy!")
}

fun sayHelloUnit(): Unit {
    println("Hello, buddy!")
}

fun doNothing(): Unit {
    return Unit
}

fun noMeaningReturn(){
    val printer: () -> Unit = { println(" Kotlin is cool!") }
    printer()
}