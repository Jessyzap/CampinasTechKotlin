package basico.ex0202

/*
Crie uma variável que faça a validação: a = 3, b = 5, c = 1
a deve ser maior que b e c , mas b deve ser menor que c
Mostre a expressão e o resultado na tela
 */

fun main() {

    var a = 3
    var b = 5
    var c = 1

    if (a < b || a < c) {
        a = 5
    }

    if (b > c) {
        b = 1
        c = 3
    }

    var d = a == 3
    var e = b == 5
    var f = c == 1

    println ("a = 3? $d    a = $a")
    println ("b = 5? $e    b = $b")
    println ("c = 1? $f    c = $c")
}