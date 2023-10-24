interface InterfaceLearn {

    fun swim()

    fun run() {
        println("Im running!")
    }
}

class student : InterfaceLearn {
    override fun swim() {
        print("swim method must be override!!!!!")
    }

    // while run method is not necessary to be implemented, because it has the default method
    // just like virtual function in cpp
}