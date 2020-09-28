class Solution {
    fun canJump(nums: IntArray): Boolean {
        var lastPos = nums.size - 1
        for (i in nums.indices.reversed()) {
            if (i + nums[i] >= lastPos) {
                lastPos = i
            }
        }
        return lastPos == 0
    }
}