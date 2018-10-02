package basicFunction

class Mathematics {

    //fungsi tidak mengembalikan nilai
    fun printAngka() {
        println("Ini angka 9")
    }

    //fungsi mengembalikan nilai
    fun getAngka(): Int {
        return 5+11
    }

    //fungsi dengan parameter tanpa body {}
    fun penjumlahan(bilA: Int, bilB: Int): Int {
        printAngka()
        return bilA.plus(bilB)
    }
}