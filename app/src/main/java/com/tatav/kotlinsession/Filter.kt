package com.tatav.kotlinsession

fun main(){
    println("First")
}

val decorations = listOf("rock", "pagoda", "plastic plant", "alligator", "flowerpot")

fun filter1() {
    println(decorations.filter { it[0] == 'p' })
}


fun eagerFilter() {
    val eager = decorations.filter { it[0] == 'p' }
    println(eager) // [pagoda, plastic plant]

}

fun lazyFilter(){
    val lazy = decorations.asSequence().filter { it[0] == 'p' }
    println(lazy.toList()) // Now evaluates and prints: [pagoda, plastic plant]
}

fun stringChar(){
    val word = "pagoda"
    println(word[0])
    println(word[1])
}



