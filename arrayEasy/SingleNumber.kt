package arrayEasy

fun main(args: Array<String>) {
    val nums = intArrayOf(4,1,2,1,2)
    val ans = singleNumber(nums)
    println(ans) // 4
}

//Bit manipulation
// 0.xor(a) or a.xor(0) == a
// a.xor(a) == 0
// a.xor(b).xor(a) == a.xor(a).xor(b) == 0.xor(b) == b // xoring results in the number with only 1 occurrence
//Your runtime beats 95.34 % of kotlin submissions. O(n)
//Your memory usage beats 75.63 % of kotlin submissions. O(1)
fun singleNumber(nums: IntArray): Int {
    var a = 0
    for (element in nums) {
        a = a.xor(element)
    }
    return a
}

//Your runtime beats 62.35 % of kotlin submissions. O(n) - hashMap search() and insert()
//Your memory usage beats 88.98 % of kotlin submissions. O(n) - hashMap making
//fun singleNumber(nums: IntArray): Int {
//    val map = hashMapOf<Int, Int>()
//
//    for (element in nums) {
//        map[element] = map.getOrDefault(element, 0) + 1
//    }
//    for (element in nums) {
//        if (map[element] == 1) return element // the element with value 1 is the answer
//    }
//    return 0
//}
//
////Your runtime beats 15.99 % of kotlin submissions. O(n^2)
//// - search() and insert() in arrayList in a for loop causes O(n^2)
////Your memory usage beats 95.97 % of kotlin submissions. O(n)
//fun singleNumber(nums: IntArray): Int {
//    val newList = arrayListOf<Int>()
//    for (element in nums) {
//        if (element !in newList) {
//            newList.add(element)
//        } else {
//            newList.remove(element)
//        }
//    }
//    return newList[0]
//}