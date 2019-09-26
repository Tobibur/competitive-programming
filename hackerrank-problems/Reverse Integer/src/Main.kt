object Main {

    @JvmStatic
    fun main(args: Array<String>) {
        println(reverse(-333333333))
    }

    private fun reverse(x: Int): Int {

        var div = x
        var sum = 0

        return try {
            while (div != 0) {

                sum = sum * 10 + div % 10
                div /= 10
            }

            sum
        } catch (e: NumberFormatException) {
            0
        }
    }
}
