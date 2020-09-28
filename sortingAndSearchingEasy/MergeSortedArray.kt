package sortingAndSearchingEasy

////Your runtime beats 89.08 % of kotlin submissions. O(n)
////Your memory usage beats 37.37 % of kotlin submissions. O(1)
//fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
//    var lastIndex = m + n - 1 //start from the very last of the index
//    var mIndex = m - 1 // start from the last of nums1
//    var nIndex = n - 1 // start from the last of nums2
//    while (mIndex >= 0 || nIndex >= 0) {
//        if (nIndex < 0) { //if putting in numbers from nums2 is finished, end the function
//            return // this ends the function // here "break" which ends the loop is fine too
//        }
//        if (mIndex >= 0 && nums1[mIndex] > nums2[nIndex]) { //if nums1's index is bigger than 0, and nums1's number is bigger than nums2's number, add nums1 to the lastIndex
//                                                            //it is nums2's index that makes the function stop if become negative, not nums1's index
//            nums1[lastIndex] = nums1[mIndex]
//            mIndex-- // on to the next number of nums1
//        } else {
//            nums1[lastIndex] = nums2[nIndex] //else add nums2's number to nums1
//            nIndex-- // on to the next number of nums2
//        }
//        lastIndex--
//    }
//}

//Your runtime beats 50.42 % of kotlin submissions. O(nlogn)
//Your memory usage beats 12.11 % of kotlin submissions. O(1)
fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
    for (index in m until (m + n)) {
        nums1[index] = nums2[index - m] // put the numbers for nums2 after nums1's numbers
    }
    nums1.sort(0, nums1.size) // sort them
}