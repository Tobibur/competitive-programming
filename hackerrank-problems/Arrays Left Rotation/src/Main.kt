import java.util.*

/***
 * link: https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem
 */

// Complete the rotLeft function below.
fun rotLeft(a: Array<Int>, d: Int): Array<Int> {

    val aSize = a.size
    val arr: Array<Int> = a

    if(aSize == d){
        return a
    }

    for (i in 0 until d) {

        var index = arr[0]
        if (i == 0) {

            index = a[0]
        }
        for (j in 0 until aSize) {

            if (j == aSize - 1) {
                arr[j] = index
            } else {
                arr[j] = arr[j + 1]
            }

        }
    }

    return arr

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nd = scan.nextLine().split(" ")

    val n = nd[0].trim().toInt()

    val d = nd[1].trim().toInt()

    val a = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val result = rotLeft(a, d)

    println(result.joinToString(" "))
}
