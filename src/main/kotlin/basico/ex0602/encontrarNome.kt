package basico.ex0602

/*
Escreva um Programa que permita a leitura dos nomes de 10 pessoas e armaze os os nomes lidos em uma lista.
Após isto, o programa deve permitir a leitura de mais 1 nome qualquer de pessoa e depois escrever
a mensagem ACHEI, se o nome estiver entre os 10 nomes lidos anteriormente (guardados na lista),
ou NÃO ACHEI caso contrário.
*/

fun main() {
    inserirNome()
}

fun inserirNome() {

    val listaNomes: MutableList<String> = mutableListOf()

    var i = 0
    while (i < 10) {
        print("Digite o nome para a ${i + 1}ª posição: ")
        val nome = readLine().toString()
        listaNomes.add(nome)
        i += 1
    }
    println(verificarNome(listaNomes))
}

fun verificarNome(listaNomes: MutableList<String>): String {

    println("Digite o nome a ser pesquisado:")
    val pesquisaNome = readLine().toString()

    for ((i, nome) in listaNomes.withIndex()) {
        if (nome == pesquisaNome)
        return "ENCONTREI! O NOME $nome ESTÁ NA ${i + 1}ª POSIÇÃO "
    }
    return "NÃO ENCONTREI!"
}