package leetcode.march2022

fun prefixCount(words: Array<String>, pref: String): Int {
    var prefList = 0
    for (word in words) {
        if (pref.length > word.length) continue
        var prefLength = 0
        for (i in pref.indices) {
            if (word.toCharArray()[i] == pref[i]) {
                prefLength++
            } else {
                break
            }
        }
        if (prefLength == pref.length) prefList++
    }
    return prefList
}

fun main() {
    println(prefixCount(arrayOf("elma", "kitap","elbise"), "el"))
}