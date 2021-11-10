import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class FrogJmpTest {
    @Test
    void testSolutionSolution() {
        assertEquals(0, (new FrogJmp.Solution()).solution(1, 1, 1));
        assertEquals(1, (new FrogJmp.Solution()).solution(0, 1, 1));
        assertEquals(-2, (new FrogJmp.Solution()).solution(3, 1, 1));
        assertEquals(2, (new FrogJmp.Solution()).solution(-1, 1, 1));
        assertThrows(ArithmeticException.class, () -> (new FrogJmp.Solution()).solution(1, 1, 0));
        assertEquals(1, (new FrogJmp.Solution()).solution(0, 1, 3));
    }
}

