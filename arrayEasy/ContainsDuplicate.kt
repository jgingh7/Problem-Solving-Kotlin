package arrayEasy

fun main(args: Array<String>) {
    var nums = intArrayOf(1,2,3,1)
    val contains = containsDuplicate(nums)
    println(contains) // true
}

//Your runtime beats 86.53 % of kotlin submissions. O(n)
// - search() and insert() in hashSets are O(n)
// Space Complexity: O(n)
// - space used by hashSet
fun containsDuplicate(nums: IntArray): Boolean {
    val newSet = HashSet<Int>()

    for (element in nums) {
        if (!newSet.add(element)) return true // if there is a duplicate, add returns false. Therefore, makes the function return true
    }
    return false
}

//// Your runtime beats 86.53 % of kotlin submissions. O(nlogn)
//// - sorting gives O(nlogn) time complexity
//// Space Complexity: O(1)
//fun containsDuplicate(nums: IntArray): Boolean {
//    nums.sort()
//    for (i in 0 until (nums.size - 1)) {
//        if (nums[i] == nums[i + 1]) return true
//    }
//    return false
//}