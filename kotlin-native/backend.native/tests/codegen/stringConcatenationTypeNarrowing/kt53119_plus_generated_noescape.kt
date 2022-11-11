/*
 * Copyright 2010-2022 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package codegen.stringConcatenationTypeNarrowing.kt53119_plus_generated_noescape
import kotlin.test.*
import kotlin.random.*

// Without "string concatenation type narrowing", pointer to IntRange is conservatively considered to escape,
// since within String.plus(Any?) (within Random.nextInt), the pointer is passed as a receiver of virtual call Any.toString()
// As a result, no stack allocation is possible

// With "string concatenation type narrowing", IntRange.toString() is explicitly called, that does not escape the receiver.
// Hence, escape analysis can find out the pointer to IntRange does not escape anywhere, and stack allocation is possible.

// CHECK-LABEL: define i32 @"kfun:codegen.stringConcatenationTypeNarrowing.kt53119_plus_generated_noescape#getNextInt(){}kotlin.Int
// CHECK-NOT ret i32
// CHECK alloca %"kclassbody:kotlin.ranges.IntRange#internal"

// CHECK ret i32

fun getNextInt(): Int {
    return Random.nextInt(IntRange(42153, 42153))
}

@Test
fun runTest() {
    println(getNextInt())
}
