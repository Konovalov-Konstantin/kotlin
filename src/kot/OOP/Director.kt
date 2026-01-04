package kot.OOP

/** наследование от абстрактного класса Worker */
class Director(name: String, age: Int) : Worker(name, age) {

    /** реализация метода абстрактного класса Worker */
    override fun work() {
        println("$name управляет процессом")
    }

}