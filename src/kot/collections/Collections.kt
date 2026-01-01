package kot.collections

fun main() {
    /** массив */
    val array = arrayOf(1, 2, 3, 4, 5, 10)
    val array2 = arrayOfNulls<Int?>(10) // массив размером 10 заполнен нуллами

    /** ArrayList / LinkedList */
    val immutableIntList: List<Int> = ArrayList()
//    immutableIntList.add(2)    // ошибка компиляции -> List(Set, Map) - неизменяемые коллекции, только на чтение

    val mutableIntList1: MutableList<Int> = ArrayList()                     // ArrayList
    val mutableIntList2: MutableList<Int> = mutableListOf(2,6,8)            // ArrayList
    val mutableIntLinkedList2: MutableList<Int> = mutableListOf(2,6,8)      // LinkedList
    val intList = (0..100).toList()                                   // список от 0 до 100
    mutableIntList1.add(5)              // MutableList -> изменяемая коллекция
    mutableIntList2.add(5)              // MutableList -> изменяемая коллекция
    mutableIntLinkedList2.add(10)       // MutableList -> изменяемая коллекция

    /** Set */
    val immutableSet: Set<Int> = HashSet()
//    immutableSet.add(5)     // ошибка компиляции, неизменяемая коллекция
    val mutableSet: MutableSet<Int> = HashSet()
    mutableSet.add(10)       // MutableSet -> изменяемая коллекция

    /** Map */
    val immutableMap: Map<Int, String> = HashMap()
//    immutableMap.add(1, "test")   // ошибка компиляции, неизменяемая коллекция
    val mutableMap: MutableMap<Int, String> = HashMap()
    mutableMap.put(1,"test")        // MutableMap -> изменяемая коллекция

    val immutableMap2 = mapOf(
        "key1" to 1,                // ключ/значение указываются через 'to'
        "key2" to 2,
        "key3" to 3
    )

    val immutableMap3 = mapOf(
        Pair("key1", 1),            // ключ/значение указываются в Pair
        Pair("key2", 2),
        Pair("key3", 3)
    )

}