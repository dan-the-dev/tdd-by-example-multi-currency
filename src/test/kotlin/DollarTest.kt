import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class DollarTest() {

    @Test
    fun testHandleReturnTrue(): Unit
    {
        val five = Dollar(5)
        five.times(2)
        assertEquals(10, five.amount)
    }

}