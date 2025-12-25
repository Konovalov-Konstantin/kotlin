package kot.FunctionalProgramming

fun main() {

    /** анонимная функция */
    val summ = {a: Int, b: Int -> a + b}                            // анонимная функция ( {параметр:тип, параметр:тип -> тело метода } )
    val summ1:(Int, Int) -> Int = {a, b -> a + b}                   // эквивалентная запись функции выше ( (тип параметра1, тип параметра2) -> возвращаемый тип = {параметр1, параметр2 -> тело метода} )
    val square: (Int) -> Int = {it * it}                            // если функция принимает 1 аргумент, можно его указать как 'it'
    val sayHello: (String) -> Unit = {println("Привет $it")}        // Unit - аналог void в java

    println(summ(5, 15))
    println(summ1(20, 15))
    println(square(5))
    sayHello("user")
}