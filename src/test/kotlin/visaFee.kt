import org.junit.Test

import org.junit.Assert.*

class visaFee {

    @Test
    fun visaFeeMinimal() {
        val result = visaFee(200)
        assertEquals(35, result)
    }

    @Test
    fun visaFee() {
        val result = visaFee(20_000)
        assertEquals(15, result)
    }

}