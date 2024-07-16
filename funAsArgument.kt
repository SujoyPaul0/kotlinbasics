fun main() {
    val coins: (Int) -> String = {quantity -> "$quantity quaters"}
    // Note: In the coins() function, the Int parameter is named quantity. 
    // However, it could be named anything 
    // as long as the parameter name and the variable name in the string 
    // are the same.
    
    val cupcake: (Int) -> String = {"Have a cupcake!"}
    
    val treatFunction = trickOrTreat(false, coins)
    val trickFunction = trickOrTreat(true, cupcake)
    treatFunction()
    trickFunction()
}

fun trickOrTreat(isTrick: Boolean, extraTreat: (Int) -> String): () -> Unit {
    if (isTrick) {
        return trick
    } else {
        println(extraTreat(4))
        return treat
    }
}

val trick = {
    println("No treats!")
}

val treat: () -> Unit = {
    println("Have a treat!")
}