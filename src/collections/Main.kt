package collections

fun main(args: Array<String>) {
    ListOfPrimitiveType().runStringList()
    ListOfObject().runBaju()

    val map = mutableMapOf<String, Any>()
    map["ukuran"] = "S"
    map["warna"] = "Merah"
    map["isLenganPanjang"] = false

    println(map["isLenganPanjang"])
}