//Your runtime beats 97.27 % of kotlin submissions. O(nlogn) - 2 binary searches
//Space Complexity: O(1)

fun searchRange(nums: IntArray, target: Int): IntArray {
    val result = IntArray(2)
    result[0] = findFirst(nums, target)
    result[1] = findLast(nums, target)
    return result
}

fun findFirst(nums: IntArray, target: Int): Int {
    var idx = -1 // return -1 if not found
    var left = 0
    var right = nums.size - 1
    while (left <= right) {
        val mid = left + (right - left) / 2
        if (nums[mid] >= target) {
            right = mid - 1
        } else { //nums[mid] < target
            left = mid + 1
        }
        if (nums[mid] == target) idx = mid
    }
    return idx
}

fun findLast(nums: IntArray, target: Int): Int {
    var idx = -1 // return -1 if not found
    var left = 0
    var right = nums.size - 1
    while (left <= right) {
        val mid = left + (right - left) / 2
        if (nums[mid] <= target) {
            left = mid + 1
        } else { //nums[mid] > target
            right = mid - 1
        }
        if (nums[mid] == target) idx = mid
    }
    return idx
}

