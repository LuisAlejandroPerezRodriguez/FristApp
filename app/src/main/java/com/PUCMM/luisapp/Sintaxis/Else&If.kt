package com.PUCMM.luisapp.Sintaxis

fun main (){
pets()
val a: Int = add(20,20)
println(a)
person()
}

fun pets(){
    val pet: String = "Humano"

    if (pet == "dog")
    {
        println("woof")
    } else if (pet == "cat")
    {
        println("meow")
    } else if (pet == "bird")
    {
        println("tweet")
    } else
    {
        println("It's not a pet")
    }

    }

fun add (num1: Int, num2: Int): Int {
   if (num1 == num2) {
       return (num1 + num2) * 3
   } else {
       return num1 + num2
   }
}

fun person (){
    val Name = "John"
    val Lastname = "Morton"

    if((Name == "John") && (Lastname == "Morton") ){
     println("Bienvenido $Name $Lastname")
    } else {
        println("No eres John Morton")
    }
}