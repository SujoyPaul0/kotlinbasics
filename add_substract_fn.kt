fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 2
    
    val result = add(firstNumber, secondNumber)
    val anotherResult = add(firstNumber, thirdNumber)
    
    val resultSub = substract(firstNumber, secondNumber)
    val anotherResultSub = substract(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")
    
    println("$firstNumber - $secondNumber = $resultSub")
    println("$firstNumber - $thirdNumber = $anotherResultSub")
}

// Define add() function below this line
fun add(firstNumber: Int = 0, secondNumber: Int = 0, thirdNumber: Int = 0): Int {
    val result = firstNumber + secondNumber + thirdNumber
    val anotherResult = firstNumber + thirdNumber + thirdNumber
    return result
    return anotherResult
}

// Substract() function
fun substract(firstNumber: Int = 0, secondNumber: Int = 0, thirdNumber: Int = 0): Int {
    val resultSub = firstNumber - secondNumber - thirdNumber
    val anotherResultSub = firstNumber - secondNumber - thirdNumber
    return resultSub
    return anotherResultSub
}