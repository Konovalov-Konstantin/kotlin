package kot

/** в котлин методы можно не оборачивать в класс */
/** метод main не принимает аргументов */
/** в котлин нет статики (слово static отсутствует, см. 'companion object' ) */
/** по дефолту все поля, методы и классы - public, если явно не указан модификатор private/protected/internal (видимость в рамках модуля) */
/** не нужны закрывающие ";" в объявлении переменных и методах  */
/** методы обозначаются как 'fun' */
/** переменная обозначается как var (может изменять значение), константа - val (значение не меняется)  */
/** в отличие от java сначала указывается имя переменной, затем через ':' ее тип  - var name: String */
/** в котлин нет примитивов (int, double...), только ссылочные типы (Int, Double, Long, Boolean ...)  */


fun main() {
    /** вместо System.out.println -> println */
    println("Hello Kotlin")

    /** val - константа (аналог final в java) (val name: String = "Ivan"). Тип (String) можно не указывать */
    val name: String = "Ivan"
    println(name)

    /** var - переменная, значение может изменяться */
    var age = 50
    age = 30

    /** в котлин переменные любого типа не могут содержать null.
     * Если нужно. чтоб переменная содержала null, нужно явно указать после типа знак вопрос '?' (var surname: String? = null)
     * Чтоб вызвать метод у переменной, в которой может быть null, нужно явно указать '?.' после имени переменной (surname?.length -> безопасный вызов метода, исключающий NPE) */
    val surname: String? = null

    println(surname?.length?.toString())    // безопасный вызов метода, исключающий NPE

    /** оператор элвиса '?:'  */
    val lenght = surname?.length ?: 0  // если surname.length = null, в lenght присвоится 0




    /** Создать метод, который принимает Map (ключ - название месяца, значение - массив чисел (выручка за каждую неделю) и выводит отчет:
     * Средняя выручка в неделю
     * Средняя выручка в месяц
     * Минимальная и максимальная выручки в месяц с названиями месяцев */
    val map = mapOf(
        "Январь" to listOf(100, 100, 200, 200),
        "Февраль" to listOf(200, 300, 400, 400),
        "Март" to listOf(500, -100, 600, 600),
        "Апрель" to listOf(700, 800, 900, 900),
    )

    printInfo(map)
}



fun printInfo(data: Map<String, List<Int>>) {
    val arrayList: MutableList<Int> = ArrayList()

    for (i in 0..<data.size) {
        data.values.forEach { array -> arrayList.add(array[i]) }
        println("Средняя выручка за ${i + 1} неделю: ${arrayList.average().toInt()}")
    }

    data.map { x ->
        println("Средняя выручка за ${x.key}: ${x.value.average()}")
    }

    var indexArrayContainsMaxElement = 0
    var maxElement = 0
    var indexArrayContainsMinElement = 0
    var minElement = Int.MAX_VALUE
    var i = 0

    data.values
        .filter { arr -> arr.all { element -> element > 0 } }
        .map { array ->
            val max = array.max()
            val min = array.min()
            if (max > maxElement) {
                maxElement = max
                indexArrayContainsMaxElement = i
            }
            if (min < minElement) {
                minElement = min
                indexArrayContainsMinElement = i
            }
            i++
        }
    println("Максимальная выручка: $maxElement в ${data.keys.elementAt(indexArrayContainsMaxElement)} месяце")
    println("Минимальная выручка: $minElement в ${data.keys.elementAt(indexArrayContainsMinElement)} месяце")
}
