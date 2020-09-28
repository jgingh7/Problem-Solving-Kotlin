package mathEasy

//This makes it easier to add or subtract conditions than the code below this
//Your runtime beats 98.17 % of kotlin submissions. O(n)
//Space Complexity: O(n)
fun fizzBuzz(n: Int): List<String> {
    val res = ArrayList<String>()
    for (i in 1..n) {
        var ans = ""
        var divisibleBy3 = (i % 3 == 0)
        var divisibleBy5 = (i % 5 == 0)

        if (divisibleBy3) { // if divisible by 3, append Fizz
            ans += "Fizz"
        }
        if (divisibleBy5) { // if divisible by 5, append Buzz (this would make FizzBuzz for divisible by 15)
            ans += "Buzz"
        }
        if (!divisibleBy3 && !divisibleBy5) {
            ans = "$i"
        }
        res.add(ans) // add the answer to the List
    }
    return res
}

////Your runtime beats 77.06 % of kotlin submissions. O(n)
////Space Complexity: O(n)
//fun fizzBuzz(n: Int): List<String> {
//    val res = ArrayList<String>()
//    for (i in 1..n) {
//        when {
//            i % 15 == 0 -> res.add("FizzBuzz")
//            i % 3 == 0 -> res.add("Fizz")
//            i % 5 == 0 -> res.add("Buzz")
//            else -> res.add("$i")
//        }
//    }
//    return res
//}

