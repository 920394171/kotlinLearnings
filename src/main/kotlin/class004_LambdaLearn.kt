fun main() {

//    两种匿名函数：
//      第一种用到:，需要显示指明参数类型和返回值类型，也需要return语句。
//    1. val lam :(Int, Int, String)->String {val1, val2, val3->
//        return "xxx"
//    }
//      第二种直接用=，不用指明返回值类型，也不用写return。自动推断返回值类型。
//    2. val lam = {val1:String, val2:Int->
//        "hello, $val1, nice to meet your $val2."
//    }

    val lam = {val1:String, val2:Int->
        "hello, $val1, nice to meet your $val2."
    }

    println(lam("ttzz", 18))

}

