import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class KataTest() {

    @Test
    fun testShallPass(): Unit
    {
        assertEquals(1, 1)
    }

    @Test
    fun testHandleReturnTrue(): Unit
    {
        val kata = Kata()
        assertEquals(true, kata.exec())
    }

}