import java.util.Scanner

fun main(args: Array<String>) {
    var age = 20

    if (age>18){
        println("You are $age so you can vote")
    }
    else{
        println("You are $age and so you are not allowed to vote")
    }

    var number = 3
    if(number==1){
        println("You lost the game")
    }
        else if(number==2){
            println("You almost got it right")
        }
    else if(number==3){
        println("Congratulations you got it right")
    }
    else{
        println("$number is not valid")
    }


//when statement
var read = Scanner(System.`in`)
    println("Key in a number here")
    var namba = readLine()
    when(namba){
        "1" -> println("You lost the guess")
        "2" -> println("You almost got it right")
        "3" -> println("Congratulations you got it right")
        else -> println("$namba is not  valid please key in a number between 1 and 3")
    }


var myArray = arrayOf("Opera","chrome","firefox","safari","Brave")
for (browser in myArray){
    println(browser)
}
var num = 4
while (num<=10){
    println("LOOP: $num")
    num++
}




}















