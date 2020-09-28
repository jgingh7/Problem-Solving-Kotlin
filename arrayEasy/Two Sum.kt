package arrayEasy

fun main(args: Array<String>) {
    val nums = intArrayOf(2, 7, 11, 15)
    val target = 9
    val ans = twoSum(nums, target)
    printArray(ans) // 0,1
}

// We reduce the look up time from O(n) to O(1) by trading space for speed.
// A hash table is built exactly for this purpose, it supports fast look up in near constant time.
// I say "near" because if a collision occurred, a look up could degenerate to O(n) time.
// But look up in hash table should be amortized O(1) time as long as the hash function was chosen carefully.

//Your runtime beats 49.82 % of kotlin submissions. O(n)
//Your memory usage beats 25.16 % of kotlin submissions. O(n)
fun twoSum(nums: IntArray, target: Int): IntArray {
    val map = hashMapOf<Int, Int>()
    val res = arrayListOf<Int> ()

    for (i in nums.indices) {
        val complement = target - nums[i]
        if (map.containsKey(complement)) { // if map contains complement as key, add index of complement and the original to res
            res.add(map[complement]!!)
            res.add(i)
        }
        map[nums[i]] = i // keeps index of elements in nums
    }
    return res.toIntArray()
}

