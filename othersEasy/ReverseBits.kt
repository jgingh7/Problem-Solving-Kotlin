package othersEasy

//Your runtime beats 80.33 % of kotlin submissions. O(1) - constant 32 bits
//Space Complexity: O(1)

// you need treat n as an unsigned value
fun reverseBits(n: Int): Int {
    if (n == 0) return 0

    var numberN = n
    var res = 0
    for (i in 0..31) { // for all 32 bits
        res = res shl 1 // keep shifting the result to the left
        // the shift is done first, and on the 0 made by the left shift, below comparison of with 1 is made, and the bit is filled with the result
        // if left shift comes after the comparison, there will be an additional 0, that is not dealt with
        if (numberN and 1 == 1) res++ // if numberN's bit is 1, add 1 to res (this makes the res's bit from 0 to 1, so if numberN's bit is 0, res's bit is 0)
        numberN = numberN shr 1 // prepare the next bit to be compared
    }
    return res
}