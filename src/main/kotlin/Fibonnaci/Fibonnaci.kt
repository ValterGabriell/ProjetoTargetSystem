package Fibonnaci

class Fibonnaci {
    companion object {
        /**
         * @param x is the number that you wanna verify whether belongs Fibonnaci or not
         */
        fun questionOneFibonnaci(x: Long) {
            var a = 0
            var b = 1
            var c = 0

            while (x > c) {
                c = a + b
                a = b
                b = c
            }

            when (x) {
                0.toLong() -> {
                    println("O numero $x pertence à sequência")
                }
                c.toLong() -> {
                    println("O numero $x pertence à sequência, o próximo é: ${(a + x)} ")
                }
                else -> {
                    println("O numero $x não pertence à sequencia")
                }
            }

        }
    }
}