package com.PUCMM.luisapp.Sintaxis

fun main() {
suma()
val r = resta(10, 5)
    println(r)
    println(multiplicacion(10, 5))

}

fun suma(a: Int = 10, b: Int = 20){
    println(a + b)
}

fun resta(a: Int , b: Int ):Int{
    return a - b
}

fun multiplicacion(a: Int , b: Int ) = a * b
