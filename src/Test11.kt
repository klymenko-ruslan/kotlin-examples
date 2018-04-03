
val y = Any() is String
val x = 1 as Long

fun test() {
    val any = Any()
    if(any is String) {
        any.trim()
        any.substringBefore("test")
    }
}