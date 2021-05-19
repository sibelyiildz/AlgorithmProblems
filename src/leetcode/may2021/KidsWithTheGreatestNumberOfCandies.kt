package leetcode.may2021

fun kidsWithCandies(candies: IntArray, extraCandies: Int): BooleanArray {
    var isTrue = true
    val result = BooleanArray(candies.size)
    var sum = 0
    for (i in 0..candies.size - 1) {
        sum = candies[i] + extraCandies
        for (j in 0..candies.size - 1) {
            if (i == j) {
                continue
            }
            if (sum < candies[j]) {
                isTrue = false
            }
        }
        result[i] = isTrue
        isTrue = true
    }

    return result
}

fun main() {
    val candies = intArrayOf(12, 1, 12)
    println(kidsWithCandies(candies, 10))

}