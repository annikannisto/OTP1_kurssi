import org.junit.*;

import static org.junit.Assert.*;

public class StringManipulatorAnniTest {

    private StringManipulatorAnni manipulator;

    @Before
    public void setUp() throws Exception {
        manipulator = new StringManipulatorAnni();
    }

    @After
    public void tearDown() throws Exception {
        manipulator = null;
    }

    @Test
    public void testReverse() {
        String input = "hello";
        String expected = "olleh";
        String actual = manipulator.reverse(input);
        assertEquals("The reverse method failed", expected, actual);
    }
}
