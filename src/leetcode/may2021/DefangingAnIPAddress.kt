package leetcode.may2021

fun defangIPaddr(address: String) = address.replace(".", "[.]")

fun main() {
    println(defangIPaddr("1.1.1.1"))
}