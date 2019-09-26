import java.util.Stack

fun main() {

    val solution = Solution()

    val str = "{}{{}}[()]"

    print(solution.isValid(str))
}


class Solution {
    fun isValid(s: String): Boolean {

        val myStack = Stack<Char>()

        for (c in s) {
            when (c) {

                '(' -> myStack.push(')')

                '{' -> myStack.push('}')

                '[' -> myStack.push(']')

                else -> {
                    if (myStack.isEmpty() || myStack.pop() != c)
                        return false
                }
            }
        }

        return myStack.isEmpty()
    }
}