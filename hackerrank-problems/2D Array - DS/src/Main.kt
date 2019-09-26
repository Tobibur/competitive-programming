import java.util.*

/***
 * Link - https://www.hackerrank.com/challenges/2d-array/problem
 * The problem statement is given in the pdf file 'hourglass-2d-array.pdf' in this project
 */

// Complete the hourglassSum function below.
fun hourglassSum(arr: Array<Array<Int>>): Int {
    var highestSum = 0
    for (i in 0 until 4) {
        for (j in 0 until 4) {
            val sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2]
            if(i == 0 && j == 0){
                highestSum = sum
            }
            if(sum>highestSum){
                highestSum = sum
            }
        }
    }
    return highestSum
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val arr = Array<Array<Int>>(6, { Array<Int>(6, { 0 }) })

    for (i in 0 until 6) {
        arr[i] = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()
    }

    val result = hourglassSum(arr)

    println(result)
}
