package designEasy


class Solution(val nums: IntArray) {

    /** Resets the array to its original configuration and return it. */
    fun reset(): IntArray {
        return nums
    }

    // Time Complexity: O(n)
    // Space Complexity: O(n)
    /** Returns a random shuffling of the array. */
    fun shuffle(): IntArray {
        val shuffled = IntArray(nums.size)

        val places = ArrayList<Int>() // the ArrayList with all the possible indices
        for (i in nums.indices) {
            places.add(i)
        }

        var limit = places.size - 1 // limit for the random numbers
        for (num in nums) {
            val rnds = (0..limit).random()
            val randomIdx = places[rnds] // choose a random number from the ArrayList of possible indices
            shuffled[randomIdx] = num // place the num to the random chosen indexed place in the new IntArray
            places.remove(randomIdx) // remove the randomly chosen index
            limit--
        }

        return shuffled
    }
}

//// This is much easier, but don't think is the purpose of the question
//class Solution(var nums: IntArray) {
//
//    /** Resets the array to its original configuration and return it. */
//    fun reset(): IntArray {
//        return nums
//    }
//
//    // Time Complexity: O(n)
//    // Space Complexity: O(n)
//    /** Returns a random shuffling of the array. */
//    fun shuffle(): IntArray {
//        var shuffled = nums.copyOf().toMutableList()
//        shuffled.shuffle()
//        return shuffled.toIntArray()
//    }
//
//}