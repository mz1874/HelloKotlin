
fun Sum(A:Int, B: Int): Int {
    return A+B;
}

fun printMessageWithPrefix(message: String, prefix: String) {
    println("[$prefix] $message")
}

fun sayHello(str:String ="hello")
{
    println("$str")
}


fun describeString(maybeString: String?): String {
    if (maybeString != null && maybeString.length > 0) {
        return "String of length ${maybeString.length}"
    } else {
        return "Empty or null string"
    }
}

@OptIn(ExperimentalStdlibApi::class)
private fun extracted() {
    //1000 0000
    //+- 2^7 128 +=127
    //u8 2^8 256
    //16 bit

    val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
    // Add "pentagon" to the list
    shapes.add("pentagon")
    println(shapes)
    // [triangle, square, circle, pentagon]

    // Remove the first "pentagon" from the list
    shapes.remove("pentagon")
    shapes.remove("pentagon")
    println(shapes)
    // [triangle, square, circle]

    val readOnlyFruit = setOf("apple", "banana", "cherry", "cherry")
    print("the length of set is ${readOnlyFruit.count()}")


    // Read-only map
    val readOnlyJuiceMenu = mutableMapOf("apple" to 999, "kiwi" to 190, "orange" to 100)
    println("The value of apple juice is: ${readOnlyJuiceMenu["sss"]}")

    if ("apple" in readOnlyJuiceMenu) {
        println(readOnlyJuiceMenu["apple"])
    }

    readOnlyJuiceMenu.put("apple", 333);

    if ("apple" in readOnlyJuiceMenu) {
        println(readOnlyJuiceMenu["apple"])
    }
// The value of apple juice is: 100


    val obj = "Hello"

    val result = when (obj) {
        // If obj equals "1", sets result to "one"
        "1" -> "One"
        // If obj equals "Hello", sets result to "Greeting"
        "Hello" -> "Greeting"
        // Sets result to "Unknown" if no previous condition is satisfied
        else -> "Unknown"
    }
    println(result)
// Greeting

    val temp = 18

    val description = when {
        // If temp < 0 is true, sets description to "very cold"
        temp < 0 -> "very cold"
        // If temp < 10 is true, sets description to "a bit cold"
        temp < 10 -> "a bit cold"
        // If temp < 20 is true, sets description to "warm"
        temp < 20 -> "warm"
        // Sets description to "hot" if no previous condition is satisfied
        else -> "hot"
    }
    println(description)
    // warm

    for (i in 1..4) {
        println(i)
    }

    for (i in 1..<5) {
        println(i)
    }

    for (i in 5 downTo 2) {
        println(i)
    }

    for (i in 1..10 step 2) {
        println(i)
    }

    for (i in 'z' downTo 'a' step 2) {
        println(i)
    }


    printMessageWithPrefix(prefix = "Log", message = "Hello")
    printMessageWithPrefix("a", "B");
    sayHello();
    sayHello("ss")
}


fun lengthString(maybeString: String?): Int? = maybeString?.length

//@OptIn(ExperimentalStdlibApi::class)
//fun main(args: Array<String>) {
//    class Contact(val id: Int, var email: String)
//    class Contact2() {
//        val category: String = ""
//    }
//    class Contact3(val id: Int, var email: String = "example@gmail.com") {
//        val category: String = "work"
//    }
//
//    var number = FollowControl();
//    number.test();
//
//    val dataClass = User(1);
//    dataClass.name = "HAA";
//    println(dataClass.toString())
//    println(dataClass.name)
//
//    println(dataClass.copy())
//    println(dataClass.copy(2))
//
//    var nullString: String? = null
//
//    println(lengthString(nullString))
//
//    //避免直接调用空
//    var nullAbleString : String? = null;
//    println(nullAbleString?.length?:0);
//}