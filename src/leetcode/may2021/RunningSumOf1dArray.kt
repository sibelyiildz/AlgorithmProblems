package leetcode.may2021

fun runningSum(nums: IntArray): IntArray {
    var sum = 0
    for (i in nums.indices) {
        sum += nums[i]
        nums[i] = sum
    }
    return nums
}

fun main(args: Array<String>) {
    val nums = intArrayOf(1, 1, 1, 1)
    print(runningSum(nums))
}