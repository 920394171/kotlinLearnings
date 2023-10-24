fun main() {
//     you can write a single lambda method separately, but a better way is to write it in the maxBy() method
//    val lam = {one:String->
//        one.length
//    }

    val list = listOf("1", "111", "err", "werwwe", "ewrewefef")

    // maxBy API
//    val max_length_element = list.maxBy(lam) // original way
    val maxLengthElement = list.maxBy { it.length } // better way
    println(maxLengthElement)

    // map API
    val newMapList = list.map { it[0] }
    println(newMapList)

    // filter API
    val newFilterList = list.filter { it.length<=3 }
    println(newFilterList)

    // JAVA 函数式API，即kl如果调用了一个java方法，该方法接收一个java单抽象方法接口参数，则可以使用函数式API
    /*
     例如， 点击事件接口：
    public interface OnClickListener {
        void onClick(View v);
    }
    就是一个单抽象方法接口，如果有一个java函数需要传单抽象方法接口，且参数列表中的单抽象方法接口只有这一个，则可以使用函数式API，例如：
    button.setOnClickListener(new View.OnClickListener(){
        @override
        public void click(View v){
            ...
        }
    }
    就可以变成：
    button.setOnClickListener{
        ...
    }
    1. 单抽象方法接口只有一个抽象方法，所以可以省略函数名直接实现函数体
    2. java方法中参数只有这一个单抽象方法接口参数，则可以省略接口名
    3. java方法不需要传入别的参数，则可以省略小括号，只留大括号填写接口的抽象方法函数体

     */
}