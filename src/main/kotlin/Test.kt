import java.util.Scanner

fun main() {

    var a = 5

    for (i in 1..a) {
        println("$i - Hello World")
    }

    var name: String

    println("Enter your name: ")
    val scanner = Scanner(System.`in`)

    name = scanner.next()

    println("Hello, $name")

    println("Enter your surname: ")
    var surname = scanner.next()


    println("Your surname is $surname. right?")



}