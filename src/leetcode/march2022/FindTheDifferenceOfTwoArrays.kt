package leetcode.march2022


fun findDifference(nums1: IntArray, nums2: IntArray): List<List<Int>> {

    val responseArray = arrayListOf<ArrayList<Int>>(arrayListOf(), arrayListOf())

    for (first in nums1.indices) {
        for (second in nums2.indices) {
            if (nums1[first] == nums2[second]) {
                break
            } else {
                if (second == nums2.size - 1) {
                    if (responseArray[0].contains(nums1[first]).not()) {
                        responseArray[0].add(nums1[first])
                    }
                }
            }
        }
    }
    for (second in nums2.indices) {
        for (first in nums1.indices) {
            if (nums2[second] == nums1[first]) {
                break
            } else {
                if (first == nums1.size - 1) {
                    if (responseArray[1].contains(nums2[second]).not()) {
                        responseArray[1].add(nums2[second])
                    }
                }
            }
        }
    }

    return responseArray
}

fun main() {
    println(findDifference(nums1 = intArrayOf(1, 2, 3), nums2 = intArrayOf(2, 4, 6)))
}
