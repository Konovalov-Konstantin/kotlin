package kot

fun main() {

    val array = arrayOf(1, 2, 3, 4, 5)

    /** цикл for */
    for (i in array) {  // не указывается тип переменной. Вместо ":" -> "in"
        println(i)
    }

    val emptyArray = arrayOfNulls<Int?>(10) // массив с нуллами размером 10
    for (i in 0..emptyArray.size - 1) {     // включаются верхняя и нижняя границы
        emptyArray[i] = i
    }

    for (i in 0..emptyArray.size - 1) {     // включаются верхняя и нижняя границы
        println("вывод из цикла for $i")
    }

    /** ключевое слово until */
    for (i in 0 until emptyArray.size) {    // until - ключевое слово, не включает верхнюю границу массива (fix ArrayIndexOutOfBoundsException)
        emptyArray[i] = i
    }

    for (i in emptyArray) {
        println("вывод с until $i")
    }

    /** downto - если нужно итерироваться с конца массива */
    for (i in emptyArray.size downTo 0) {
        println("вывод наоборот $i")
    }

    /** если нужно обратиться по индексу к элементам массива */
    for ((index, i) in emptyArray.withIndex()) {
        emptyArray[index] = i?.times(2) // умножение каждого эл-та на 2
    }

    for (i in emptyArray) {
        println("вывод с withIndex $i")
    }
}