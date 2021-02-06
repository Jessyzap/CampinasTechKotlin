package basico.operadores

fun main() {

    /*
    val valor: Any = 1

    if(valor is String) {
        println(valor)
    }else{
        println("Não é uma String")
    }
    if(valor is String) println(valor) else println("Não é uma String")
    */

    val x = true
    mostrarStringOuSoma(x)
}

fun mostrarStringOuSoma(x: Any) {
    when(x) {
        is String -> println(x.toUpperCase())
        is Int -> println(x.plus(3))
        else -> println("diferente de String e Int")
    }

}
