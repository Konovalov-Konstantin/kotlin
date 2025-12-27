package kot.FunctionalProgramming

fun main() {

    val listOfNumbers = mutableListOf<Int>()

    for (number in 0..20) {
        listOfNumbers.add(number)
    }

    /** Фильтрация */
    val filteredList = listOfNumbers.filter { it % 2 == 0 }
    println(filteredList)

    val names = mutableListOf<String>("Ivan","Ben","John","Alex","Jason")
    val filteredNames = names.filter { it.startsWith("A") }
    println(filteredNames)

    /** Map */
    val intList = (0..10).toList()
    val modifiedList = intList.map { it * 3 }
    println(modifiedList)
}