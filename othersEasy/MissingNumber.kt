package othersEasy

//Your runtime beats 97.50 % of kotlin submissions. O(n)
//Space Complexity: O(1)
fun missingNumber(nums: IntArray): Int {
    var res = nums.size //takes care of the biggest number to be compared
    for (i in nums.indices) {
        res = res xor i xor nums[i] //by xoring, the i that is not included in nums is resulted
    }
    return res
}