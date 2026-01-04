package kot.OOP

/** абстрактный класс */
abstract class Worker(val name: String, val age: Int) {

    abstract fun work() // абстрактный метод без реализации

    fun dinner() {      // метод с дефолтной реализацией
        println("обедать")
    }
}