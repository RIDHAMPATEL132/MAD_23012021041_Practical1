fun main(){
    val intVal : Int = 10
    val doubleVal : Double = intVal.toDouble()
    println("Integer value = $intVal")
    println("Double value(from int) = $doubleVal")
    val stringVal : String = "1234"
    val intVal1 : Int = stringVal.toInt()
    println("String value = $stringVal")
    println("Integer value (from string) =$intVal1")
    val stringVal1 : String = "2345"
    val doubleVal1 : Double = stringVal.toDouble()
    println("Double value (from string) = $doubleVal1")

}