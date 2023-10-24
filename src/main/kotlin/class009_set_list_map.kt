fun main() {
    val list = listOf("apple", "banana", "orange")
    val mutableList = mutableListOf("apple", "banana", "orange")
    val set = setOf("apple", "banana", "apple")
    val mutableSet = mutableSetOf("apple", "banana", "apple")
    val map = mapOf("apple" to 1, "banana" to 2)
    val mutableMap = mutableMapOf("apple" to 1, "banana" to 2)

    // list/set add:
    mutableList.add("orange")
    mutableSet.add("orange")

    // map add:
    mutableMap["orange"] = 3

    // iterate the map:
    for((k, v) in mutableMap){
        println("key:$k, value:$v")
    }
}