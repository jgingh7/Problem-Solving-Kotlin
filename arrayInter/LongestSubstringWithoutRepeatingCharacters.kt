package arrayInter

//Your runtime beats 40.17 % of kotlin submissions. O(n) - while loop
//Your memory usage beats 89.11 % of kotlin submissions. O(n) - Hashmap
fun lengthOfLongestSubstring(s: String): Int {
    val n = s.length
    var ans = 0
    val map: MutableMap<Char, Int> = HashMap() // current index of character
    var end = 0
    var start = 0 // i is the start index of the sliced string
    while (end < n) {
        if (map.containsKey(s[end])) {
            start = maxOf(map[s[end]]!! + 1, start) // move start to the repeated Char's index's next index, but not if it is an index in front of start
        }
        ans = maxOf(ans, end - start + 1) // keep updating the substring's length
        map[s[end]] = end // place current index as value of current Char
        end++ // iterating value that increments for every loop // goes through all Chars in s
    }
    return ans
}