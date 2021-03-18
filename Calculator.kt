import java.util.Scanner
import kotlin.Float as Float

fun main() {

    var a1: Float
    var a2: Float
    var inputnumber: Float
    println("|------------------|")
    println("|   CALCULADORA    |")
    println("|------------------|")
    println("|   |7||8||9||/|   |")
    println("|   |4||5||6||*|   |")
    println("|   |1||2||3||-|   |")
    println("|   |   0   ||+|   |")
    println("|------------------|")


    println("Primeiro número :\n")


   // var a1 = inputnumber.nextLine()F


    //var a1 = 10.0F
   // var a2 = 5.0F





    val input = Scanner(System.`in`)
    println("escolha as operações:\n" +
            "|+||-||*||/| ")

    val operator = input.nextLine()
    println(operator)

    //when (operator) {
   //     "+" -> println(sum(a1,a2))
   //     "-" -> println(sub(a1,a2))
    //    "*"-> println(mult(a1,a2))
    //   "/" -> print(div(a1,a2))

     //   else -> { return print("valor não encontrado")

      //  }
    //}



}

fun sum(a1: Float, a2: Float) = a1.plus(a2)
fun sub(a1: Float, a2: Float) = a1.minus(a2)
fun mult(a1: Float, a2: Float) = a1.times(a2)
fun div(a1: Float, a2: Float) : Float {return a1/a2}