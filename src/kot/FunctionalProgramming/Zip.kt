package kot.FunctionalProgramming

fun main() {
    val size = 20
    val names = (0..size).toList().map { "Name_$it" }

    val phones = (generateSequence { (Math.random() * (9999999 - 1000000) + 1).toInt() }.map { "+7900$it" }.take(size)).toList()

    /** zip - объединяет элементы разных массивов (names, phones) в один общий (users) */
    val users = names.zip(phones)

    for(user in users) {
        println("${user.first}: ${user.second}")    // чтоб вытащить эл-ты из типа Pair<Type, Type>, используются .first и .second
    }

}