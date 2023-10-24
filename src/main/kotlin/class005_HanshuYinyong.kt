import kotlin.math.max

fun main() {
//    login("ttzzz", "123456") { msg, code ->
//        println("msg:$msg, code:$code")
//        "msg:$msg, code:$code"
//    }

    login("tttzz", "123456", ::record)
    login("ttzz", "123456", ::record)
}

fun record(msg: String, code: Int): String {
    println("msg:$msg, code:$code")
    return "msg:$msg, code:$code"
}

fun login(name: String, password: String, callback: (String, Int) -> String) {
    if (name == "ttzz" && password == "123456") {
        callback("success", 200)
    } else {
        callback("failed", 404)
    }
}

fun getGreater(num1: Int, num2: Int) = max(num1, num2)