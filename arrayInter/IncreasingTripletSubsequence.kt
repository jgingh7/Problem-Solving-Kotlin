package arrayInter

//Your runtime beats 17.14 % of kotlin submissions. O(n)
//Space Complexity: O(1)
fun increasingTriplet(nums: IntArray): Boolean {
    if (nums.size < 3) return false

    var first: Int? = null
    var second: Int? = null

    for (i in nums.indices) {
        when {
            first == null -> first = nums[i]
            nums[i] <= first -> first = nums[i] // for smaller or equal values, set them as "first" // so if there is not increase at all, only first will be assigned and the loop will end
            second == null -> second = nums[i] // if it is not smaller or equal to "first", "second" will have a value
            nums[i] <= second -> second = nums[i] // for smaller or equal values, set them as "second" // "second" will always stay larger than "first", because "first" is assigned value before "second"
            else -> return true // if no assigning to values of "first" and "second" happens (if another increase after second happens), return true
        }
    }
    return false
}