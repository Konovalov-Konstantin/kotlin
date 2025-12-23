package kot

import java.util.*

fun main() {
    println(max(5, 8))
    println(crop("afternoon"))
    println(summ(1, 2, 3, 4, 5))
    println(sort(arrayOf(2, 17, 6, 43, 6, 8)))
}


//fun max(a: Int, b: Int): Int {  // (имя:тип, имя:тип) : возвращаемый тип
//    if (a > b) {
//        return a
//    } else {
//        return b
//    }
//}

// краткая запись функции выше
fun max(a: Int, b: Int): Int = if (a > b) a else b

// вернуть первые 5 символов строки (или всю строку, если она короче 5 символов)
fun crop(s: String) = s.substring(0, Math.min(s.length, 5))

// пример с vararg (аналог *(int... numbers)* в java)
fun summ(vararg numbers: Int): Int? {
    return numbers.toList().stream().reduce { a, b -> a + b }.orElse(0)
}

// сортировка массива и возврат неизменяемой коллекции
fun sort(params: Array<Int>): List<Int> {
    return params.toList().sorted()
}


