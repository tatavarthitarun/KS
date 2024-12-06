package com.tatav.kotlinsession

fun main() {
    performClickEx()
}

fun performOnClick(callback: () -> Unit) {
    println("Button clicked!")
    callback() // Call the lambda
}

// Using the lambda as a callback
fun performClickEx() {
    performOnClick {
        println("Hey, the button callback is working!")
    }
}


fun fetchData(callback: (String) -> Unit) {
    val data = "This callback, Works!"
    callback(data) // Call the lambda with data
}

fun dataCallbackEx() {
    // Using the lambda as a callback
    fetchData { message ->
        println("Received message: $message")
    }
}

fun calculate(a: Int, b: Int, callback: (Int) -> Unit) {
    val result = a + b
    callback(result) // Call the lambda with the result
}

fun calculateEx() {
// Using the lambda as a callback
    calculate(5, 10) { sum ->
        println("Hey babe, the result is $sum!")
    }
}



