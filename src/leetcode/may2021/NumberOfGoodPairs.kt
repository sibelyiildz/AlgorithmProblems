package leetcode.may2021

fun numIdenticalPairs(nums: IntArray): Int {
    var goodPairs = 0
    for (i in nums.indices) {
        for (j in nums.indices) {
            if (i < j && nums[i] == nums[j]) {
                goodPairs += 1
            }
        }
    }
    return goodPairs
}

fun main() {
    val nums = intArrayOf(1, 2, 3, 1, 1, 3)
    println(numIdenticalPairs(nums))
}