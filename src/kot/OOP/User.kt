package kot.OOP

class User {
    var age: Int = 0
        set(value) {    // по умолчанию геттеры и сеттеры уже есть для всех полей, но можно переопределить (под нужным полем)
            if (value >= 0)
                field = value
        }

    var name: String? = null
        get() {         // по умолчанию геттеры и сеттеры уже есть для всех полей, но можно переопределить (под нужным полем)
            return field?.uppercase()
        }

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }

    override fun toString(): String {
        return "User(age=$age, name=$name)"
    }
}