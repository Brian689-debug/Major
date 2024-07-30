fun main(args: Array<String>) {
    val obj1 = Person("George",23)
    println(obj1.name)
    println(obj1.age)
    println(obj1.canVote(23))


    val obj2 = Person("Esther",37)
    println(obj2.name)
    println(obj2.age)
    println(obj2.canVote(37))

    val obj3 = Person("Peter",33)
    println(obj3.name)
    println(obj3.age)
    println(obj3.canVote(33))
//    instances of class bulb
    val bulb1 = Bulb()
    bulb1.turnOn()
    println(bulb1.displayBulbstatus())
    bulb1.turnOff()
    println(bulb1.displayBulbstatus())

    val bulb2 = Bulb()
    bulb2.turnOn()
    println(bulb2.displayBulbstatus())
    bulb2.turnOff()
    println(bulb2.displayBulbstatus())

 val animal1 = Animal()
    animal1.identify()
    println(animal1.identifyanimalstatus())

}
class Person(var name: String,var age:Int){
    fun canVote(age: Int){
        if (age>18){
            println("You can vote")
        }
        else{
            println("You cannot vote")
        }
    }
}
class Bulb(){
    var isOn: Boolean=false
    fun turnOn(){
       isOn = true
    }
    fun turnOff(){
        isOn = false
    }
    fun displayBulbstatus(){
        if(isOn==true){
            println("Bulb is on")
        }
        else{
            println("Bulb is off")
        }
    }
}

class Bulb2(){
    var isOn: Boolean=false
    fun turnOn(){
        isOn = true
    }
    fun turnOff(){
        isOn = false
    }
    fun displayBulbstatus(){
        if(isOn==true){
            println("Bulb is on")
        }
        else{
            println("Bulb is off")
        }
    }
}

class Animal(){
    var iscat: Boolean = false
    fun identify(){
        iscat = true
    }
    fun unidentify(){
        iscat = false
    }
    fun identifyanimalstatus(){
        if(iscat==true){
            println("The animal is strong")
        }
        else{
            println("The animal is not strong")
        }
    }
}







