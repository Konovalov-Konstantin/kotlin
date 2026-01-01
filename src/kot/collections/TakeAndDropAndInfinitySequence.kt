package kot.collections

fun main() {

    /** Take and Drop */
    val array = (1..100).toList()
    val employees = array.map { "Employee №$it" }
    val first5 = employees.take(5)            // take - берет с начала указанное кол-во эл-тов из коллекции (0..5)
    val last3 = employees.takeLast(3)         // take - берет с конца указанное кол-во эл-тов из коллекции (98, 99, 100)

    val after95 = employees.drop(95)          // drop - пропустит указанное кол-во эл-тов от начала коллекции и вернет остальные (96..100)
    val before7 = employees.dropLast(94)      // dropLast - пропустит указанное кол-во эл-тов от конца коллекции и вернет остальные от начала (0..6)

    first5.forEach {print("$it ") }
    println()
    last3.forEach { print("$it ") }
    println()
    after95.forEach() { print("$it ") }
    println()
    before7.forEach() { print("$it ") }
    println()

    /** бесконечные последовательности */
    val inifinityIntArray = generateSequence ( 0) {it + 2}                         // бесконечная последовательность чётных чисел от 0
    val inifinitCharArray = generateSequence ( 'A') {it + 1}                       // бесконечная последовательность символов от 'A'
    val inifinitRandomIntArray = generateSequence { (Math.random() * 100).toInt() }     // бесконечная последовательность случайных чисел в диапазоне 0..100

    inifinityIntArray.take(10).forEach { print("$it ") }        // take - берет указанное число эл-тов от начала коллекции
    println()
    inifinitCharArray.take(10).forEach {  print("$it ") }
    println()
    inifinitRandomIntArray.take(10).forEach { print("$it ") }
    println()

}