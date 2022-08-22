import java.util.Scanner

fun main() {

    var a = 5

    for (i in 1..a) {
        println("$i - Hello World")
    }

    var name: String

    val scanner = Scanner(System.`in`)

    name = scanner.next()

    println("Hello, $name")



}