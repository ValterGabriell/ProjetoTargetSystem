package InvercaoDeString

class ReverseString {
    companion object {
        fun reverse(str: String) {
            val charArray: CharArray = str.toCharArray()

            var a = 0
            var x = str.length - 1
            while (a < x)
            {
                val c = charArray[a]
                charArray[a] = charArray[x]
                charArray[x] = c
                a++; x--;
            }

            print(String(charArray))
        }
    }
}