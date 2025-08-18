fun main ()
{
    println("Enter array size : ")
    val size = readln().toInt()

    val ridham = IntArray(size)

    println("Enter $size number : ")
    for(i in 0 until size)
    {
        ridham[i] = readln().toInt()
    }

    println("your array : ${ridham.contentToString()}")

    val maxnum = ridham.maxOrNull()

    println("max number is : $maxnum")

}