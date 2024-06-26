import java.util.*

/**
 * @author aiden
 * @data 20/03/2024
 * @description
 */
class StringTest {
    fun Test() {
        val Name: String = "Wang Chong";
        for (v in Name) {
            println(v)
        }/* String template*/
        println("${Name.toCharArray()}")

        println(Name.uppercase(Locale.getDefault()))
        println(Name + 1)

        val text = """
            Hello World
        """.trimIndent()

        println(text)
    }

    fun TestStringFormat() {
        // Formats an integer, adding leading zeroes to reach a length of seven characters
        val integerNumber = String.format("%07d", 31416)
        println(integerNumber)
// 0031416

// Formats a floating-point number to display with a + sign and four decimal places
        val floatNumber = String.format("%+.4f", 3.141592)
        println(floatNumber)
// +3.1416

// Formats two strings to uppercase, each taking one placeholder
        val helloString = String.format("%S %S", "hello", "world")
        println(helloString)
// HELLO WORLD

// Formats a negative number to be enclosed in parentheses, then repeats the same number in a different format (without parentheses) using `argument_index$`.
        val negativeNumberInParentheses = String.format("%(d means %1\$d", -31416)
        println(negativeNumberInParentheses)
//(31416) means -31416
    }
}