package stringEasy

fun main(args: Array<String>) {
    val s = "anagram"
    val t = "nagaram"
    println(s.groupingBy { it }.eachCount())
    //println(isAnagram(s, t))
}

////Your runtime beats 68.60 % of kotlin submissions. O(n)
////Space Complexity O(1)
// - Although we do use extra space, the hasMaps's size is <= 26 no matter how large n (s or t) is.
fun isAnagram(s: String, t: String): Boolean {
    if (s.length != t.length) {
        return false
    }

    val mapS = hashMapOf<Char, Int>()
    val mapT = hashMapOf<Char, Int>()

    for (i in s.indices) {
        mapS[s[i]] = mapS.getOrDefault(s[i], 0) + 1
        mapT[t[i]] = mapT.getOrDefault(t[i], 0) + 1
    }

    return mapS == mapT
}