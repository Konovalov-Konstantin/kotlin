package kot

fun main() {
    val positiveNumber = 4
    val negativeNumber = -4
    println(positiveNumber.isNumberPositive())  // true
    println(negativeNumber.isNumberPositive())  // false
    println("***")
    println(3.isNumberSimple())
    println(4.isNumberSimple())
    println(5.isNumberSimple())
}

/** можно расширить класс (в данном примере класс Int) своим методом и вызывать этот метод на любом экземпляре данного класса */
fun Int.isNumberPositive(): Boolean = this > 0  // расширяемый класс (Int).название метода(): возвращаемое значение = тело метода (this - переменная, на которой будет вызываться метод)


/** является ли число простым? */
fun Int.isNumberSimple(): Boolean {
    for (i in 2 until this) {
        if (this % i == 0) {
            return false
        }
    }
    return true
}

