package leetcode.may2021

fun restoreString(s: String, indices: Array<Int>): String {

    val newList = CharArray(s.length)

    for (i in indices.indices) {
        newList[indices[i]] = s[i]
    }

    return String(newList)
}

fun main() {
    println(restoreString("aiohn", arrayOf(3, 1, 4, 2, 0)))
}