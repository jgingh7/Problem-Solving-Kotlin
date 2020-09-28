//Your runtime beats 96.43 % of kotlin submissions. O(nlogn)
//Space Complexity: O(1)

fun search(nums: IntArray, target: Int): Int {
    //first find pivot
    if (nums.isEmpty()) return -1

    var pivot = nums.size -1
    var l = 0
    var r = nums.size - 1
    while (l < r) {
        val mid = l + (r - l) / 2
        if (nums[mid + 1] < nums[mid]) {
            pivot = mid
            break
        } else { //nums[mid + 1] > nums[mid]
            if (nums[mid] >= nums[0]) {
                l = mid + 1
            } else { // nums[mid] < nums[0]
                r = mid // not r = mid - 1 because if l and r becomes same, cannot assess mid - 1
            }
        }
    }

    //see on which half I should do the search on
    return if (target >= nums[0]) { // target on the left side
        findNum(nums, target, 0, pivot)
    } else { // target < nums[0] // target on the right side
        findNum(nums, target, pivot + 1, nums.size - 1)
    }
}

fun findNum (nums: IntArray, target: Int, l: Int, r: Int): Int {
    var l = l
    var r = r

    while (l <= r) {
        val mid = l + (r - l) / 2
        when {
            nums[mid] == target -> {
                return mid
            }
            nums[mid] < target -> {
                l = mid + 1
            }
            else -> {
                r = mid - 1
            }
        }
    }

    return -1
}
