//Your runtime beats 80.00 % of kotlin submissions. O(nlogn)
//Space Complexity: O(1) if not count the ans

class Solution {
    fun merge(intervals: Array<IntArray>): Array<IntArray> {
        if (intervals.size <= 1) return intervals

        // first element determines the start of the interval
        // later, it'll be used to determine when to create a new result item
        intervals.sortBy { it[0] } // here's the time complexity, O(nlogn)
        val ans = mutableListOf<IntArray>() // necessary, minimal space complexity to return result
        var head = intervals[0] // the interval we're editing the end value

        for (i in 1 until intervals.size) {

            val curr = intervals[i]

            if (head[1] >= curr[0]) { // grow interval
                head[1] = maxOf(head[1],curr[1])
            } else { // create new interval
                ans.add(head)
                head = curr
            }
        }

        ans.add(head) // don't forget the greatest one

        return ans.toTypedArray()
    }
}