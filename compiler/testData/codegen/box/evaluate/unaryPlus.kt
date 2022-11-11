// TARGET_BACKEND: JVM

// WITH_STDLIB

@Retention(AnnotationRetention.RUNTIME)
annotation class Ann(
        val p1: Byte,
        val p2: Short,
        val p3: Int,
        val p4: Long,
        val p5: Double,
        val p6: Float
)

const val prop1: Byte = +1
const val prop2: Short = +1
const val prop3: Int = +1
const val prop4: Long = +1
const val prop5: Double = +1.0
const val prop6: Float = +1.0.toFloat()

@Ann(prop1, prop2, prop3, prop4, prop5, prop6) class MyClass

fun box(): String {
    val annotation = MyClass::class.java.getAnnotation(Ann::class.java)!!
    if (annotation.p1 != prop1) return "fail 1, expected = ${prop1}, actual = ${annotation.p1}"
    if (annotation.p2 != prop2) return "fail 2, expected = ${prop2}, actual = ${annotation.p2}"
    if (annotation.p3 != prop3) return "fail 3, expected = ${prop3}, actual = ${annotation.p3}"
    if (annotation.p4 != prop4) return "fail 4, expected = ${prop4}, actual = ${annotation.p4}"
    if (annotation.p5 != prop5) return "fail 5, expected = ${prop5}, actual = ${annotation.p5}"
    if (annotation.p6 != prop6) return "fail 6, expected = ${prop6}, actual = ${annotation.p6}"
    return "OK"
}
