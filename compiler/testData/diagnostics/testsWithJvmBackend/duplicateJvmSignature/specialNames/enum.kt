// FIR_IDENTICAL
// !DIAGNOSTICS: -UNUSED_PARAMETER
enum class <!CONFLICTING_JVM_DECLARATIONS, CONFLICTING_JVM_DECLARATIONS!>E<!> {
    A;

    <!CONFLICTING_JVM_DECLARATIONS!>fun values(): Array<E><!> = null!!
    <!CONFLICTING_JVM_DECLARATIONS!>fun valueOf(s: String): E<!> = null!!
}