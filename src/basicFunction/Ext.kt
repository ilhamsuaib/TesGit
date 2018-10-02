package basicFunction

//inline func / top level func
fun pengurangan(bilA: Int, bilB: Int) {
    println("Pengurangan $bilA-$bilB : ${bilA.minus(bilB)}")
}

//extension func
fun Int.kurang(x: Int): Int {
    return this-x
}

fun Int.isGenap(): Boolean = this.rem(2) == 0

fun isGanjil(x: Int): Boolean = x.rem(2) != 0