package arrayInter

//Your runtime beats 66.82 % of kotlin submissions. O(nm)
// - where n is the length of strs, and m is the maximum length of a string in strs. Counting each string is linear in the size of the string, and we count every string.
//Space Complexity: O(nm)
// - the total information content stored in res.
fun groupAnagrams(strs: Array<String>): List<List<String>> {
    val res = ArrayList<ArrayList<String>>()
    val map = HashMap<ArrayList<Int>, ArrayList<String>>() // an Array cannot be used as a key // a list or a map is possible, but apparently list is faster, maybe because there is not constant put() that is associated in maps
                                                           // "==" does not compare the values and their indices within the Array

    for (str in strs) {
        val charCounter = ArrayList<Int>() // making an ArrayList of 26 0s
        for (i in 0..25) {
            charCounter.add(0)
        }

        for (char in str) {
            charCounter[char - 'a']++ // increment for chars in the str
        }

        if (map.containsKey(charCounter)) {
            map[charCounter]?.add(str)
        } else { // !checker.containsKey(charCounter) // make a new ArrayList of str and add it to map
            map[charCounter] = arrayListOf(str)
        }
    }

    for ((_, strList) in map) {
        res.add(strList) // add each value in res
    }

    return res
}