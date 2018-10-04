package inheritance

/*abstraction : class implement interface*/
class Kelinci : Mamalia {

    fun jenisKelinci(jenis: String) {
        println("Jenis kelinci : $jenis")
    }

    override fun warnaBulu(warna: String) {
        println("Warna bulu : $warna")
    }

    override fun usiaKelinci(usia: Int) {
        println("Usia kelinci : $usia tahun")
    }

    override fun jenisKelamin(jk: String) {
        println("Jenis kelamin : $jk")
    }
}