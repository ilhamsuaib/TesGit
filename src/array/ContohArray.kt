package array

class ContohArray {

    val empty = emptyArray<String>()

    var strings = Array<String>(size = 5, init = {
        "Item $it"
    })

}