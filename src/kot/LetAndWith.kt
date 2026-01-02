package kot

var name: String? = null

//var nullableIntList: MutableList<Int>? = mutableListOf()
var nullableIntList: MutableList<Int>? = null

fun main() {

    /** Let - безопасный вызов на переменной, которая может быть null, исключающий NPE*/
//    if (name?.length > 5) {   // ошибка компиляции
//        ........
//    }

    if (name?.length?.compareTo(5) == 1) {
        println("Длина строки больше 5 символов")
    }

    name?.let { // let - безопасный вызов на переменной, которая может быть null, исключающий NPE. Если переменная null -> выражение после let не будет выполняться
        if (it.length > 5) {    // обращение в теле метода let к переменной (name) через 'it'
            println("Длина строки больше 5 символов")
        }
    }

    /** With - если на одном объекте/переменной вызывается много методов подряд */
    val list = mutableListOf<Int>()
//    for (i in 0..1000) {
//        list.add((Math.random() * 1000).toInt())
//    }
//    println(list.sum())
//    println(list.average())
//    println(list.max())
//    println(list.min())
//    println(list.first())
//    println(list.last())

    with(list) {    // все вызовы внутри {} будут для переменной list
        for (i in 0..1000) {
            add((Math.random() * 1000).toInt())
        }
        println("sum: ${sum()}")
        println("average: ${average()}")
        println("max: ${max()}")
        println("min: ${min()}")
        println("first: ${first()}")
        println("last: ${last()}")
    }


    /** let and with */
    nullableIntList?.let { it ->  // если nullableIntList будет null, то не упадем с NPE и выражение после let не выполнится
        with(it) {
            for (i in 0..1000) {
                add((Math.random() * 1000).toInt())
            }
            println(filter { x -> x % 2 == 0 }.take(10))
        }
    }
}