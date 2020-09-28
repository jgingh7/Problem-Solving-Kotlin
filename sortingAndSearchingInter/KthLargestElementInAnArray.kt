//Your runtime beats 98.61 % of kotlin submissions. O(n log k)
//Space Complexity: O(k) memory

import java.util.*

fun findKthLargest(nums: IntArray, k: Int): Int {
    val heap = PriorityQueue<Int>()

    for (i in nums.indices) {
        heap.add(nums[i])
        if (heap.size > k) heap.poll()
    }

    return heap.poll()
}
