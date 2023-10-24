object class008_singleton {
    fun printSingleton(){
        println("singleton has called")
    }
}
// just use object

fun main() {
    val singleton = class008_singleton
    singleton.printSingleton() // singleton has called
}