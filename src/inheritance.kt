fun main(args: Array<String>) {
    val mathTeacher1 = MathTeacher("Andrew",23)
    println(mathTeacher1.TeacherMath())
    val mathTeacher2 = MathTeacher("John",32)
    println(mathTeacher2.TeacherMath())
    val scienceTeacher1 = ScienceTeacher("Ian",35)
    println(scienceTeacher1.Teacherscience())
    var englishteacher1 = EnglishTeacher("Festus",27)
    println(englishteacher1.TeacherEnglish())
    var geographyteacher1 = GeographyTeacher("Emmanuel",38)
    println(geographyteacher1.Teachergeography())
    var biologyteacher1 = BiologyTeacher("Sudi",27)
    println(biologyteacher1.Teacherbiology())

}
open class Teacher(var name: String,var age:Int){
    init {
        println("My name is $name")
        println("I am $age years old")
    }
}
class MathTeacher(name: String,age: Int):Teacher(name,age){
    fun TeacherMath(){
        println("I teach Mathematics")
    }
}
class ScienceTeacher(name:String,age:Int):Teacher(name,age){
    fun Teacherscience(){
        println("I teach science")
    }
}
class EnglishTeacher(name:String,age:Int):Teacher(name,age){
    fun TeacherEnglish(){
        println("I teach English")
    }
}
class GeographyTeacher(name:String,age:Int):Teacher(name,age) {
    fun Teachergeography() {
        println("I teach Geography")
    }
}
class BiologyTeacher(name:String,age:Int):Teacher(name,age){
    fun Teacherbiology(){
        println("I teach Biology")
    }
}


