package arrayEasy

fun main(args: Array<String>) {
    val nums1 = intArrayOf(4,9,5)
    val nums2 = intArrayOf(9,4,9,8,4)
    val ans = intersect(nums1, nums2)
    printArray(ans) // 9, 4
}

//Your runtime beats 96.21 % of kotlin submissions. O(nums1.size + nums2.size)
//Space Complexity: O(min(nums1.size, nums2.size)
fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
    val map = hashMapOf<Int, Int>()
    val list = arrayListOf<Int>()

    //Q: What if nums1's size is small compared to nums2's size? Which algorithm is better?
    //A: Below if statement keeps the "map" size to be the smaller size, making space complexity min (nums1.size, nums2.size)
    if (nums1.size > nums2.size) {
        return intersect(nums2, nums1)
    }

    nums1.forEach { element -> // making a map of the occurrences for each numbers in nums1
        map[element] = map.getOrDefault(element, 0) + 1
    }

    nums2.forEach { element ->
        if (map.containsKey(element) && map[element]!! > 0) { // if the number in nums2 is a key for map and the occurrence number is positive
            map[element] = map[element]!! - 1 // decrement the occurrence
            list.add(element) // and add the number to the arrayList
        }
    }
    return list.toIntArray()
}

//Q: What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?
//Use upper solution. nums1 is put on hashMap, and break up nums2 into pieces and find intersection.


////Your runtime beats 67.31 % of kotlin submissions. O(mlogm + nlogn) - sorting
////Space Complexity: O(1)
//// - just 2 pointers going to the right //assume space used by sorting is ignorable
////Q: What if the given array is already sorted? How would you optimize your algorithm?
////A: Use this algorithm, and get rid of sort()
//fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
//    nums1.sort()
//    nums2.sort()
//    var ans = ArrayList<Int>()
//    var i = 0
//    var j = 0
//    while (i < nums1.size && j < nums2.size) {
//        when {
//            nums1[i] > nums2[j] -> j++ // keep moving pointer j if nums2[j] is smaller
//            nums1[i] < nums2[j] -> i++ // keep moving pointer i if nums1[i] is smaller
//            else -> {
//                ans.add(nums1[i]) // if same, add to the arrayList
//                i++
//                j++
//            }
//        }
//    }
//    return ans.toIntArray()
//}
