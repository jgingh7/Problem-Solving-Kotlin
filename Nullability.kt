fun main(args: Array<String>) {
    var name: String = "JonnyB"
    //name = null

    var nullableName: String? = "Do I realy exist?"
    //nullableName = null

    //1st method: Null Check
    var length = 0
    if (nullableName != null) {
        length = nullableName.length
    } else {
        length = -1
    }

    println(length)

    val l = if (nullableName != null) nullableName.length else -1

    //2nd method: Safe Call Operator
    println(nullableName?.length)

    //3rd method: Elvis Operator
    val len = nullableName?.length ?:-1
    val noName = nullableName?: "No one knows me"
    println(noName)

    // !! Introducing null value in the app (can get NullPointerException error)
    println(nullableName!!.length)
}