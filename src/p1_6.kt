fun operations(a:Int, b:Int){
    println("Addition of $a and $b is ${a + b}")
    println("Subtraction of $a and $b is ${a - b}")
    println("Multiplication of $a and $b is ${a * b}")
    println("Division of $a and $b is ${a / b}")
}
fun main(){
    print("Enter first num : ")
    val a = readLine()!!.toInt() //(!!)fix che ke user null enter nai j kare

    print("Enter second num : ")
    val b = readLine()!!.toInt()

    operations(a,b)
}