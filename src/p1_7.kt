fun factorial(n: Int): Int {
    return if (n == 0) {
        1   // Base case : recursion ko stop karne ke liye
    } else {
        n * factorial(n - 1)  // Recursive call: function ke andar hi function call ho to use recursion kehte hain
    }
}

fun main() {
    print("Enter a number:")
    val num = readLine()!!.toInt()
    val result = factorial(num)
    println("Factorial of $num = $result")
}
