package test

import java.util.*

class TubeTest {

    fun setNodeType(nodeTypeStr: String?):Int {
        return when (nodeTypeStr) {
            "��ʼ�ڵ�" -> 1
            "�����ڵ�" -> 2
            else -> 3
        }
    }

}

fun main() {
    val tubeTest = TubeTest()
    tubeTest.setNodeType("�����ڵ�")

    var a:Int = 0
    println("${++a}")
    println("${a++}")
}

