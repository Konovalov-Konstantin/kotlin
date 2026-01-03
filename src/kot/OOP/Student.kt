package kot.OOP

/** 'data' в определении класса автоматически переопределяет toString, equals, hashCode,
 * переопределяет метод copy (копирует исходный объект со всеми полями (или, если нужно, указать нужному параметру иное значение) и присваивает ему новую ссылку),
 * переопределен деструктор (см.MainOOP стр.27)
 */
data class Student(val name: String, val lastName: String, val id: Int) {

}