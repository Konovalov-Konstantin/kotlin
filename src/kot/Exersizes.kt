package kot

/** найти сумму длин нуллабельных строк */
val str1: String? = null
val str2: String? = "test"
val str3: String? = ""

fun main() {
    val result = (str1?.length ?: 0) + (str2?.length ?: 0) + (str3?.length ?: 0)
    println(result)
}
