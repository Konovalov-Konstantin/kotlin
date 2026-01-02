package kot.OOP

fun main() {

    val user = User("Andrew", 25)   // 'new' для создания объекта указывать не нужно
//    user.name = "Andrew"
//    user.age = -25
    println(user)

    val russia = Country("Russia", 150_000_000)      // вызовется первичный конструктор
    val canada = Country( population = 30_000_000)      // вызовется первичный конструктор (в name будет дефолтное "")
    val poland = Country()  // вызовется вторичный конструктор без параметров
    println(russia)     // name='Russia', population=150000000
    println(poland)     // name='', population=0
    println(canada)     // name='', population=30000000
}