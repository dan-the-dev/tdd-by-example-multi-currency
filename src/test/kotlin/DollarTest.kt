import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class DollarTest() {

    @Test
    fun testDollarMultiplication()
    {
        val five = Dollar(5)
        assertTrue(Dollar(10).equals(five.times(2)))
        assertTrue(Dollar(15).equals(five.times(3)))
    }

    @Test
    fun testEquality()
    {
        assertTrue(Dollar(5).equals(Dollar(5)))
        assertFalse(Dollar(5).equals(Dollar(6)))
    }
    @Test
    fun testFrancMultiplication()
    {
        val five = Franc(5)
        assertTrue(Franc(10).equals(five.times(2)))
        assertTrue(Franc(15).equals(five.times(3)))
    }

}