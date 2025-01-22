import org.junit.Test

import org.junit.Assert.*

class transferFeeTest {

    @Test
    fun transferFeeOne() {

        val result = transferFee("VK Pay", 10_000, 40_000)
        assertEquals("Операция заблокирована, превышен лимит по сумме операции", result)
    }

    @Test
    fun transferFeeTwo() {

        val result = transferFee("VK Pay", 16_000, 0)
        assertEquals("Операция заблокирована, превышен лимит по сумме операции", result)
    }

    @Test
    fun transferFeeThree() {

        val result = transferFee("VK Pay", 0, 46_000)
        assertEquals("Операция заблокирована, превышен лимит по сумме операции", result)
    }

    @Test
    fun transferFeeFour() {

        val result = transferFee("VK Pay", 15_000, 45_000)
        assertEquals("Операция заблокирована, превышен лимит по сумме операции", result)
    }

    @Test
    fun transferFeeFive() {

        val result = transferFee("VK Pay", 10_000, 0)
        assertEquals("Комиссия по операции составит: 0", result)
    }

    @Test
    fun transferFeeSix() {

        val result = transferFee("", 150_001, 0)
        assertEquals("Операция заблокирована, превышен лимит по сумме операции", result)
    }

    @Test
    fun transferFeeSeven() {

        val result = transferFee("", 150_001, 450_000)
        assertEquals("Операция заблокирована, превышен лимит по сумме операции", result)
    }

    @Test
    fun transferFeeEight() {

        val result = transferFee("", 0, 650_001)
        assertEquals("Операция заблокирована, превышен лимит по сумме операции", result)
    }

    @Test
    fun transferFeeNine() {

        val result = transferFee("Visa", 1000, 0)
        assertEquals("Комиссия по операции составит: 35", result)
    }

    @Test
    fun transferFeeTen() {

        val result = transferFee("Mastercard", 1000, 0)
        assertEquals("Комиссия по операции составит: 0", result)
    }


}