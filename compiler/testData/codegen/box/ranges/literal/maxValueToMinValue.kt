// Auto-generated by org.jetbrains.kotlin.generators.tests.GenerateRangesCodegenTestData. DO NOT EDIT!
// WITH_STDLIB


val MaxI = Int.MAX_VALUE
val MinI = Int.MIN_VALUE
val MaxB = Byte.MAX_VALUE
val MinB = Byte.MIN_VALUE
val MaxS = Short.MAX_VALUE
val MinS = Short.MIN_VALUE
val MaxL = Long.MAX_VALUE
val MinL = Long.MIN_VALUE
val MaxC = Char.MAX_VALUE
val MinC = Char.MIN_VALUE

fun box(): String {
    val list1 = ArrayList<Int>()
    for (i in MaxI..MinI) {
        list1.add(i)
        if (list1.size > 23) break
    }
    if (list1 != listOf<Int>()) {
        return "Wrong elements for MaxI..MinI: $list1"
    }

    val list2 = ArrayList<Int>()
    for (i in MaxB..MinB) {
        list2.add(i)
        if (list2.size > 23) break
    }
    if (list2 != listOf<Int>()) {
        return "Wrong elements for MaxB..MinB: $list2"
    }

    val list3 = ArrayList<Int>()
    for (i in MaxS..MinS) {
        list3.add(i)
        if (list3.size > 23) break
    }
    if (list3 != listOf<Int>()) {
        return "Wrong elements for MaxS..MinS: $list3"
    }

    val list4 = ArrayList<Long>()
    for (i in MaxL..MinL) {
        list4.add(i)
        if (list4.size > 23) break
    }
    if (list4 != listOf<Long>()) {
        return "Wrong elements for MaxL..MinL: $list4"
    }

    val list5 = ArrayList<Char>()
    for (i in MaxC..MinC) {
        list5.add(i)
        if (list5.size > 23) break
    }
    if (list5 != listOf<Char>()) {
        return "Wrong elements for MaxC..MinC: $list5"
    }

    return "OK"
}
