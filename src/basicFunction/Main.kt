package basicFunction

fun main(args: Array<String>) {
    val math = Mathematics()
    println("Angka : ${math.getAngka()}")
    math.printAngka()
    println("Penjumlahan : ${math.penjumlahan(5, 3)}")
    pengurangan(5, 4)

    println("Kurang : ${5.kurang(2)}")

    //angka.rem(2) == 0 -> genap else ganjil

    if (6.isGenap()) {
        println("Genap")
    } else {
        println("Ganjil")
    }

    if (isGanjil(6)) {
        println("Ganjil")
    } else {
        println("Genap")
    }
}