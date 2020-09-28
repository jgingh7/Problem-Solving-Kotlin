package arrayInter

fun main(args: Array<String>) {
    val a = intArrayOf(5,6,7,8,80)
    val lower = 0
    val upper = 99
    printList(findMissingRanges(a, lower, upper))
}

fun printList (a: List<Any>) {
    for (elements in a) {
        print("$elements, ")
    }
    println()
}

// Time Complexity: O(n)
// Space Complexity: O(n) - ranges ArrayList
fun findMissingRanges(nums: IntArray, lower: Int, upper: Int): List<String> {
    val ranges = ArrayList<String>()
    val len = nums.size
    if (len == 0) { // if there are no elements in nums
        if (lower <= upper) { // without this, when lower value is higher than upper value, a range still prints out (ex. 105->99)
            ranges.add(getRange(lower, upper))
        }
        return ranges
    }
    if (lower < nums[0]) { // if lower starts before the nums (the other situation is when lower == nums[0], need not get the range) // lower does not start after the nums according to the question
        ranges.add(getRange(lower, nums[0] - 1)) // get range from lower to just before the first number
    }
    for (i in 1 until len) { //loop through all the numbers
        if (nums[i] > nums[i - 1] && nums[i] - nums[i - 1] > 1) { //if current number is bigger than the number before by more than 1,
            ranges.add(getRange(nums[i - 1] + 1, nums[i] - 1)) // get range from before num and current num, exclusive
        }
    }
    // in the question, the last number in nums is always less or equal to upper
    if (upper > nums[len - 1]) { // if upper and last number is not equal,
        ranges.add(getRange(nums[len - 1] + 1, upper)) // get range from last number, excluding, to upper, including
    }
    return ranges
}

fun getRange(lower: Int, upper: Int): String {
    return if (lower == upper) { // if lower == upper just print out the lower string
        lower.toString() + ""
    } else "$lower->$upper"
}