
fun test(value: Int?, value2: Int) {
    val test1 = value ?: 0
    val test2 = value!!
    val test3 = value?.toString() ?: 0
    println(test3)
}