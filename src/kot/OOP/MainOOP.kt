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

    /** абстрактный класс и интерфейс */
    val workers = mutableListOf<Worker>()
    workers.add(Seller("Petr",30))
    workers.add(Seller("Alex",33))
    workers.add(Director("Bob",40))

    for(worker in workers) {
        worker.work()
//        worker.clean()            // ошибка компиляции (не все worker реализуют интерфейс Cleaner)
        if (worker is Cleaner) {    // 'is' - проверка, реализует ли worker интерфейс Cleaner (аналог instanceOf)
            worker.clean()          // Smart Cast - автоматическое приведение типа к типу Cleaner, метод clean становится доступен
        }
    }
    val cleaners = workers
        .filter { it is Cleaner }   // 'is' - проверка, реализует ли объект (it) интерфейс Cleaner (аналог instanceOf)
        .map { it as Cleaner }      // 'as' - явное приведение объекта (it) к типу Cleaner

    for (cleaner in cleaners) {
        println("*** ${cleaner.clean()}")
    }

    /** Анонимный класс
     * если метод используется 1 раз и нет смысла создавать класс, используется анонимный класс
     */
    clean(object : Cleaner {    // object - объект анонимного класса
        override fun clean() {
            println("реализация метода clean в абстрактном классе")
        }
    })

    clean {
        println("вызов inline функции без создания объекта анонимного класса")
    }
}

/** extension-функция, расширяющая класс Employee (метод, написанный вне класса Employee) */
fun Employee.printInfo(): Unit = println("name: ${this.name}, position: ${this.position}, experience: ${this.experience}")


fun clean(cleaner: Cleaner) {
    cleaner.clean()
}

inline fun clean(cleanFunction: () -> Unit) {   // функция высшего порядка (ф-ция, которая принимает в качестве параметра другую функцию)
    cleanFunction()                             // такие функции лучше обозначать inline, т.к. при их вызове не будет создаваться объект анонимного класса и производительность будет лучше
}