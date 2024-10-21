package com.example.kotlinbasics

fun main() {
    println("Please enter a number:")
    val inputString = readln()

    try {
        val inputNumber = inputString.toInt()  // Convert inputString to an integer
        val multiplier = 5  // Predefined integer value

        // Perform multiplication
        val result = inputNumber * multiplier

        // Print the result of the operation
        println("Result of operation is: $result")
    } catch (e: NumberFormatException) {
        println("Error: '$inputString' is not a valid number.")
    }
}
