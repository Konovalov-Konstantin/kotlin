package kot.singleton.var_1

fun main() {

    val db = Database.getInstance()
    db.insertData("1")
    db.insertData("2")
    Database.getInstance().insertData("3")
    for(str in db.data) {
        println(str)
    }
}