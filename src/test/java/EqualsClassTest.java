import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EqualsClassTest {

    String s;

    /**
     * Set up Phase
     */
    @BeforeEach
    void setUp() {
        s = "a";
    }

    /**
     * Tear Down Phase
     */
    @AfterEach
    void tearDown() {
        s = null;
    }

    /**
     * Exercise Phase
     */
    @Test
    public void testEqualsTrue(){
        assertTrue(s.equals("a"));
    }

    @Test
    public void testEqualsFalse(){
        assertFalse(s.equals("b"));
    }

    @Test
    public void testEqualsNumber(){
        assertFalse(s.equals(2));
    }

    @Test
    public void testEqualsLength(){
        assertFalse(s.equals("aa"));
    }
}