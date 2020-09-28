//-2 WAYS OF DECLARING CONSTRUCTOR
//class Car constructor(make: String, model: String) {
//    val make = make
//    val model = model
//}
//
//class Car (val make: String, val model: String) {
//}
//
//fun main(args: Array<String>) {
//    val car = Car("Toyota","Avalon")
//    println(car.make)
//    println(car.model)
//}

//-MAKING FUNCTION IN A CLASS
//class Car (val make: String, val model: String) {
//    fun accelerate() {
//        println("VROOM!")
//    }
//}
//
//fun main(args: Array<String>) {
//    val car = Car("Toyota","Avalon")
//    car.accelerate()
//}

//-MAKING ANOTHER CLASS
//class Car (val make: String, val model: String) {
//    fun accelerate() {
//        println("VROOM!")
//    }
//}
//
//class Truck(val make: String, val model: String, val towingCapacity: Int) {
//    fun tow(){
//        println("taking the horse to the rodeo")
//    }
//}
//
//fun main(args: Array<String>) {
//    val car = Car("Toyota","Avalon")
//    car.accelerate()
//    val truck = Truck("Ford","F-150",10000)
//    truck.tow()
//}

//-MAKING ANOTHER FUNCTION
//class Car (val make: String, val model: String, var color: String) {
//    fun accelerate() {
//        println("VROOM!")
//    }
//
//    fun details() {
//        println("This is a color $color $make $model")
//    }
//}
//
//class Truck(val make: String, val model: String, val towingCapacity: Int) {
//    fun tow(){
//        println("taking the horse to the rodeo")
//    }
//
//    fun details() {
//        println("The $make $model has a towing capacity of $towingCapacity lbs")
//    }
//}
//
//fun main(args: Array<String>) {
//    val car = Car("Toyota","Avalon","Red")
//    car.accelerate()
//    car.details()
//    val truck = Truck("Ford","F-150",10000)
//    truck.tow()
//    truck.details()
//}

//-Inheritance
//open class Vehicle (val make: String, val model: String){
//    fun accelerate() {
//        println("VROOM!")
//    }
//
//    fun park() {
//        println("parking the vehicle")
//    }
//
//    fun brake() {
//        println("STOP")
//    }
//}
//
//class Car(make: String, model: String, var color: String) : Vehicle(make, model) {
//
//}
//
//class Truck(make: String, model: String, val towingCapacity: Int) : Vehicle(make, model) {
//
//}
//
//fun main(args: Array<String>) {
//    val tesla = Car("Tesla","ModelS","Red")
//    tesla.accelerate()
//
//    val truck = Truck("Ford","F-150",10000)
//}
//
// -Overriding
//open class Vehicle (val make: String, val model: String){
//    open fun accelerate() {
//        println("VROOM!")
//    }
//
//    fun park() {
//        println("parking the vehicle")
//    }
//
//    fun brake() {
//        println("STOP")
//    }
//}
//
//class Car(make: String, model: String, var color: String) : Vehicle(make, model) {
//    override fun accelerate() {
//        println("We are going ludicrous mode!")
//    }
//}
//
//fun main(args: Array<String>) {
//    val tesla = Car("Tesla","ModelS","Red")
//    tesla.accelerate()
//}

open class Vehicle (val make: String, val model: String){
    open fun accelerate() {
        println("VROOM!")
    }

    fun park() {
        println("parking the vehicle")
    }

    fun brake() {
        println("STOP")
    }
}

class Car(make: String, model: String, var color: String) : Vehicle(make, model) {
    override fun accelerate() {
        println("We are going ludicrous mode!")
    }
}

class Truck(make: String, model: String, val towingCapacity: Int) : Vehicle(make, model) {
    fun tow() {
        println("headed out to the mountains!")
    }
}

fun main(args: Array<String>) {
    val tesla = Car("Tesla","ModelS","Red")
    tesla.accelerate()

    val truck = Truck("Ford","F-150",10000)
}