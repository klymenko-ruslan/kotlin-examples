

class Test7 {
    fun test7() = Any().let {
        it.toString()
        this.toString()
    }

    fun test7_2()  = null.let { println(it) }
}