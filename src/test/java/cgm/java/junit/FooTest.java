package cgm.java.junit;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FooTest {
    @Test
    void testGetBar() {
        Foo foo = new Foo();
        String result = foo.getBar();
        assertEquals("FooBar", result);
    }
}
