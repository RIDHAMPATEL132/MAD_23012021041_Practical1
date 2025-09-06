import java.util.*

fun main() {
    val arr1 = arrayOf(10, 90, 60, 80, 100)
    println("Create Array-1 by using arrayOf() method:")
    println(arr1.contentToString())

    val arr2 = Array(5) { 0 }
    println("\nCreate Array-2 by using Array<>():")
    println(arr2.contentToString())

    val arr3 = Array(8) { i -> i }
    println("\nCreate Array-3 by using Array<> and lambda function:")
    println(arr3.contentToString())

    val arr4 = IntArray(5)
    println("\nCreate Array-4 by using IntArray():")
    println(arr4.contentToString())

    val arr5 = intArrayOf(12, 10, 1, 5, 18, 19)
    println("\nCreate Array-5 by using intArrayOf():")
    println(arr5.contentToString())

    val arr6 = arrayOf(
        intArrayOf(1, 3),
        intArrayOf(4, 5),
        intArrayOf(6, 7)
    )
    println("\nCreate 2D Array-6 by using arrayOf() and intArrayOf():")
    println(Arrays.deepToString(arr6))

    val sc = Scanner(System.`in`)
    val userArray = IntArray(5)
    println("\nPlease enter Array Value:")
    for (i in userArray.indices) {
        print("a[$i]=")
        userArray[i] = sc.nextInt()
    }

    println("\nEntered Array:")
    println(userArray.contentToString())

    println("\n***************With Built-in Function***************")
    val sortedWithBuiltIn = userArray.sortedArray()
    println("After sorting by built-in function:")
    println(sortedWithBuiltIn.contentToString())

    println("\n***************Without Built-in Function***************")
    println("Before Sorting:")
    println(userArray.contentToString())

    val manualArr = userArray.copyOf()
    for (i in manualArr.indices) {
        for (j in 0 until manualArr.size - i - 1) {
            if (manualArr[j] > manualArr[j + 1]) {
                val temp = manualArr[j]
                manualArr[j] = manualArr[j + 1]
                manualArr[j + 1] = temp
            }
        }
    }

    println("After Sorting without built-in function:")
    println(manualArr.contentToString())
}
