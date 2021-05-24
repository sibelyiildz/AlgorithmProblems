package leetcode.may2021

fun maximumWealth(accounts: Array<IntArray>): Int {
    var wealth = 0
    for (i in accounts) {
        var sum = 0
        for (j in i) {
            sum += j
        }
        if (sum > wealth) {
            wealth = sum
        }
    }
    return wealth
}

fun main() {
    val accounts = arrayOf<IntArray>(intArrayOf(1, 2, 3), intArrayOf(3, 2, 1))
    println(maximumWealth(accounts))
}