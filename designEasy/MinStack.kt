package designEasy

//Your runtime beats 66.86 % of kotlin submissions.
class MinStack() {

    /** initialize your data structure here. */
    private var stack = ArrayList<Int>()
    private var minStack = ArrayList<Int>()
    private var stackCounter = HashMap<Int, Int>()

    fun push(x: Int) {
        stack.add(x) // add to the stack
        if (minStack.isEmpty() || (x < minStack.last())) {
            minStack.add(x) // if the minStack is empty or if x is smaller than the top of the list of minStack add x to the minStack
        }

        if (!stackCounter.containsKey(x)) {
            stackCounter[x] = 1 // add new key of x
        } else {
            stackCounter[x] = stackCounter[x]!! + 1
        }
    }

    //Time Complexity: O(1)
    fun pop() {
        stackCounter[stack.last()] = stackCounter[stack.last()]!! - 1 // decrement the count for popped element
        if (stack.last() == minStack.last() && stackCounter[stack.last()] == 0) {
            minStack.removeAt(minStack.lastIndex) // if the popped element is equal to the top of minStack,
                                                  // and if there are no more elements with the same value as the popped element in the stack,
                                                  // remove it from the minStack
        }
        stack.removeAt(stack.lastIndex) // remove from the top
    }
    // "last()" gives you the value of the last element, "lastIndex" gives you the index of the last element

    fun top(): Int {
        return stack.last()
    }

    fun getMin(): Int {
        return minStack.last()
    }

}


////Your runtime beats 18.86 % of kotlin submissions.
//class MinStack() {
//
//    /** initialize your data structure here. */
//    var stack = ArrayList<Int>()
//
//    fun push(x: Int) {
//        stack.add(x)
//    }
//
//    fun pop() {
//        stack.removeAt(stack.lastIndex)
//    }
//
//    fun top(): Int {
//        return stack[stack.lastIndex]
//    }
//
//    //Time Complexity: O(n)
//    fun getMin(): Int {
//        var res = stack[0]
//        for (i in 1 until stack.size) {
//            if (stack[i] < res) {
//                res = stack[i]
//            }
//        }
//        return res
//    }
//
//}