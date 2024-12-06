package com.tatav.kotlinsession

fun main(){
    println("List Example")
}

fun immutableList() {
    val fruits = listOf("Apple", "Banana", "Cherry")
    println(fruits[0])
}

fun mutableList(){
    val vegetables = mutableListOf("Carrot", "Potato")
    vegetables.add("Tomato")
    println(vegetables)
    vegetables.remove("Carrot")
    println(vegetables)
}

fun arrayListEx(){
    val arrayList = ArrayList<String>()
    arrayList.add("One")
    arrayList.add("Two")
    println(arrayList)
    arrayList.remove("One")
    println(arrayList)
}

fun arrayEx(){
    val numbers = arrayOf(1, 2, 3, 4)
    println(numbers[0])
    numbers[0] = 10
    println(numbers[0])
}

fun setExample(){
    val numbers = setOf(1, 2, 3, 1) // Duplicates not allowed
    println(numbers)
}

fun mapExample(){
    val map = mutableMapOf("name" to "Tarun", "age" to 27)
    map["city"] = "Hyderabad"
    println(map)

}
