fun main(){
    print("enter number : ")
    val input = readLine()
    val num = input?.toIntOrNull()
    if (num != null) {
        println(if (num % 2 == 0) "Even" else "Odd")
    }
    else{
        println("Invalid input")
    }
}