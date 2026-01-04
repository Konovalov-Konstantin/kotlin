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


    val employee = Employee("Alex", "HR", 2020)
    employee.printInfo()

    val student1 = Student("Petr","Petrov",20)
    val student2 = Student("Petr","Petrov",20)
    println(student1)
    println(student1 == student2)   //  '==' сравнение объектов аналогично equals в java
    println(student1 === student2)  //  '===' сравнение ссылок аналогично '==' в java

    /** деструктор - позволяет вытаскивать из объекта его поля с присвоенными значениями (для классов, помеченных 'data') */
    val(name:String, lastName:String, id:Int) = student1
    println("name: $name, lastName: $lastName, id: $id")

    /** наследование */
    val animal = Animal("animal", 10, "sea")
    val dog = Dog(15)
    println(animal)
    println(animal.eat())
    println(dog)
    println(dog.eat())
}

/** extension-функция, расширяющая класс Employee (метод, написанный вне класса Employee) */
fun Employee.printInfo(): Unit = println("name: ${this.name}, position: ${this.position}, experience: ${this.experience}")
