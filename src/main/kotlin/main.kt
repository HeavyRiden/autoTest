
fun main() {

}

fun cardFee(card: String) = when(card) {
    "Mastercard", "Maestro" -> 0.006
    "Visa", "Мир" -> 0.0075
    else -> 0.0
}