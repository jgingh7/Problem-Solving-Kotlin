package othersEasy

//Your runtime beats 90.00 % of kotlin submissions. O(1) - constant for whichever bit size the OS have (if 32-bits, 32 loops, if 64-bits, 64 loops)
//Space Complexity: O(1)
fun hammingDistance(x: Int, y: Int): Int {
    val xored = x xor y // gives 1 for bits that are not the same
    return (hammingWeight(xored))
}

fun hammingWeight (xored: Int): Int {
    var count = 0
    var temp = xored
    while (temp != 0) {
        count++
        temp = temp and (temp - 1)
    }
    return count
}