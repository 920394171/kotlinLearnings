class FieldLearn {
    var age:Int = 0
        get() = (1..10).shuffled().first()
        set(newOne) { field = newOne }
}


fun main() {
    val fieldLearn = FieldLearn()
    println(fieldLearn.age)
    fieldLearn.age = 2
    println(fieldLearn.age)
}