// DONT_TARGET_EXACT_BACKEND: JVM
// Auto-generated by org.jetbrains.kotlin.generators.tests.GenerateRangesCodegenTestData. DO NOT EDIT!
// !LANGUAGE: +RangeUntilOperator
// WITH_STDLIB



@OptIn(ExperimentalStdlibApi::class)
fun box(): String {
    val list1 = ArrayList<Int>()
    for (i in 1..<5) {
        list1.add(i)
        if (list1.size > 23) break
    }
    if (list1 != listOf<Int>(1, 2, 3, 4)) {
        return "Wrong elements for 1..<5: $list1"
    }

    val list2 = ArrayList<Int>()
    for (i in 1.toByte()..<5.toByte()) {
        list2.add(i)
        if (list2.size > 23) break
    }
    if (list2 != listOf<Int>(1, 2, 3, 4)) {
        return "Wrong elements for 1.toByte()..<5.toByte(): $list2"
    }

    val list3 = ArrayList<Int>()
    for (i in 1.toShort()..<5.toShort()) {
        list3.add(i)
        if (list3.size > 23) break
    }
    if (list3 != listOf<Int>(1, 2, 3, 4)) {
        return "Wrong elements for 1.toShort()..<5.toShort(): $list3"
    }

    val list4 = ArrayList<Long>()
    for (i in 1L..<5L) {
        list4.add(i)
        if (list4.size > 23) break
    }
    if (list4 != listOf<Long>(1, 2, 3, 4)) {
        return "Wrong elements for 1L..<5L: $list4"
    }

    val list5 = ArrayList<Char>()
    for (i in 'a'..<'d') {
        list5.add(i)
        if (list5.size > 23) break
    }
    if (list5 != listOf<Char>('a', 'b', 'c')) {
        return "Wrong elements for 'a'..<'d': $list5"
    }

    return "OK"
}
