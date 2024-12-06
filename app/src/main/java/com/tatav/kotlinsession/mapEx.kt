package com.tatav.kotlinsession

fun main() {
    println("map")
}

val employees = listOf("Alice", "Bob", "Charlie")
fun mapEx() {
    val numbers = listOf(1, 2, 3)
    val squares = numbers.map { it * it }
    println(squares)
}

fun lazyMap() {
    val lazyMap = employees.asSequence().map {
        println("Transforming $it")
        "$it - Team Lead"
    }

    println("First: ${lazyMap.first()}")
    println("All: ${lazyMap.toList()}")

}

fun filterMap(){
    val numbers = listOf(1, 2, 3, 4, 5)

    val result = numbers.filter { it > 3 }.map { it * 2 }
    println(result)
}

fun javaMap(){
    val list1 = listOf("a", "b", "c")
    val list2 = listOf(1, 2, 3)
    val zipped = list1.zip(list2)
    println(zipped)
}

fun javaKotlinMap(){
    val list1 = listOf("a", "b", "c")
    val list2 = listOf(1, 2, 3)
    val result = list1.zip(list2).map { (char, number) -> "$char is paired with $number" }
    println(result)
}
