import org.junit.Test

import org.junit.Assert.*

class masterFee {

    @Test
    fun masterFeeInLimits() {
        val result = masterFee(500, 500)

        assertEquals(0, result)
    }

    @Test
    fun masterFee() {
        val result = masterFee(200, 0)

        assertEquals(21, result)
    }

    @Test
    fun masterFeeOverLimit() {
        val result = masterFee(75_000, 1000)

        assertEquals(470, result)
    }


}