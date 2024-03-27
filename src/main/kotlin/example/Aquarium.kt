package example

/**
 * 创建一个类
 */
class Aquarium(length: Int = 100, width: Int = 20, height: Int = 40) {

        // Dimensions in cm
        var length: Int = length
        var width: Int = width
        var height: Int = height

        val volume: Int
                get() = width * height * length / 1000  // 1000 cm^3 = 1 l




        constructor(numberOfFish: Int) : this() {
                // 2,000 cm^3 per fish + extra room so water doesn't spill
                val tank = numberOfFish * 2000 * 1.1
                // calculate the height needed
                height = (tank / (length * width)).toInt()
        }

        init {
                println("aquarium initializing")
        }
        init {
                // 1 liter = 1000 cm^3
                println("Volume: ${width * length * height / 1000} l")
        }



        fun printSize() {
                println("Width: $width cm " +
                        "Length: $length cm " +
                        "Height: $height cm ")
        }
}


