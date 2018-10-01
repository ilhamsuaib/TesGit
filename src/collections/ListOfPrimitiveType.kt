package collections

class ListOfPrimitiveType {

    private val stringList = mutableListOf<String>()
    private val intList = mutableListOf<Int>()

    fun runIntList() {
        //otw
    }
    
    fun runStringList() {
        stringList.add("Ilham")
        stringList.add("Ahmad")
        stringList.add("Wahyu")
        stringList.addAll(listOf("A", "B", "C", "A"))
        stringList.addAll(listOf("E", "F", "G", "H"))

        //fungsi menghapus data
        stringList.removeAt(0)
        stringList.remove("A")

        //fungsi menghapus data pada list dengan kondisi tertentu
        stringList.removeIf {
            it.toLowerCase().contains("h")
            /*it.contains("h") || it.contains("H")*/
        }
        //fungsi `find` untuk mencari data pada list
        val nama = stringList.find { it == "A" }
        println("Nama : $nama")

        //mengganti data berdasarkan index
        stringList[0] = "Lala"

        //fungsi filter/menyaring data berdasarkan kondisi
        val newStringList: List<String> = stringList.filter {
            it.toLowerCase().contains("a")
        }
        println("Filter : $newStringList")

        //transform data pada list
        val transformedList = stringList.map {
            it.toLowerCase().replace("a", "C")
        }
        println("Transform : $transformedList")

        //menampilkan data dari `stringList`
        println("Baju String : $stringList")
    }
}