fun main() {

    val treatFunction = trickOrTreat(false) {"$it quarters"}
    val trickFunction = trickOrTreat(true, null)
    
    // repeat function which works like for loop
    repeat(4) {
        treatFunction()
    }
    trickFunction()
}

fun trickOrTreat(isTrick: Boolean, extraTreat: ((Int) -> String)?): () -> Unit {
    if (isTrick) {
        return trick
    } else {
        if (extraTreat != null) {
            println(extraTreat(4))
        }
        return treat
    }
}

val trick = {
    println("No treats!")
}

val treat: () -> Unit = {
    println("Have a treat!")
}