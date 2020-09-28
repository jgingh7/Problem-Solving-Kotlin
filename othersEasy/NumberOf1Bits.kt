package othersEasy

//Your runtime beats 26.32 % of kotlin submissions. O(1) - less than or equal to 32 loops
//Space Complexity: O(1)
class Solution {
    // you need treat n as an unsigned value
    fun hammingWeight(n: Int): Int {
        var count = 0
        var temp = n
        while(temp != 0) { // flip all 1s to 0, so keep looping until temp (which initially has the same value as n) is 0
            count++
            temp = temp and (temp - 1) // if temp == 001100, temp - 1 == 001011 // temp and (temp - 1) == 001000
                                       // this eventually shifts all 1s // the number of 1s equals to the number of loops, so the loop can be less than 32
        }
        return count
    }
}


////Your runtime beats 77.63 % of kotlin submissions. O(1) - constant 32 loops
////Space Complexity: O(1)
//class Solution {
//    // you need treat n as an unsigned value
//    fun hammingWeight(n: Int): Int {
//        var count = 0
//        var mask = 1
//        for (bit in 0 until 32) { //check for all 32 bits
//            if (n and mask != 0) count++ // if 1 (the mask's 1 and n's 1 is matched, resulting a 1), increment the count
//            mask = mask shl 1 // shift the bit by 1 (so if ...0001, now ...0010, next 0100, and so forth)
//        }
//        return count
//    }
//}

////NOT THIS
////Your runtime beats 36.84 % of kotlin submissions. O(1) - constant 32 loops
////Space Complexity: O(1)
//class Solution {
//    // you need treat n as an unsigned value
//    fun hammingWeight(n: Int): Int {
//        val s = Integer.toBinaryString(n)
//        println(s)
//        var count = 0
//        for(char in s) {
//            if (char == '1') {
//                count++
//            }
//        }
//        return count
//    }
//}