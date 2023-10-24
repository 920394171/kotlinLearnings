open class Person(val name: String, val age: Int) {
}

class Student(val sno:String, val grade:Int, name: String, age: Int) : Person(name, age) {

}

class worker() : Person("", 18) {
}



fun main() {
    val student = Student("190603212", 3, "ttzz", 22)

}