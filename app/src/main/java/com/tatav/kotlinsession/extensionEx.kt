package com.tatav.kotlinsession

fun main(){
    println("Extension Example")
}

fun String.countVowels(): Int {
    val vowels = "aeiouAEIOU"
    return this.count { it in vowels }
}

fun vowelsEx() {
    val name = "Tarun"
    println("Vowels in '$name': ${name.countVowels()}")
}


fun Int.isEven(): Boolean {
    return this % 2 == 0
}

fun isEvenEx() {
    println(4.isEven())
    println(5.isEven())
}

class User(val name: String, val age: Int)

fun User.greet(): String {
    return "Hi, I'm $name and I'm $age years old!"
}

fun customClassEx(){
val user = User("Tarun", 27)
println(user.greet())
}

fun String?.isNullOrEmpty(): Boolean {
    return this == null || this.isEmpty()
}

fun nullOrEmptyEx() {
    val str: String? = null
    println(str.isNullOrEmpty())
}

fun String.addPrefixAndSuffix(): String {
    return "Hi $this , Whats Up Buddy!"
}

fun preSufEx() {
    println("Tarun".addPrefixAndSuffix())
}



