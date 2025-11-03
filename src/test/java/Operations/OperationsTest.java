package Operations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperationsTest {

    @Test
    void sum() {
        assertEquals(10, Operations.Sum(5, 5));
    }

    @Test
    void sub() {
        assertEquals(10.00, Operations.Sub(20, 10));
    }
}