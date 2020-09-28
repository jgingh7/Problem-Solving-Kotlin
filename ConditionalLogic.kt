fun main(args: Array<String>) {
    val a = 2
    val b = 2

    if (a == b) {
        println("A equals B")
    }

    if (a != b) {
        println("A does not equal B")
    }

    val accountBalance = 100
    val price = 50

    val x = 1

    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> println("x does not equal 1 or 2")
    }

    fun vaderIsFeeling(mood: String = "angry") {
        when (mood){
            "angry" -> println("run for the hills, Vader is $mood")
            else -> println("don't make him angry")
        }
    }

    vaderIsFeeling("dfd")

}
