import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class ArrayEqualityTest {

    @Test
    public void testSingleDimensionalArrayEquality() {
        int[] a1 = { 2, 3, 5, 7 };
        int[] a2 = { 2, 3, 5, 7 };
        assertArrayEquals("Should be equal", a1, a2);
    }

    @Test
    public void testSingleDimensionalArrayInequality() {
        int[] a1 = {2, 3, 5, 7};
        int[] a2 = {2, 3, 5, 8};
        assertArrayEquals("Should not be equal", a1, a2);
    }

    @Test
    public void testMultiDimensionalArrayEquality() {
        int[][] a11 = { { 2, 3 }, { 5, 7 }, { 11, 13 } };
        int[][] a12 = { { 2, 3 }, { 5, 7 }, { 11, 13 } };
        assertArrayEquals("Should be equal", a11, a12);
    }

    @Test
    public void testMultiDimensionalArrayInequality() {
        int[][] a11 = {{2, 3}, {5, 7}, {11, 13}};
        int[][] a12 = {{2, 3}, {5, 8}, {11, 13}};
        assertArrayEquals("Should not be equal", a11, a12);
    }

    @Test
    public void testStringArrayEquality() {
        String[] s1 = { "apple", "banana", "cherry" };
        String[] s2 = { "apple", "banana", "cherry" };
        assertArrayEquals("Should be equal", s1, s2);
    }

    @Test
    public void testDoubleArrayEquality() {
        double[] d1 = { 1.1, 2.2, 3.3 };
        double[] d2 = { 1.1, 2.2, 3.3 };
        assertArrayEquals("Should be equal", d1, d2, 0.001);
    }

    @Test
    public void testDoubleArrayInequality() {
        double[] a1 = {1.1, 2.2, 3.3};
        double[] a2 = {1.1, 2.2, 3.4};
        assertArrayEquals("Should not be equal", a1, a2, 0.001);
    }
}
