package com.PUCMM.luisapp.Sintaxis

fun main (){
    val age: Int = 10
    val Name: String = "Luis Alejandro"
    val LastName: String = "Vargas"
    val Height: Double = 1.80
    val Money: Float = 100.50f

    println("Hello, My name is $Name & i have $age years old")
    println(Name + LastName)

    val pocket: Int = age + Money.toInt()
    val mass: Double = Height * age
    println(pocket)
    println(mass)
}
