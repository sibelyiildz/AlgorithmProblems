package leetcode.may2021

fun shuffle(nums: IntArray, n: Int): IntArray {

    val returnNums = IntArray(nums.size)
    var n = n
    var x = 0
    for (i in 0 until nums.size / 2) {
        returnNums[i + x] = nums[i]
        x += 1
        returnNums[i + x] = nums[n]
        n += 1
    }
    return returnNums
}


fun main() {
    val nums = intArrayOf(2, 5, 1, 3, 4, 7)
    println(shuffle(nums, 3))
}