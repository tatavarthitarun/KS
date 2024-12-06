package com.tatav.kotlinsession

import kotlin.random.Random

fun main(){
    println("flat ex")
}

val mysports = listOf("basketball", "fishing", "running")
val myplayers = listOf("LeBron James", "Ernest Hemingway", "Usain Bolt")
val mycities = listOf("Los Angeles", "Chicago", "Jamaica")
val mylist = listOf(mysports, myplayers, mycities)

fun noFlat(){
    println(mylist)
}

fun withFlatten(){
    println("Flat: ${mylist.flatten()}")
}

fun seqFlat(){
    val listA = listOf("a1", "a2", "a3")
    val listB = listOf("b1", "b2", "b3")
    val listC = listOf("c1", "c2", "c3")

    val nestedList = listOf(listA, listB, listC)
    println(nestedList)

    val flatList = nestedList.flatten()
    println(flatList)
}

fun randomFlat(){
    val listA = listOf("a1", "a2", "a3")
    val listB = listOf("b1", "b2", "b3")
    val listC = listOf("c1", "c2", "c3")

    val nestedList = listOf(listA, listB, listC)
    val flatList = nestedList.flatten()

    val randomizedList = flatList.shuffled()
    println("Randomized: $randomizedList")
}

fun controlledFlat(){
    val flatList = listOf("a1", "a2", "a3", "b1", "b2", "b3", "c1", "c2", "c3")
    val seededRandom = flatList.shuffled(Random(42))
    println("Seeded Randomized: $seededRandom")
}

fun flatMapEx(){
    val words = listOf("hello", "world")
    val letters = words.flatMap { it.toList() }
    println(letters)
}


fun filterMapEx(){
    data class Person(val name: String, val books: List<String>)

    val people = listOf(
        Person("Alice", listOf("Alice in Wonderland", "Avengers")),
        Person("Bob", listOf("Batman", "Animal Farm")),
        Person("Charlie", listOf("Cinderella", "Artemis"))
    )

    val booksStartingWithA = people.flatMap { person ->
        person.books.filter { it.startsWith("A") }
    }
    println(booksStartingWithA)
}

