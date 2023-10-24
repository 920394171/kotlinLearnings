fun main() {
    fuck("cby", 22)

    val write = write("13")
    println(write)

    val myclass = myclass("111")
    val count = "111222".count {
        it == '2'
    }
    println(count)

    val lambdas:(String)->String = { it->
        it
    }

    val lambdas2:(String)->String = {
        it
    }

    val str:String = lambdas("11")
    println(str)
}

fun run(name: String) {
    println("$name is running!")
}

fun fuck(name: String, age: Int): Boolean {
    return if (age in 0..18) {
        false
    } else {
        println("${name} gets fucked.")
        true
    }
}

fun write(word: String, pen: String = "baile"): Boolean {
    return if (word == "123") {
        pen == "baile"
    } else {
        false
    }
}

fun write(word: String): Boolean {
    return word == "123"
}

class myclass(var name: String) {

    fun count(): Int {
        return name.count()
    }
}
