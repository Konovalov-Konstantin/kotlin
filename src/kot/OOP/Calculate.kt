package kot.OOP

class Calculate {

    /** Замена static в java - объект companion позволяет вызвать метод, не создавая экземпляр класса */
    companion object {
        private const val PI = 3.14         // константа (аналог public static final float PI = 3.14)
        fun square(a: Int)= a * a
        fun lengthOfCircle(radius: Float) = 2 * PI * radius
    }
}