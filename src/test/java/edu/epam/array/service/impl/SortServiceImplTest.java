package edu.epam.array.service.impl;

import edu.epam.array.entity.LArray;
import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

public class SortServiceImplTest {
    private final SortServiceImpl sortServiceImpl = new SortServiceImpl();
    private LArray lArrayTest1;
    private LArray lArrayTest2;
    private LArray lArrayTest3;
    private LArray lArrayTest4;

    @BeforeClass
    public void setUp() {
        lArrayTest1 = new LArray(1, 24, 31, 4, 55, 6, 70, 8, 9, 54);
        lArrayTest2 = new LArray(1, 4, 6, 8, 9, 24, 31, 54, 55, 70);
        lArrayTest3 = new LArray(123, 23, 1, 12, 78, 4, 2);
        lArrayTest4 = new LArray(1, 2, 4, 12, 23, 78, 123);
    }

    @Test(description = "sort lArrayTest1")
    public void sortBubblePositiveTest1() {
        int[] expected = lArrayTest2.getLArray();
        int[] actual = sortServiceImpl.sortBubble(lArrayTest1);
        assertEquals(actual,expected);
    }

    @Test(description = "sort lArrayTest1")
    public void sortBubbleNegativeTest1() {
        int[] expected = lArrayTest3.getLArray();
        int[] actual = sortServiceImpl.sortBubble(lArrayTest1);
        assertNotEquals(actual,expected);
    }

    @Test(description = "sort lArrayTest3")
    public void sortBubblePositiveTest2() {
        int[] expected = lArrayTest4.getLArray();
        int[] actual = sortServiceImpl.sortBubble(lArrayTest3);
        assertEquals(actual,expected);
    }

    @Test(description = "sort lArrayTest3")
    public void sortBubbleNegativeTest2() {
        int[] expected = lArrayTest2.getLArray();
        int[] actual = sortServiceImpl.sortBubble(lArrayTest3);
        assertNotEquals(actual,expected);
    }

    @Test(description = "sort lArrayTest1")
    public void sortShekerPositiveTest1() {
        int[] expected = lArrayTest2.getLArray();
        int[] actual = sortServiceImpl.sortBubble(lArrayTest1);
        assertEquals(actual,expected);
    }

    @Test(description = "sort lArrayTest1")
    public void sortShekerNegativeTest1() {
        int[] expected = lArrayTest3.getLArray();
        int[] actual = sortServiceImpl.sortBubble(lArrayTest1);
        assertNotEquals(actual,expected);
    }

    @Test(description = "sort lArrayTest3")
    public void sortShekerPositiveTest2() {
        int[] expected = lArrayTest4.getLArray();
        int[] actual = sortServiceImpl.sortBubble(lArrayTest3);
        assertEquals(actual,expected);
    }

    @Test(description = "sort lArrayTest3")
    public void sortShekerNegativeTest2() {
        int[] expected = lArrayTest2.getLArray();
        int[] actual = sortServiceImpl.sortBubble(lArrayTest3);
        assertNotEquals(actual,expected);
    }

    @Test(description = "sort lArrayTest1")
    public void sortShellPositiveTest1() {
        int[] expected = lArrayTest2.getLArray();
        int[] actual = sortServiceImpl.sortBubble(lArrayTest1);
        assertEquals(actual,expected);
    }

    @Test(description = "sort lArrayTest1")
    public void sortShellNegativeTest1() {
        int[] expected = lArrayTest3.getLArray();
        int[] actual = sortServiceImpl.sortBubble(lArrayTest1);
        assertNotEquals(actual,expected);
    }

    @Test(description = "sort lArrayTest3")
    public void sortShellPositiveTest2() {
        int[] expected = lArrayTest4.getLArray();
        int[] actual = sortServiceImpl.sortBubble(lArrayTest3);
        assertEquals(actual,expected);
    }

    @Test(description = "sort lArrayTest3")
    public void sortShellNegativeTest2() {
        int[] expected = lArrayTest2.getLArray();
        int[] actual = sortServiceImpl.sortBubble(lArrayTest3);
        assertNotEquals(actual,expected);
    }
}
