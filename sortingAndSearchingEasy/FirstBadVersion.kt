package sortingAndSearchingEasy

////Your runtime beats 98.92 % of kotlin submissions. O(log n) - The search space is halved each time
////Your memory usage beats 23.66 % of kotlin submissions. O(1)
//override fun firstBadVersion(n: Int) : Int {
//    var left = 1
//    var right = n
//    while (left < right) {
//        val mid = left + (right - left) / 2 // "right - left" prevents overflow of very large num of Ints // if "right+left/2" is used, overflow happens
//        if (isBadVersion(mid)){
//            right = mid
//        }
//        else {
//            left = mid + 1
//        }
//    }
//    return left
//}

////Brute Force
////Time Limit Exceeded O(n)
//override fun firstBadVersion(n: Int) : Int {
//    for (i in 1..n) {
//        if (isBadVersion(i)) return i
//    }
//    return n
//}