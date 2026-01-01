package kot.collections

fun main() {

    val revenueByWeek = listOf(
        listOf(1, 2, 3, 4, 5),
        listOf(6, 7, 8),
        listOf(9, 10, 11, 12, 13, 14, 15)
    )

    val averageResult = revenueByWeek.flatMap { it }        // flatmap развернет все коллекции и объединит в одну общую -> [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]
        .average()                                          // среднее вычисляем на объединенной коллекции  -> 8.0

    println(averageResult)

    //****************************

    val data = mapOf(
        "file1" to listOf(15,52,12,94,3),
        "file2" to listOf(48,6,54,2),
        "file3" to listOf(12,5,44,75)
    )

    val averageFromMap = data.flatMap { entry -> entry.value }.average()
    println(averageFromMap)
}