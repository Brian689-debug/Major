fun main(args: Array<String>) {
println(birthdayGreeting("George",24,"Nairobi"))
println(birthdayGreeting("Esther",21,"Naivasha"))
println(birthdayGreeting("Ann",19))
println(calculateArea(8.0,4.0))
println(calculateAreaCircle(3.142,5.2))
println(calculateBMI())
}
fun birthdayGreeting(name:String,age:Int,location:String="Nairobi"): String{
val a = "Happy birthday $name"
val b = "You are $age years old"
val c = "You are celebrated"
val d = "This comes from $location"
return "$a\n$b\n$c\n$d"
}

fun calculateArea(length: Double,width:Double): Double{
    return length * width


}
    fun calculateAreaCircle(pie:Double,radius:Double=3.142):Double {
        return pie * radius * radius
    }

fun calculateBMI(height:Int=2,weight:Int=60):Int{
    return height * weight
}















