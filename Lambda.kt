fun main(args: Array<String>) {

    // "message" is the parameter passed into function literal
    // right side of the arrow: the body of the function literal
    val printMessage = {message: String -> println(message)}
    printMessage("Hello")

    // can have multiple parameters
    val sumA = { x: Int, y: Int -> x + y }
    println(sumA(5,3)) // result: 8

    // same as SumA
    val sumB : (Int, Int) -> Int = {x,y -> x+y}
    println(sumB(5,3)) // result: 8

    // Unit is equivalent of "void" in Java
    fun downloadData(url: String, completion: () -> Unit) {
        // sent a download request
        // we got back data
        // there were no network errors
        completion()
    }

    // call downloadDataFunction
    downloadData("fakeUrl.com") {
        println("The code in this block, will only run after the completion()")
    }

    fun downloadCarData(url: String, completion: (Car) -> Unit){
        // send a download request
        // we got back car data
        val car = Car("Tesla", "ModelX","Blue")
        completion(car)
    }

    downloadCarData("fakeUrl.com"){car ->
        println(car.color)
        println(car.make)
    }

    // if only one parameter is passed, parameter can be erased, and "it" can be used
    downloadCarData("fakeUrl.com"){
        println(it.color)
        println(it.make)
    }

    fun downloadTruckData(url: String, completion: (Truck?, Boolean) -> Unit) {
        // make the web request
        // we get the results back
        val webRequestSuccess = false
        if (webRequestSuccess) {
            // received truck data
            val truck = Truck ("Ford","F-150",10000)
            completion(truck, true)
        } else {
            completion(null, false)
        }
    }

    downloadTruckData("fakeUrl.com") { truck, success ->
        if (success) {
            // do something with our truck
            truck?.tow()
        } else {
            // handle the web request failure
            println("Something went wrong!")
        }
    }
}