package foo

class Arg

fun interface Foo {
    fun foo(a: Arg): Arg
}

fun testMe(f: Foo) {}

fun resolveMe() {
    testMe { b -> b }
}