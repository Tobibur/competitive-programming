fun main() {

    val strs = arrayOf("dograr","racecar","crar")
    val commonPrefix = longestCommonPrefix(strs)

    print(commonPrefix)
}

fun longestCommonPrefix(strs: Array<String>): String {
    if (strs.isEmpty()) {
        return ""
    }
    val firstValue = strs[0]

    val inOrder: String
    val reversed: String


    inOrder = getCommonPrefix(firstValue, strs)

    reversed = getCommonPrefix(firstValue, strs, true)


    return if (inOrder.length > reversed.length) inOrder else reversed

}

fun getCommonPrefix(firstValue: String, strs: Array<String>, isReversed:Boolean = false): String {

    var result = firstValue

    for (str in strs) {

        var str1 = str

        if(isReversed){
            result = result.reversed()
            str1 = str.reversed()
        }


        if (result != str1) {
            var temp = ""
            val maxLength = if (result.length > str1.length) str1.length else result.length
            for (i in 0 until maxLength) {
                if (result[i] == str1[i]) {
                    temp += result[i]
                }
            }

            result = temp
        }
    }

    return result
}