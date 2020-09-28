package arrayEasy

fun main(args: Array<String>) {
    val nums = intArrayOf(1, 2, 3, 4, 5, 6)
    val k = 2
    rotate(nums, k)
    printArray(nums) // 5,6,1,2,3,4
}

// Used "Cyclic Replacement"
// Your runtime beats 100.00 % of kotlin submissions. O(n)
// Space Complexity: O(1)
fun rotate(nums: IntArray, k: Int): Unit {
    var currIdx = 0
    var nextIdx = 0
    var startIdx = 0
    var nextNum = nums[nextIdx]
    val base = k % nums.size // account for numbers bigger than nums.size

    if (base == 0) return // if base is 0, don't do anything // if this is not here, startIdx becomes out of bound

    for (i in nums.indices) {
        nextIdx = if (currIdx + base < nums.size) { // going forward
            currIdx + base
        } else {
            currIdx - (nums.size - base) // going backward
        }

        if (startIdx == nextIdx) { // if starting point == ending point // happens in certain cases
            nums[nextIdx] = nextNum
            startIdx++
            currIdx = startIdx
            nextNum = nums[currIdx]
        } else { //keep rotating
            val temp = nums[nextIdx]
            nums[nextIdx] = nextNum
            nextNum = temp
            currIdx = nextIdx
        }
    }
}

fun printArray(nums: IntArray) {
    for (i in nums) {
        print("$i, ")
    }
    println("")
}