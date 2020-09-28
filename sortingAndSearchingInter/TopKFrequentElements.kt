//Your runtime beats 99.50 % of kotlin submissions. O(n) - n is number of nums
//Space Complexity: O(n)
fun topKFrequent(nums: IntArray, k: Int): IntArray {
    val counter = HashMap<Int, Int>()

    for (element in nums) {
        counter[element] = counter.getOrDefault(element, 0) + 1
    }

    val bucket = arrayOfNulls<MutableList<Int>>(nums.size + 1)

    for (key in counter.keys) {
        val freq = counter[key]!!
        if (bucket[freq] == null) {
            bucket[freq] = mutableListOf<Int>()
        }
        bucket[freq]?.add(key)
    }

    val ans = mutableListOf<Int>()
    for (i in bucket.size - 1 downTo 0) {
        if (bucket[i] == null) continue
        if (k == 0 || ans.size == k) break

        ans.addAll(bucket[i]!!)
    }

    return ans.toIntArray()
}