internal object FooBarQix {

    private const val FOO = "Foo"
    private const val BAR = "Bar"
    private const val QIX = "Qix"
    private val divisors = listOf(Pair(3, FOO), Pair(5, BAR), Pair(7, QIX))
    //Int.toChar returns empty for some reasons
    private val divisorsChar = listOf(Pair('3', FOO), Pair('5', BAR), Pair('7', QIX))

    fun compute(number: Int): String {
        return divideAppender(number) + containsAppender(number)
    }

    private fun containsAppender(number: Int): String {
        val s = number.toString()
        return divisorsChar.fold("") { acc, pair ->  acc + s.appendForEachOccurrence(pair)}
    }


    private fun String.appendForEachOccurrence(pair : Pair<Char, String>): String {
        return pair.second.repeat(this.charOccurrence(pair.first))
    }

    private fun divideAppender(number: Int): String {
        return  divisors
                    .filter { number.isDivisibleBy(it.first) }
                    .fold("") {acc, pair ->  acc + pair.second }
    }

    private fun String.charOccurrence(toBeCounted: Char): Int {
        return this.chars()
                .filter{ toBeCounted.toInt() == it }
                .count()
                .toInt()
    }

    private fun Int.isDivisibleBy(divider:Int):Boolean{ return this % divider == 0 }

}
