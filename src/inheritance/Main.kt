package inheritance

fun main(args: Array<String>) {
    val ayam = Ayam()
    ayam.jenisAyam("Ayam kampung")
    ayam.jumlahKaki(2)
    ayam.jenisMakanan(JenisMakanan.HERBIVORA)
    ayam.warnaBulu("Merah-putih")
    ayam.mamalia(false)

    println("----------------------")
    val kelinci = Kelinci()
    kelinci.jenisKelinci("Persia")
    kelinci.jenisKelamin("Jantan")
    kelinci.usiaKelinci(5)
    kelinci.warnaBulu("Merah")
}