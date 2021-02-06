package basico.exerciciosApostila

fun main() {

    for (i in 0..200 step 2) {
        if (i in 96..99) {
            println("Entrou no continue!")
            continue
        }
        println(i)
    }
}