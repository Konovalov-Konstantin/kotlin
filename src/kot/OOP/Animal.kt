package kot.OOP

/** чтоб можно было унаследоваться от класса, его нужно явно пометить 'open' (по умолчанию все классы 'final') */
open class Animal(val name: String, var weight: Int, val habitat: String) {

    /** чтоб можно было переопределить метод в подклассе, его нужно явно пометить 'open' (по умолчанию все методы 'final') */
    open fun eat() {
        println("$name ест")
    }

    fun run() {
        println("$name бежит")
    }
}