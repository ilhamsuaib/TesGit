package loop

object Loops {

    private val names = listOf("Ilham", "Ari", "Budi", "Ahmad", "Lala", "Putri", "Ima", "Ani")

    fun loop1() {
        for (name in names) {
            println("Name : $name")
        }
    }

    fun loop2() {
        for(i in 3..7) {
            println("Angka : $i")
        }
    }

    fun loop3() {
        /*names.forEachIndexed { index, s ->
            println("name : $s, index : $index")
        }*/

        names.forEach {
            println(it)
        }
    }

    fun loop4() {
        repeat(names.size) {
            println("index : $it")
        }
    }

    fun loop5() {
        var i = 0
        while (i < 5) {
            println("index : $i")
            if (i == 3) {
                break
            }
            i++
        }
    }

    fun loop6() {
        var i = 0
        do {
            println("index : $i")
            i++
        } while (i < 5)
    }

    fun loop7() {
        luar@ for (i in 0..10) {
            dalam@ for (j in 0..10) {
                if (j == 3) {
                    break@dalam
                }
                if (i == 3) {
                    break@luar
                }
                println("I = $i, J : $j")
            }
        }
    }
}