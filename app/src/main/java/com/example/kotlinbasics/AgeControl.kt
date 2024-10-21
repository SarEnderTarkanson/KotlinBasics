package com.example.kotlinbasics

fun main() {
    println("Enter your age as a whole number: ")

    val enteredValue = readln()

    try {
        val age = enteredValue.toInt()

        if (age in 18..39) {
            println("You can enter the club.")
        } else if (age >= 40) {
            println("You cannot go into the club, please go home.")
        } else {
            println("Age not verified. Please contact support.")
        }
    } catch (e: NumberFormatException) {
        println("Invalid input. Please enter a valid whole number.")
    }
}
