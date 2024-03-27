class TestLambda {

    /**
     * @param 1: time <String>
     * @return lambda expression
     */
    fun toSeconds(time: String): (Int) -> Int = when (time) {
        "hour" -> { value -> value * 60 * 60 }
        "minute" -> { value -> value * 60 }
        "second" -> { value -> value }
        else -> { value -> value }
    }

    fun test()
    {
        println({ string: String -> string.uppercase() }("hello"))

        val upperCaseString = { string: String -> string.uppercase() }

        println(upperCaseString("shkskn"))

        val numbers = listOf(1,2,3,4,5,6)

        println(numbers.filter { x -> x >3 })
        println(numbers.filter { x -> x <3 })

        println(numbers.map { x->x*3 })

        val lambda: (String) -> Int = { string -> string.uppercase().toInt()}


        val timesInMinutes = listOf(2, 10, 15, 1)

        // GET THE LAMBDA EXPRESSION
        val min2sec = toSeconds("minute")

        
        val totalTimeInSeconds = timesInMinutes.map(min2sec).sum()
        println("Total time is $totalTimeInSeconds secs")
        // Total time is 1680 secs

        println({ string: String -> string.uppercase() }("hello"))

        println(listOf(1, 2, 3).fold(0, { x, item -> x + item })) // 6
    }
}