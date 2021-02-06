package basico.controle

fun main() {

    //val leitura = Scanner(System.`in`)
    val valores: MutableList<Double> = mutableListOf()
    var opcao: String = ""

    //readLine()!!.toDouble()

    /*
    while (opcao != "N" && opcao != "n") {

        println("Digite o valor desejado:")
        val compra = readLine()!!.toDouble()
        valores.add(compra)

        println("Continuar? S/N")
        opcao = readLine() ?: "N"
    }
    */

    do {

        println("Digite o valor desejado:")
        val compra = readLine()!!.toDouble()
        valores.add(compra)

        println("Continuar? S/N")
        opcao = readLine() ?: "N"

    } while (opcao != "N" && opcao != "n")   // Repita até

    println(valores)
}