package string

import java.util.*

/**
 * url:
 * Author:Savannah
 * Description:
 * LeetCodeTesting 9/3/20
 */


fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
    val set1 = nums1.toSet()
    val set2 = nums2.toSet()
    val set3 = set1.filter { it->
        set2.contains(it) }
    return set3.toIntArray()
}

fun main(args: Array<String>) {
    println(intersection(intArrayOf(1, 2, 3), intArrayOf(2, 3, 4)).contentToString())
}

