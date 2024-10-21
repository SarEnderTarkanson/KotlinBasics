package com.example.kotlinbasics

fun main() {

    println("Please enter your age as a valid number:")
    val enteredValue = readln()
    val age = enteredValue.toInt()

    if (age >= 40)
        println("You can't get into the club, you're too old for that")
    else if(age >= 18){
        println("You can get in.")
    }else{
        println("You can't get into the club, cos you're too young for that.")
    }
}