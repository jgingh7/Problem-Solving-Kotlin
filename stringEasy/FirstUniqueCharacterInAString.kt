package stringEasy

//Your runtime beats 18.24 % of kotlin submissions. O(n)
//Your memory usage beats 43.14 % of kotlin submissions. O(1) because English alphabet contains 26 letters.
fun firstUniqChar(s: String): Int {
    val map = hashMapOf<Char, Int> ()
    for (char in s) {
        map[char] = map.getOrDefault(char, 0) + 1 // increment occurences of each char to map
    }

    for (i in s.indices) {
        if (map[s[i]] == 1) { // if only occurred once, return that index
            return i
        }
    }
    return -1
}