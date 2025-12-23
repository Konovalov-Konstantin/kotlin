package kot

fun main() {
    printInfo("Сидоров", "Николай") // дефолтная фамилия перезатрется
    println("***")
    printInfo(patronymic = "Александрович", lastName = "Жучков")    // именованные параметры, можно передавать в любом порядке. Дефолтные перезатрутся
}

fun printInfo(lastName: String = "Иванов",        // можно сразу указать дефолтное значение, если при вызове не будет передано другое значение, присвоится дефолтное
              name: String = "",
              patronymic: String = "") {
    if (lastName.isNotEmpty()) {
        println("фамилия: $lastName")
    }
    if (name.isNotEmpty()) {
        println("имя: $name")
    }
    if (patronymic.isNotEmpty()) {
        println("отчество: $patronymic")
    }
}