
fun test12(x: Any) {
    when(x) {
        0 -> println(0)
        is Int -> println("Int")
        is Number -> println("Number")
        else -> println("Not an int")
    }
}