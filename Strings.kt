fun main(args: Array<String>) {
    val str = "May the force be with you."
    println(str)

    val str1 = "My dad said the funnies thing he said \"A joke\" haha"
    println(str1)

    val rawCrawl = """|Along time ago
        |in a agalaxy
        |far far away
        |dnidfjdklfa
    """.trimMargin()

    println(rawCrawl)

//    for (char in str){
//        println(char)
//    }

    val contentEquals = str.contentEquals("May the force be with you.")
    println(contentEquals)

    val contains = str.contains("Force",false)
    println(contains)

    val uppercase = str.toUpperCase()
    val lower = str.toLowerCase()

    println(uppercase)
    println(lower)

    val luke = "Luke Skywalker"
    val lightSaberColor = "green"
    val vehicle = "landspeeder"
    val age = 27

    println("$luke has a $lightSaberColor lightsaber and drives a $vehicle and is $age years old")
}