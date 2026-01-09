package kot.singleton.var_1

class Database private constructor() {  // приватный конструктор

    val name = "main.db"
    val data = mutableListOf<String>()


    fun insertData(str: String) {
        data.add(str)
    }

    companion object {  // аналог статики в java

        var db: Database? = null

        fun getInstance(): Database {

            db?.let { return it }   // правая часть выполнится, если db не null

            val instance = Database()
            db = instance
            return instance
        }
    }
}
