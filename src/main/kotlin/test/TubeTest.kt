package test

import java.util.*

class TubeTest {

    fun setNodeType(nodeTypeStr: String?):Int {
        return when (nodeTypeStr) {
            "起始节点" -> 1
            "结束节点" -> 2
            else -> 3
        }
    }

}

fun main() {
    val tubeTest = TubeTest()
    tubeTest.setNodeType("结束节点")

    var a:Int = 0
    println("${++a}")
    println("${a++}")
}

