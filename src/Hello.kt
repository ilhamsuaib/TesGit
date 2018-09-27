import java.util.*

fun main(args: Array<String>) {

    val contohArray = ContohArray()
    val strings = contohArray.strings

    //untuk menampilkan data pada array
    println("Data Array : "+Arrays.toString(strings))
    //menampilkan jumlah data
    println("Jumlah Data : ${strings.size}")

    //perulangan pada array beserta index dan data
    strings.forEachIndexed { index, s ->
        println("data ke ${index.inc()} adalah $s")
    }

    //perulangan pada array
    strings.forEach {
        println("Data : $it")
    }

    //menampilkan data array berdasarkan index
    println("Data yang ke 2 : ${strings[1]}")

    //mengganti nilai array pada index tertentu
    strings[1] = "My new value"
    println("Data yang ke 2 : ${strings[1]}")

    //-------------------------------

    val arrInt = intArrayOf(1, 4, 6, 7, 3, 4)
    println("Data arrInt : ${Arrays.toString(arrInt)}")

    //---------------------------

    val namas = arrayOf("Ilham", "Adhi", "Sam", "Ali", "Zul")
    println("Nama : ${Arrays.toString(namas)}")

    namas.sortBy { it }
    println("By Asc : ${Arrays.toString(namas)}")

    namas.sortByDescending { it }
    println("By Des : ${Arrays.toString(namas)}")

    val nameList = mutableListOf<String>()
    nameList.add("Ilham")
    nameList.add("Zul")
    nameList.add("Ahmad")
}