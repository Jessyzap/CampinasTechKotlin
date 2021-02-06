package basico.ex0602

/*
Faça um programa para ler: quantidade atual em estoque, quantidade máxima em estoque e
quantidade mínima em estoque de um produto. Calcular e escrever a quantidade média ((quantidade
média = quantidade máxima + quantidade mínima)/2). Se a quantidade em estoque for maior ou igual
a quantidade média escrever a mensagem 'Não efetuar compra', senão escrever a mensagem 'Efetuar
compra', use função
*/

fun main() {

    inserirDadosEstoque()
}

fun inserirDadosEstoque() {

    println("Digite a quantidade atual em estoque:")
    val qntdAtual = readLine()!!.toInt()
    println("Digite a quantidade máxima em estoque:")
    val qntdMaxima = readLine()!!.toInt()
    println("Digite a quantidade mínima em estoque:")
    val qntdMinima = readLine()!!.toInt()

    println(calcularEstoque(qntdAtual,qntdMaxima,qntdMinima))
}

fun calcularEstoque(qntdAtual: Int,qntdMaxima: Int,qntdMinima: Int): String {

    val media = ((qntdMaxima + qntdMinima) / 2)

    val confirmacao = if (qntdAtual >= media) "Não efetuar a compra"
    else "Efetuar a compra"

    return ("Média do estoque: $media  Status: $confirmacao")
}
