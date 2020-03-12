package taudemo1;

import org.junit.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;

@TestInstance(PER_CLASS)
public class WithAssertionsTest {
    @Test
    public void firstAssertion(){
        assertEquals(3,3);
    }

    @Test
    public void secondAssertion(){
        assertEquals(45,45);
    }

}
