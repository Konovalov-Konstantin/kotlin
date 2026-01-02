package kot.OOP

//class Country(private var name: String, private var population: Long) {     // первичный конструктор
class Country(private var name: String = "", private var population: Long = 0) {     // первичный конструктор с дефолтными значениями

    constructor() : this("", 0) {       // вторичный конструктор (через this обязательно вызвать первичный конструктор)
    }

    override fun toString(): String {
        return "Country(name='$name', population=$population)"
    }

}