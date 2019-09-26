fun main() {
    print(romanToInt("XXIV"))
}


private fun romanToInt(s: String): Int {

    var sum = 0

    for (i in 0 until s.length) {
        val currValue = getValueOf(s[i])
        var prevValue = 0
        if (i > 0) {
            prevValue = getValueOf(s[i - 1])
        }
        sum += if (prevValue < currValue) {
            currValue - prevValue * 2
        } else {
            currValue
        }

        println("curr = $currValue & sum = $sum")
    }

    return sum
}

private fun getValueOf(c: Char): Int {
    return when (c) {
        'I' -> 1
        'V' -> 5
        'X' -> 10
        'L' -> 50
        'C' -> 100
        'D' -> 500
        'M' -> 1000
        else -> 0
    }
}