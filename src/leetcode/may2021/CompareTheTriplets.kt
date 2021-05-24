package leetcode.may2021

fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
    var aPoint = 0
    var bPoint = 0
    for (i in a.indices) {
        for (j in b.indices) {
            if (i == j) {
                if (a[i] > b[i]) {
                    aPoint += 1
                } else if (b[i] > a[i]) {
                    bPoint += 1
                }
            }
        }
    }
    return arrayOf(aPoint, bPoint)

}

fun main() {
    println(compareTriplets(arrayOf(17, 28, 30), arrayOf(99, 16, 8)))
}