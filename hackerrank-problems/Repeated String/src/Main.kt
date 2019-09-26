import java.util.*

/***
 *  problem link: https://www.hackerrank.com/challenges/repeated-string/problem
 *  Q: Lilah has a string, s, of lowercase English letters that she repeated infinitely many times.
 *  Given an integer, n, find and print the number of letter a's in the first  letters of Lilah's infinite string.
 *  For example,
 *  if the string s='abcac' and n=10 , the substring we consider is abcacabcac,
 *  the first 10 characters of her infinite string.
 *  There are 4 occurrences of a in the substring.
 */

// Complete the repeatedString function below.
fun repeatedString(s: String, n: Long): Long {

    val totalAs = getTotalAs(s)
    val num = n / s.length.toLong()
    val mod = n % s.length.toLong()
    var count = totalAs * num

    for (i in 0 until mod) {
        if (s[i.toInt()] == 'a') {
            count += 1
        }
    }
    return count
}

fun getTotalAs(s: String): Long {

    var count = 0L

    for (i in 0 until s.length) {
        if (s[i] == 'a') {
            count++
        }
    }

    return count
}

fun main() {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val n = scan.nextLine().trim().toLong()

    val result = repeatedString(s, n)

    println(result)
}
