package inheritance

/*parent class*/
open class Hewan {

    fun jumlahKaki(jKaki: Int) {
        println("Jumlah Kakai : $jKaki")
    }

    fun jenisMakanan(jenis: JenisMakanan) {
        println("Jenis Hewan : $jenis")
    }

    fun warnaBulu(warna: String) {
        println("Warna Bulu : $warna")
    }

    fun mamalia(isMamalia: Boolean) {
        val jenis = if (isMamalia) "Mamalia" else "Bukan Mamalia"
        println("Jenis : $jenis")
    }
}