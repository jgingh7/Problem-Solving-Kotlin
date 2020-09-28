package mathEasy

//Your runtime beats 86.44 % of kotlin submissions. O(n)
// - outer while loop is O(n^0.5)
//   and inner while lop is O(n^0.5) because multiple is currNum^2
//Space Complexity: O(n) - the BooleanArray
fun countPrimes(n: Int): Int {
    if (n == 0) return 0
    if (n == 1) return 0
    val primes = BooleanArray(n) { true } // from 0..n-1, mark them true
    primes[0] = false
    primes[1] = false

    var currNum = 2
    while (currNum * currNum <= n) { // checking until sqrt(n)
        if (primes[currNum]) { // if currNum is prime
            // Update all multiples of currNum to be false
            var multiple = currNum * currNum
            while (multiple < n) { // n is not included in primes
                primes[multiple] = false
                multiple += currNum
                // We can mark off multiples of 5 starting at 5 × 5 = 25, because 5 × 2 = 10 was already marked off by multiple of 2,
                // similarly 5 × 3 = 15 was already marked off by multiple of 3.
                // Therefore, if the current number is p, we can always mark off multiples of p starting at p^2, then in increments of p^2 + p, p^2 + 2p, ...
            }
        }
        currNum++ // check if the next number is prime
    }

    var counter = 0
    for (i in 2 until n) // count all prime numbers excluding n
        if (primes[i])
            counter++

    return counter
}


////Your runtime beats 22.03 % of kotlin submissions. O(n * n^0.5)
////Space Complexity: O(1)
//fun countPrimes(n: Int): Int {
//    var count = 0
//    for (i in 0 until n) {
//        if (isPrime(i)) {
//            count++
//        }
//    }
//    return count
//}
//
//private fun isPrime (n: Int): Boolean {
//    if (n <= 1) return false
//    for (i in 2..Math.sqrt(n.toDouble()).toInt()) {
//        if (n % i == 0) return false
//    }
//    return true
//}


////Time Limit Exceeded for input 499979
//fun countPrimes(n: Int): Int {
//    var count = 0
//    for (i in 0 until n) {
//        if (isPrime(i)) {
//            count++
//        }
//    }
//    return count
//}
//
//private fun isPrime (n: Int): Boolean {
//    if (n <= 1) return false
//    for (i in 2..n/2) {
//        if (n % i == 0) return false
//    }
//    return true
//}