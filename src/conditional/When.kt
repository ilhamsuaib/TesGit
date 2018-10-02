package conditional

object When {

    fun checkX(x: String) {
        when (x) {
            "English" -> println("How are you?")
            "Indonesian" -> println("Kamu apa kabar?")
            else -> println("Saya tidak tau!")
        }
    }

    fun advMatchOps(x: Any) {
        val names = listOf("John", "Sarah", "Tim", "Maggie")
        when (x) {
            in names -> print("I know that name!")
            in 1..10 -> print("Argument was not in the range from 1 to 10")
            is String -> print(x.length)
            else -> println("angka selain 1 sampe 10")
        }
    }

    fun checkNilai(x: Int) {
        when(x) {
            //with body (more then 1 line)
            in 0..40 -> {
                /*do something*/
                println("Maaf, Anda tidak lulus")
                println("nilai $x, grade E")
            }
            //only 1 line
            in 41..60 -> println("nilai $x, grade D")
            in 61..75 -> println("nilai $x, grade C")
            in 76..80 -> println("nilai $x, grade B")
            in 81..100 -> println("nilai $x, grade A")
            else -> println("Masukkan angka 0 - 100")
        }
    }

    fun greeting(x: String) {
        val greeting: String = when (x) {
            "English" -> "How are you?"
            "German" -> "Wie geht es dir?"
            else -> "I don't know that language yet :("
        }
        print(greeting)
    }

    //if statement gak usah dicontohin
}