package basico.controle

fun main() {

/*
    val alunos = listOf("Huelton", "Carlos", "Jose")

    for ((indice, aluno) in alunos.withIndex()) {
        println("posição ${indice + 1} - $aluno")
    }


    for (i in 1..10) {
        if (i == 5) {
            break
        }
    }

    for (i in 1..10) {
        if (i == 5) {
            println("entrou no if com continue")
            continue
        }
        println("$i")
    }

    val valores: MutableList<Double> = mutableListOf(3.0,2.0,4.0)

    for (valor in valores){
        println("valor do produto $valor")
    }

    for (i in 1..10) {
        println(i)
    }

    for (i in 10 downTo 1) {
        println(i)
    }

    for (i in 1..10 step 2) {
        println(i)
    }

    for (i in 10 downTo 1 step 2) {
        println(i)
    }

    val lista2 = mutableSetOf<String>()

    for(i in 0..5){
        lista2.add("a")
    }
    println(lista2)

    */

    // Argumentos ou parâmetros nomeados
    println(nivelHierarquico(chefe = "Maria", funcionario = "Jose"))
}

fun nivelHierarquico(funcionario: String, chefe: String): String {
    return "$funcionario trabalha para a $chefe"

}


