package kot.singleton.var_2

object  Database {      // глобальный синхронизированный объект, создастся в одном экземпляре

    val name = "main.db"
    val data = mutableListOf<String>()

    fun insertData(str: String) {
        data.add(str)
    }
}
