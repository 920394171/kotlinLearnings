/**
 * 在kotlin中，所有类型默认都不为null值，所以如果想要有null值，就要设置可空类型系统
 * 具体来说就是在类型后面加一个问号即可！！！！
 */

var globalStr :String? = null

fun main() {
    getLength(null)
}

/**
 * 1. str: String?
 * 此时使用问号即可以让传来的实参为null，但同时函数体内部涉及到调用str的方法的地方都需要用if str!=null环绕
 * 不然会报错
 */
fun getLength(str: String?): Int {
    if (str != null) {
        return str.length
    } else {
        return 0
    }
}

/**
 * 2. a?.doSomething()
 * 此时会对变量a进行判断，如果a不为空才执行后面的方法，为空则不执行。
 */
fun testADoSomething(a: String?): Int? {
    return a?.length
}

/**
 * 3. a ?: b
 * 此时会先判断a是否为空，不为空则返回a的值，否则返回b的值
 * 可以结合a?.doSomething()一起使用，来规定a为空值时要执行的语句
 * 总而言之，通过?.来规定a不为空时的操作，通过?:来规定a为空时的操作
 */
fun testAOrB(a: String?): Int {
    return a?.length ?: 0
}

/**
 * 4. a!!.doSomething()
 * 非空断言，自己非常确信此处不会为空才加上
 */
fun testNOTNULL(a: String?) {
    println(a!!.length)
}

/**
 * 5. a?.let{obj->...}
 * let方法就是把自身传进去成为obj，再执行后面的
 * 这样做的好处是不需要写多行a?.了，只需要判断一次即可执行后面的let
 */
fun testLetMethod(a: String?) {
    // 以前的写法
    a?.length
    a?.get(0)

    // 现在使用let后
    a?.let {
        it.length
        it[0]
    }
}

/**
 * 补充一点，如果使用if对全局变量判空，还是会报错，因为随时可能有其他进程改变全局变量的值，导致其变空，而使用let则不会有此问题
 */
fun testLetGlobal(){
//    if(globalStr != null){
//        val length = globalStr.length // Error: Smart cast to 'String' is impossible, because 'globalStr' is a mutable property that could have been changed by this time
//        val c = globalStr[0] // Error: Smart cast to 'String' is impossible, because 'globalStr' is a mutable property that could have been changed by this time
//    }
}