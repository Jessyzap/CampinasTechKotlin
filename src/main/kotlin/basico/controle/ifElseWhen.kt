package basico.controle

fun main() {

    val nota: Double = 4.0

    /*
    if(nota in 9.0..10.0) {
        println("Ótima nota")
    }else if(nota in 7.0..8.9) {
        println("Boa nota")
    } else if(nota in 4.0..6.9) {
        println("Recuperação")
    }else if (nota in 0.0..3.99) {
        println("Não passou")
    }else {
        println("Nota inválida")
    }
    */

    when(nota) {
        in 10.0..9.0 -> println("Ótima nota")
        8.99,7.0 -> println("Boa nota")
        6.99,4.0 -> println("Recuperação")
        3.99,0.0 -> println("Não Passou")
        else -> println("Nota inválida")
    }

    /*
    val sentimento = true

    println("Hoje estou ${if (sentimento) "Alegre" else "Triste"}")

    val resultado = if (nota >= 7.0) {
        println("Passou!!!")
    } else {
        println("Não passou!")
    }
    println(resultado)

    val result = if (nota >= 7.0) "Passou!!!" else if (nota >= 5 && nota < 7) "Recuperação" else "Não passou!"
    println(result)


    fun obterResultado(nota: Double): String =
        if (nota >= 7.0) "Passou!!!" else if (nota >= 5 && nota < 7) "Recuperação" else "Não passou!"
        */
}