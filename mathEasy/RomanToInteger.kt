package mathEasy

//Your runtime beats 88.70 % of kotlin submissions. O(n)
//Space Complexity: O(n) - ArrayList
fun romanToInt(s: String): Int {
    val theNumbers = ArrayList<Int>()
    var res = 0
    for (char in s) {
        theNumbers.add(getInt(char))
    }

    for (i in theNumbers.indices) {
        val addedNum = theNumbers[i]
        if (i + 1 != theNumbers.size) { //if i is not the last index
            if (addedNum == 1) {
                if (theNumbers[i + 1] == 5) {
                    theNumbers[i + 1] = theNumbers[i + 1] - addedNum // 4
                    continue // skip the iteration instance (don't add this number, because it was used to update the next number)
                } else if (theNumbers[i + 1] == 10) {
                    theNumbers[i + 1] = theNumbers[i + 1] - addedNum // 9
                    continue
                }
            } else if (addedNum == 10) {
                if (theNumbers[i + 1] == 50) {
                    theNumbers[i + 1] = theNumbers[i + 1] - addedNum // 40
                    continue
                } else if (theNumbers[i + 1] == 100) {
                    theNumbers[i + 1] = theNumbers[i + 1] - addedNum // 90
                    continue
                }
            } else if (addedNum == 100) {
                if (theNumbers[i + 1] == 500) {
                    theNumbers[i + 1] = theNumbers[i + 1] - addedNum // 400
                    continue
                } else if (theNumbers[i + 1] == 1000) {
                    theNumbers[i + 1] = theNumbers[i + 1] - addedNum // 900
                    continue
                }
            }
        }
        res += addedNum // add the current number
    }
    return res
}

private fun getInt(c: Char): Int {
    return when (c) {
        'I' -> 1
        'V' -> 5
        'X' -> 10
        'L' -> 50
        'C' -> 100
        'D' -> 500
        'M' -> 1000
        else -> error("Illegal Roman numeral")
    }
}

//
//
////Your runtime beats 88.62 % of kotlin submissions. O(n)
////Space Complexity: O(n) - ArrayList
//fun romanToInt(s: String): Int {
//    val theNumbers = ArrayList<Int>()
//    var res = 0
//    for (char in s) {
//        theNumbers.add(getInt(char))
//    }
//
//
//    for (i in theNumbers.indices) {
//        var addedNum = theNumbers[i]
//        if (i + 1 != theNumbers.size) { //if i is not the last index
//            if (addedNum == 1) {
//                if (theNumbers[i + 1] == 5) {
//                    addedNum = theNumbers[i + 1] - addedNum // 4
//                    theNumbers[i + 1] = 0
//                } else if (theNumbers[i + 1] == 10) {
//                    addedNum = theNumbers[i + 1] - addedNum // 9
//                    theNumbers[i + 1] = 0
//                }
//            } else if (addedNum == 10) {
//                if (theNumbers[i + 1] == 50) {
//                    addedNum = theNumbers[i + 1] - addedNum // 40
//                    theNumbers[i + 1] = 0
//                } else if (theNumbers[i + 1] == 100) {
//                    addedNum = theNumbers[i + 1] - addedNum // 90
//                    theNumbers[i + 1] = 0
//                }
//            } else if (addedNum == 100) {
//                if (theNumbers[i + 1] == 500) {
//                    addedNum = theNumbers[i + 1] - addedNum // 400
//                    theNumbers[i + 1] = 0
//                } else if (theNumbers[i + 1] == 1000) {
//                    addedNum = theNumbers[i + 1] - addedNum // 900
//                    theNumbers[i + 1] = 0
//                }
//            }
//        }
//        res += addedNum
//    }
//    return res
//}
//
//private fun getInt(c: Char): Int = when (c) {
//    'I' -> 1
//    'V' -> 5
//    'X' -> 10
//    'L' -> 50
//    'C' -> 100
//    'D' -> 500
//    'M' -> 1000
//    else -> error("Illegal Roman numeral")
//}