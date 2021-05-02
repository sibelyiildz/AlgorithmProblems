package leetcode.may2021

fun numberOfSteps(num: Int): Int {
    var counter = 0
    var nums = num
    while (nums != 0) {
        if (nums % 2 == 0) {
            nums /= 2
            counter++
        } else {
            nums -= 1
            counter++
        }
    }
    return counter
}

fun main() {
    println(numberOfSteps(14))
}