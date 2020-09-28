import java.util.*


//Your runtime beats 95.78 % of kotlin submissions. //O(2^n) - choose to add or not and there are n numbers(length of nums)
//Space Complexity: O(n) Stack (the deepest stack is the length of nums)

//fun subsets(nums: IntArray): List<List<Int>> {
//    val list = ArrayList<List<Int>>()
//    backtrack(list, ArrayList(), nums, 0)
//    return list
//}
//
//fun backtrack(list: ArrayList<List<Int>>, currList: ArrayList<Int>, nums: IntArray, start: Int) {
//    list.add(ArrayList(currList)) // add a copy of the currList
//    // if just list.add(currList), the changes to the currList gets implemented to all the currLists added to list
//
//    for (i in start until nums.size) {
//        currList.add(nums[i])
//        backtrack(list, currList, nums, i + 1)
//        currList.removeAt(currList.size - 1) //remove last element
//    }
//}


//[[],[1],[1,2],[1,2,3],[1,3],[2],[2,3],[3]]
//currList:
// [] > [1] > [1,2] > [1,2,3] > [1] > [1,3] > [] > [2] > [2,3] > [] > [3]

//[[],[1],[1,2],[1,2,3],[1,2,3,4],[1,2,4],[1,3],[1,3,4],[1,4],[2],[2,3],[2,3,4],[2,4],[3],[3,4],[4]]
//currList:
// [] > [1] > [1,2] > [1,2,3] > [1,2,3,4] > [1,2] > [1,2,4] > [1] > [1,3] > [1,3,4] > [1] > [1,4] > [] > [2]
//  > [2,3] > [2,3,4] > [2] > [2,4] > [] > [3] > [3,4] > [] > [4]]

class Solution {
    fun subsets(nums: IntArray): List<List<Int>> {
        val list = mutableListOf<List<Int>>()
        backtrack(list, mutableListOf<Int>(), nums, 0)
        return list
    }

    fun backtrack(list: MutableList<List<Int>>, currList: MutableList<Int>, nums: IntArray, start: Int) {
        list.add(currList.toMutableList()) // add a copy of the currList
        // if just list.add(currList),
        // the changes to the currList gets implemented to all the currLists added to list

        for (i in start until nums.size) {
            currList.add(nums[i])
            backtrack(list, currList, nums, i + 1)
            currList.removeAt(currList.size - 1) // remove last // then on the next iteration add what has not passed yet
            // when removing 2 is removed // remove at this iteration, and remove again because next iteration i==nums.size
        }
    }
}