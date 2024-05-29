package com.PUCMM.luisapp.Sintaxis




fun main(){
    // Kotlin tiene 2 formas de manejar los valores nulos
    var name:String = "Saludos"
    var apellido: String? = null // ? Indica que es un string nulable
    println(name!!.get(2)) // !! Significa que estoy seguro de que no hay un null
    println(apellido?.get(1)?:"Maetro eto e nulo")
// ? indica que si el string no es nulo ejecuta lo que sigue, ?: indica que si es nulo ejecuta lo sig.


}