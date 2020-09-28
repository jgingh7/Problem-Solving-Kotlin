package arrayInter

//Your runtime beats 66.90 % of kotlin submissions. O(n^2)
//Space Complexity: O(n) - hashSet
fun threeSum(nums: IntArray): List<List<Int>> {
    val set = HashSet<List<Int>>() // If ArrayList, duplicates are not dealt with
    if (nums.size < 3) {
        return set.toList()
    }

    nums.sort()
    for (i in 0 until nums.size - 2) { // until two indexes before the end
        var low = i + 1 // ptr 1 from left
        var high = nums.size - 1 // ptr 2 from right
        while (low < high) {
            val sum = nums[i] + nums[low] + nums[high]
            when {
                sum == 0 -> {
                    set.add(listOf(nums[i], nums[low], nums[high])) // because this is a HashSet, list with same values in same sequence will be "discarded"
                    low++ // move left ptr
                    high-- // move right ptr
                }
                // if sum is less than 0, it means a bigger number is needed, so move left ptr
                sum < 0 -> low++ //the "low++" and "high--" cannot be replaced because nums is sorted
                else -> high--
            }
        }
    }

    return set.toList()
}
