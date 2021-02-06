package basico.exerciciosApostila

fun main() {

    for (i in 0..299 step 10) {
        println(i)
        if (i == 290) {
            println("Não foi possível chegar até 300 na iteração")
            break
        }
    }
}