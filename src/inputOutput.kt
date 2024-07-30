import java.util.Scanner

fun main(args: Array<String>) {
//    println("Please type your name here:")
//    var enteredname = readLine()
//    println(enteredname)
//
//    println("What is your age?")
//    var enteredage = readLine()
//    println("You have entered your age as $enteredage")
////
//    println("Where do you stay?")
//    var enteredstay = readLine()
//    println("How many children do you have?")
//    var enteredchildren = readLine()
//    println("I stay in $enteredstay with $enteredchildren children")

    var read = Scanner(System.`in`)
    println("Please enter first number:")
    val firstNumber = read.nextFloat()
    println("Please enter second number: ")
    val secondNumber = read.nextFloat()
    val sumALL = firstNumber + secondNumber
    println("The total is $sumALL")


}