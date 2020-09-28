package othersEasy

import java.util.*

//Your runtime beats 98.28 % of kotlin submissions. O(n)
//Space Complexity: O(n) - Deque
fun isValid(s: String): Boolean {
    val deque: Deque<Char> = LinkedList() // creating a Deque (The LinkedList class in an implementation of the Deque)
                                          // can do LIFO and FIFO in Deque // more commonly used in Kotlin than Stack
    for (char in s) {
        if (char == '(' || char == '{' || char == '[') deque.addFirst(char) // if open parentheses, add to deque
        else if (char == ')' && (deque.size == 0 || (deque.removeFirst() != '('))) return false // if close, check if it is the only char, if not, check if it is the right opening parentheses
                                                                                                // the deque size should come first, if not, removeFirst() makes the size different
        else if (char == '}' && (deque.size == 0 || (deque.removeFirst() != '{'))) return false
        else if (char == ']' && (deque.size == 0 || (deque.removeFirst() != '['))) return false
    }
    if (deque.size != 0) return false // if the parentheses are correct, the deque size should be 0
    return true
}