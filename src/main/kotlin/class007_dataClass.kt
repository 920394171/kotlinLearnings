data class class007_dataClass(var name:String, var age:Int)
// data class is just as same as the Model Layer of the MVVM and the MVC pattern.
// it will implement the equals(), hashCode() and so on automatically.

class class007_defaultClass(var name:String, var age:Int)


fun main() {
    val data1 = class007_dataClass("ttzz", 18)
    val data2 = class007_dataClass("ttzz", 18)

    val data3 = class007_defaultClass("ttzz", 18)
    val data4 = class007_defaultClass("ttzz", 18)
    println(data1 == data2) // true
    print(data3 == data4) // false
}