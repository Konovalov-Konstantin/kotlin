package kot.singleton.var_2

fun main() {

    val db = Database
    db.insertData("1")
    db.insertData("2")
    Database.insertData("3")    // будет использован тот же объект db
    for(str in db.data) {
        println(str)
    }
}