import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun cardFeeVisa() {
        val result = cardFee("Visa")

        assertEquals(0.0075, result, 0.00001)
    }

    @Test
    fun cardFeeMaster() {
        val result = cardFee("Mastercard")

        assertEquals(0.006, result, 0.00001)
    }

    @Test
    fun cardFeeElse() {
        val result = cardFee("")

        assertEquals(0.0, result, 0.00001)
    }

    @Test
    fun cardFeeVK() {
        val result = cardFee("VK Pay")

        assertEquals(0.0, result, 0.00001)
    }
}