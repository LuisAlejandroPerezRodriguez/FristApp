package com.PUCMM.luisapp.Sintaxis

fun main (){
    mutableList()
}

fun mutableList () {
    val weekDays: MutableList<String> = mutableListOf(
        "Lunes", "Martes", "Miercoles",
        "Jueves", "Viernes", "Sabado", "Domingo"
    )

    weekDays.add(index = 0, element = "LuisDay")
    println(weekDays)
}

fun listaInmutables() {
    val readOnly: List<String> = listOf(
        "Lunes", "Martes", "Miercoles",
        "Jueves", "Viernes", "Sabado", "Domingo"
    )

    println(readOnly.size)
    println(readOnly) // Me da el contenido de la lista

    //Filtrar
    val example = readOnly.filter { it.contains("a") }
    println(example)

    //Iterar
    readOnly.forEach { weekDay -> println(weekDay) } // Es lo mismo que tener readOnly.forEach {println(it)}
}