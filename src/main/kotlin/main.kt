fun main() {
    print(transferFee("Мир", 75_000, 1_000))
}

fun cardFee(card: String) = when (card) { // Возвращает процент комисси по текущей карте
    "Mastercard" -> 0.006
    "Visa" -> 0.0075
    else -> 0.0
}

fun masterFee(currentSum: Int, monthSum: Int): Int {
    return if (monthSum + currentSum in 301..74999)
        0
    else (currentSum * cardFee("Mastercard")).toInt() + 20
}

fun visaFee(currentSum: Int): Int { // Возвращает сумму комиссии для карты Visa и Мир
    return if (currentSum * cardFee("Visa") > 35)
        (currentSum * cardFee("Visa")).toInt()
    else 35
}

fun transferFee(card: String, currentSum: Int, monthSum: Int): String { /* Проверяет месячный и дневной
                                                                                лимиты и блокирует операцию
                                                                                либо возвращает сумму комиссии */

    if (card == "VK Pay" && (currentSum > 15_000 || currentSum + monthSum > 45_000)) {
        return "Операция заблокирована, комиссия = 0"
    } else if (currentSum > 150_000 || currentSum + monthSum > 600_000) {
        return "Операция заблокирована, комиссия = 0"
    }

    return when (card) {
        "Visa", "Мир" -> "Комиссия по операции составит: " + visaFee(currentSum)
        "Mastercard", "Maestro" -> "Комиссия по операции составит: " + masterFee(currentSum, monthSum)
        else -> "Комиссия по операции составит: 0"
    }
}