package kot.OOP

import java.util.*

class Employee(val name: String, val position: String, val yearEmployment: Int) {

    val experience: Int // стаж - свойство, которое рассчитывается в момент вызова геттера как разность текущего года и года, переданного в конструкторе при создании Employee
        get() {
            return Calendar.getInstance().get(Calendar.YEAR) - yearEmployment
        }
}