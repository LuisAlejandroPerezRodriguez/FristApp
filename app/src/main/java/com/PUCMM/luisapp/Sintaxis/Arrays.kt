package com.PUCMM.luisapp.Sintaxis

fun main (){
    val weekDays = arrayOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes","Sabado",
        "Domingo")
    println(weekDays[0])
    println(weekDays.size)

    for (weekDay in weekDays){
        println("Ahora es $weekDay")
    }
}