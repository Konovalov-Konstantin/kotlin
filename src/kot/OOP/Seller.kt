package kot.OOP

/** наследование от абстрактного класса Worker и интерфейса Cleaner */
class Seller(name: String, age: Int) : Worker(name, age), Cleaner {

    /** реализация метода абстрактного класса Worker */
    override fun work() {
        println("$name продает товар")
    }

    override fun clean() {
        println("$name делает уборку")
    }

}