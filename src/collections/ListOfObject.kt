package collections

class ListOfObject {

    private val listOfBaju = mutableListOf<Baju>()

    fun runBaju() {
        listOfBaju.add(Baju("L", "Merah", true))
        listOfBaju.add(Baju("M", "Merah", false))
        listOfBaju.add(Baju("M", "Ping", true))
        listOfBaju.add(Baju("M", "Biru", false))
        listOfBaju.add(Baju("XL", "Biru", false))
        listOfBaju.add(Baju("S", "Abu-abu", false))
        (0..5).forEach {
            val isLenganPanjang = (it.rem(2) == 0)
            listOfBaju.add(Baju("S", "Biru$it", isLenganPanjang))
        }

        //remove objek berdasarkan kondisi
        listOfBaju.removeIf {
            it.warna == "Biru"
        }

        val newList = listOfBaju.filter {
            it.isLenganPanjang
        }
        newList.forEach {
            println(it)
        }

        listOfBaju.forEach { baju ->
            println(baju)
        }
    }
}