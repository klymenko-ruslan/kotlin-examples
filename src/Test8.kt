
class Test8 {
    fun test() = Any().apply {
        //it.toString()
        this.toString()
    }
}


//╔══════════╦═════════════════╦═══════════════╦═══════════════╗
//║ Function ║ Receiver (this) ║ Argument (it) ║    Result     ║
//╠══════════╬═════════════════╬═══════════════╬═══════════════╣
//║ let      ║ this@MyClass    ║ String("...") ║ Int(42)       ║
//║ run      ║ String("...")   ║ N\A           ║ Int(42)       ║
//║ run*     ║ this@MyClass    ║ N\A           ║ Int(42)       ║
//║ with*    ║ String("...")   ║ N\A           ║ Int(42)       ║
//║ apply    ║ String("...")   ║ N\A           ║ String("...") ║
//║ also     ║ this@MyClass    ║ String("...") ║ String("...") ║
//╚══════════╩═════════════════╩═══════════════╩═══════════════╝