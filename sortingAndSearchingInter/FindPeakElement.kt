//Your runtime beats 97.44 % of kotlin submissions. O(log n)
//Space Complexity: O(1)


fun findPeakElement(nums: IntArray): Int {
    if (nums.size == 1) return 0

    var l = 0
    var r = nums.size - 1

    while (l < r) {
        val mid = l + (r - l) / 2 //to not go over the maximum possible value
        if (nums[mid] < nums[mid + 1]) {
            l = mid + 1 //if the mid value is smaller than its right value, take left to exclude the mid value
        } else { //nums[mid] > nums[mid + 1])
            r = mid //if the mid value is bigger than its right value, take right to include the mid value
        }
        //this way, the right half will have the peak
    }
    return l // right also works
}