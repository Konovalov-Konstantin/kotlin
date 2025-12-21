package kot

/** when - аналог switch/case в java
 * оператор break не нужен */

fun main() {
    val month = "Январь"
    val season: String

    /** пример со строками */
    when (month) {
        "Декабрь", "Январь", "Февраль" -> {
            season = "Зима"
        }
        "Март", "Апрель", "Май" -> {
            season = "Весна"
        }
        "Июнь", "Июль", "Август" -> {
            season = "Лето"
        }
        "Сентябрь", "Октябрь", "Ноябрь" -> {
            season = "Осень"
        }
        else -> {                           // аналог default
            season = "Не найдено"
        }
    }
    println(season)


    /** пример с диапазоном чисел */
    val indeOfmonth = 4

    val seasonOfYear = when (indeOfmonth) {
        12,1,2 -> {
            "Зима"
        }
        in 3..5 -> {                // можно указать диапазон
            "Весна"
        }
        in 6..8 -> {
            "Лето"
        }
        in 9..11 -> {
            "Осень"
        }
        else -> {                           // аналог default
           "Не найдено"
        }
    }
    println(seasonOfYear)


    /** пример, когда в when не передаются параметры */
    val temperature = 80

    val state = when {
        temperature < 0 -> "твердое"
        temperature in 0..100 -> "жидкое"
        else -> "газообразное"
    }
    println(state)


    /** пример с несколькими условиями */
    val time = 23
    val weatherIsGood = true
    val action = when {
        time in 6..22 && weatherIsGood -> "Гулять"
        time in 6..22 && !weatherIsGood -> "Читать книгу"
        else -> "Спать"
    }
    println(action)
}