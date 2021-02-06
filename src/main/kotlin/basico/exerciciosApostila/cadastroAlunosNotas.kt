package basico.exerciciosApostila

fun main() {

    val listaTodos: MutableList<Any> = mutableListOf()

    do {
        print("Digite o nome do aluno: ")
        val aluno = readLine().toString()
        listaTodos.add("\n$aluno,")

        print("Digite a idade do aluno: ")
        val idade = readLine()!!.toInt()
        listaTodos.add("idade: $idade,")

        print("Digite a 1ª nota do aluno: ")
        val nota1 = readLine()!!.toInt()
        listaTodos.add("1ª nota: $nota1,")

        print("Digite a 2ª nota do aluno: ")
        val nota2 = readLine()!!.toInt()
        listaTodos.add("2ª nota: $nota2")

        println("Cadastrar mais um aluno? S/N ")
        val opcao = readLine().toString()

    } while(opcao == "s" || opcao == "S")

    for (item in listaTodos) {
        print("$item ")
    }
    println()
}
