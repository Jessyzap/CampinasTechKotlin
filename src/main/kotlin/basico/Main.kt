package basico

// comentário

/*
 primeira linha
 segunda linha
 */

fun main() {

   /* println("Hello World Kotlin!")

    val a: Int     // imutável
    a = 5

    var b: Int
    b = 10
    b = 15

    var x = 10   // inferência de tipo
    println(a + b + x)

    var c = 3
    val d = 2.3

    println(a + b + c)

    c = c + d.toInt()
    println(c) */


    val num1: Int = 1111111110
    val num2: Long = 2222222222222222222
    val num3: Byte = 127
    val num4: Short = 3333
    val num5: Double = 3.14
    val num6: Float = 3.14f
    val num7 = true
    val num8: Char = 'K'
    val num9: String = "Olá mundo"
    var num10 : Any // aceita qualquer tipo

    num10 = true
    num10 = 10

    println(num7 is Boolean)
    println(num3.dec())

}