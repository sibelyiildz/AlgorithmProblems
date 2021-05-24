package leetcode.may2021

import kotlin.math.abs

fun diagonalDifference(arr: Array<Array<Int>>): Int {
    var sumLeftToRight = 0
    var sumRightToLeft = 0
    var counter = 0

    for (i in arr) {
        sumLeftToRight += i[counter]
        sumRightToLeft += i[i.size - counter - 1]
        counter += 1
    }
    return abs(sumLeftToRight - sumRightToLeft)
}

fun main() {
    println(diagonalDifference(arrayOf(arrayOf(11, 2, 4), arrayOf(4, 5, 6), arrayOf(10, 8, -12))))

}