class MyStack(size: Int) {

    private val arr = arrayOfNulls<Char>(size)
    private var top = -1
    private val capacity = size

    fun push(value: Char) {
        if (top == capacity - 1)
            println("Stack is full")
        else
            arr[++top] = value
    }


    fun pop() {
        if (arr[0] == null) {
            println("Stack is empty!")
        } else {
            arr[top] = null
            arr[top--]
        }
        //peek()
    }

    fun peek(): Char? {
        if (arr[0] == null)
            println("Stack is empty!")
        else
            println(arr[top])

        return arr[top]
    }

    fun isEmpty(): Boolean {
        return arr[0] == null
    }
}