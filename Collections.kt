fun main(args: Array<String>) {

    // Array
    // arrays cannot be compared with "==" "!=" // compares memory address
    var myArray = Array<Int>(5) { 0 } // Mutable(can change the elements), Fixed Size, Sequential
    myArray[0] = 32
    val a = arrayOf(0,0,0,0,0) // cannot change the array a to another array (val)

    // List
    // lists can be compared by "==" "!=" // when comparing, sequence matters
    var list1 = listOf<String>("VV", "Yogi", "MM") // Immutable, Fixed Size, Sequential
    var list2 = mutableListOf<String>("Yogi", "MM", "VV") // Mutable, No Fixed Size(can add and delete), Sequential
    //mutableList and arrayList are same

    // Map
    // maps can be compared by "==" "!="
    var myMap1 = mapOf<Int, Int>(1 to 2, 2 to 3) // Immutable, Fixed Size, Sequence does not matter
    var myMap2 = hashMapOf<Int, Int>(1 to 2, 2 to 3) // Mutable, No Fixed Size, Sequence does not matter
    //mutableMap and hashMap is considerably the same (mutableListOf returns LinkedHashMap)

    // Set
    // maps can be compared by "==" "!=" // when comparing, sequence does not matter
    var mySet1 = setOf<Int>(2,5,3,5,8,4,2,3,8) // Immutable, Sequential
    var mySet2 = mutableSetOf<Int>(2,5,3,5,8,4,2,3,8) // Mutable, Sequential
    var mySet3 = hashSetOf<Int>(2,5,3,5,8,4,2,3,8) // Mutable, Sequence does not matter


    //static
    val imperials = listOf("Emperor", "Darth Vadar", "Boba Fett", "Tarkin")
    println(imperials.sorted())
    println(imperials[3])
    println(imperials.first())
    println(imperials.last())
    println(imperials.contains("Emperor"))
    println(imperials)

    // dynamic
    val rebels = arrayListOf("Leiah", "Luke", "Han Solo", "Mon Mothma")
    println(rebels.size)
    rebels.add("Chewbacca")
    rebels.remove("Leiah")
    println("this $rebels")

    // static
    val rebelVehiclesMap = mapOf("Solo" to "Millenium Flacon", "Luke" to "Landspeeder")
    println(rebelVehiclesMap["Solo"])
    println(rebelVehiclesMap.get("Solo"))
    println(rebelVehiclesMap.getOrDefault("Leiah", "This ship doesn't exist"))
    println(rebelVehiclesMap.values)

    // dynamic
    val rebelVehicles = hashMapOf("Solo" to "Millenium Flacon", "Luke" to "Landspeeder")
    rebelVehicles["Luke"] = "XWing"
    println(rebelVehicles)
    rebelVehicles.put("Leiah", "Tantive IV")
    println(rebelVehicles)
    val rebel = mutableMapOf("Solo" to "Millenium Flacon", "Luke" to "Landspeeder")
    rebel.put("A", "B")
    rebel.remove("A")
    rebel.remove("Solo")
    println(rebel)
}