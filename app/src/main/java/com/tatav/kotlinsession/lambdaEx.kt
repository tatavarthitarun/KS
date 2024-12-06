package com.tatav.kotlinsession

fun main(){
    println("Lambda Example")
}

fun noParameter(){
    val greet: () -> Unit = { println("Hello, buddy!") }
    greet()
}

fun withParameter(){
    val introduce: (String) -> Unit = { name -> println("Hey, my name is $name!") }
    introduce("Tarun")
}

//Higher order functions (Fun taking another fun as argument )
fun repeatAction(times: Int, action: () -> Unit) {
    for (i in 1..times) {
        action()
    }
}

fun repeatActionEx(){
    repeatAction(3) {
        println("I'm, AndroidDev!")
    }
}

fun returnValue(){
    val addNumbers: (Int, Int) -> Int = { a, b -> a + b }
    println(addNumbers(2, 3))
}

fun noReturn(){
    val printMessage: (String) -> Unit = { message -> println(message) }
    printMessage("You're amazing!")
}



