package com.PUCMM.luisapp.Sintaxis

//Esto es como la evolucion de del Switch en los demas lenguajes



fun main (){
    result(20)
   val month = getSemester(24)
    println(month)
}

fun getMonth(month:Int){
    when(month) {
        1 -> println("Enero")
        2 -> println("Febrero")
        3 -> println("Marzo")
        4 -> println("Abril")
        5 -> println("Mayo")
        6 -> println("Junio")
        7 -> println("Julio")
        8 -> println("Agosto")
        9 -> println("Septiembre")
        10 -> {println("Octubre")
            println("October")}
        11 -> println("Noviembre")
        12 -> println("Diciembre")
        else -> println("Mes no valido")
    }
}
fun getTrimester(month:Int){
    when(month){
        in 1..3 -> println("Primer trimestre")
        in 4..6 -> println("Segundo trimestre")
        in 7..9 -> println("Tercer trimestre")
        in 10..12 -> println("Cuarto trimestre")
        else -> println("Mes no valido")
    }
}
fun getSemester(month:Int):String{
   return when(month){
        in 1..6 -> "Primer semestre"
        in 7..12 -> "Segundo semestre"
        !in 1..12 -> "Mes no valido"
        else -> "Esto hay que ponerlo obligado pero lo de arriba hace lo mismo"
    }
}
fun result(value:Any){
    when(value){
        is Int -> println(value + value)
        is String -> println(value)
        is Boolean -> if(value) println("Es verdadero") else println("Es falso")
    }
}