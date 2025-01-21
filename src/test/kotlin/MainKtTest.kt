import org.junit.Test

import org.junit.Assert.*
 class MainKtTest {

@Test
 fun cardFeeVisa() {

  val result = cardFee("Visa")

 assertEquals(0.0075, result, 0.00001)
 }

  @Test
  fun cardFeeMaestro() {

   val result = cardFee("Maestro")

   assertEquals(0.006, result, 0.00001)
  }
  @Test
  fun cardFeeElse() {

   val result = cardFee("")

   assertEquals(0.0, result, 0.00001)
  }
}