open class Player (val name: String, val age: String, val gender: String) {
    fun attack() {

    }
    fun defend() {

    }
    fun walk() {

    }
}

class Thief(name: String, age: String, gender: String, val item: String): Player (name, age, gender) {
    fun steal() {

    }
}

class Warrior(name: String, age: String, gender: String, val castle: String): Player (name, age, gender) {
    fun enterCastle() {

    }
}