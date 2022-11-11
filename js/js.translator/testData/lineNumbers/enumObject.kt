enum class E {
    X,

    Y {
        fun foo() = 23
    },

    Z() {
        fun bar() = 42
    }
}

// LINES(JS):    1 1 1 1 1 1 1 1 1 2 2 4 8 * 2 2 2 2 4 4 4 5 5 5 * 4 4 4 4 8 8 8 9 9 9 * 8 8 8 8 * 1 1 1 * 1 1 1 1 1 1 1 1 1 1
// LINES(JS_IR):                                     4 4 * 5 5 5 *         8 8 * 9 9 9 *               1 * 1 1 * 1 1
