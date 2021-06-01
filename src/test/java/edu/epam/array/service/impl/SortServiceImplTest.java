package edu.epam.array.service.impl;

import edu.epam.array.entity.CustomArray;
import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

public class SortServiceImplTest {
    private final SortServiceImpl sortServiceImpl = new SortServiceImpl();
    private CustomArray customArrayTest1;
    private CustomArray customArrayTest2;
    private CustomArray customArrayTest3;
    private CustomArray customArrayTest4;
    private CustomArray customArrayTest5;

    @BeforeClass(groups = { "IntStreamTests" })
    public void setUp() {
        customArrayTest1 = new CustomArray(1, 24, 31, 4, 55, 6, 70, 8, 9, 54);
        customArrayTest2 = new CustomArray(1, 4, 6, 8, 9, 24, 31, 54, 55, 70);
        customArrayTest3 = new CustomArray(123, 23, 1, 12, 78, 4, 2);
        customArrayTest4 = new CustomArray(1, 2, 4, 12, 23, 78, 123);
        customArrayTest5 = new CustomArray();
    }

    @Test(description = "sort lArrayTest1")
    public void sortBubblePositiveTest1() {
        int[] expected = customArrayTest2.getCustomArray();
        int[] actual = sortServiceImpl.sortBubble(customArrayTest1);
        assertEquals(actual, expected);
    }

    @Test(description = "sort lArrayTest3")
    public void sortBubblePositiveTest2() {
        int[] expected = customArrayTest4.getCustomArray();
        int[] actual = sortServiceImpl.sortBubble(customArrayTest3);
        assertEquals(actual, expected);
    }

    @Test(description = "sort lArrayTest1")
    public void sortBubbleNegativeTest1() {
        int[] expected = customArrayTest3.getCustomArray();
        int[] actual = sortServiceImpl.sortBubble(customArrayTest1);
        assertNotEquals(actual, expected);
    }

    @Test(description = "sort lArrayTest3")
    public void sortBubbleNegativeTest2() {
        int[] expected = customArrayTest2.getCustomArray();
        int[] actual = sortServiceImpl.sortBubble(customArrayTest3);
        assertNotEquals(actual, expected);
    }

    @Test(description = "sort lArrayTest5")
    public void sortBubbleNegativeTest3() {
        int[] expected = customArrayTest5.getCustomArray();
        int[] actual = sortServiceImpl.sortBubble(customArrayTest5);
        assertEquals(actual, expected);
    }

    @Test(description = "sort lArrayTest1")
    public void sortShekerPositiveTest1() {
        int[] expected = customArrayTest2.getCustomArray();
        int[] actual = sortServiceImpl.sortSheker(customArrayTest1);
        assertEquals(actual, expected);
    }

    @Test(description = "sort lArrayTest3")
    public void sortShekerPositiveTest2() {
        int[] expected = customArrayTest4.getCustomArray();
        int[] actual = sortServiceImpl.sortSheker(customArrayTest3);
        assertEquals(actual, expected);
    }

    @Test(description = "sort lArrayTest1")
    public void sortShekerNegativeTest1() {
        int[] expected = customArrayTest3.getCustomArray();
        int[] actual = sortServiceImpl.sortSheker(customArrayTest1);
        assertNotEquals(actual, expected);
    }

    @Test(description = "sort lArrayTest3")
    public void sortShekerNegativeTest2() {
        int[] expected = customArrayTest2.getCustomArray();
        int[] actual = sortServiceImpl.sortSheker(customArrayTest3);
        assertNotEquals(actual, expected);
    }

    @Test(description = "sort lArrayTest5")
    public void sortShekerNegativeTest3() {
        int[] expected = customArrayTest5.getCustomArray();
        int[] actual = sortServiceImpl.sortSheker(customArrayTest5);
        assertEquals(actual, expected);
    }

    @Test(description = "sort lArrayTest1")
    public void sortShellPositiveTest1() {
        int[] expected = customArrayTest2.getCustomArray();
        int[] actual = sortServiceImpl.sortShell(customArrayTest1);
        assertEquals(actual, expected);
    }

    @Test(description = "sort lArrayTest3")
    public void sortShellPositiveTest2() {
        int[] expected = customArrayTest4.getCustomArray();
        int[] actual = sortServiceImpl.sortShell(customArrayTest3);
        assertEquals(actual, expected);
    }

    @Test(description = "sort lArrayTest1")
    public void sortShellNegativeTest1() {
        int[] expected = customArrayTest3.getCustomArray();
        int[] actual = sortServiceImpl.sortShell(customArrayTest1);
        assertNotEquals(actual, expected);
    }

    @Test(description = "sort lArrayTest3")
    public void sortShellNegativeTest2() {
        int[] expected = customArrayTest2.getCustomArray();
        int[] actual = sortServiceImpl.sortShell(customArrayTest3);
        assertNotEquals(actual, expected);
    }

    @Test(description = "sort lArrayTest5")
    public void sortShellNegativeTest3() {
        int[] expected = customArrayTest5.getCustomArray();
        int[] actual = sortServiceImpl.sortShell(customArrayTest5);
        assertEquals(actual, expected);
    }

    @Test(groups = { "IntStreamTests" })
    public void sortIntStreamPositiveTest1() {
        int[] expected = customArrayTest2.getCustomArray();
        int[] actual = sortServiceImpl.sortIntStream(customArrayTest1);
        assertEquals(actual, expected);
    }

    @Test(groups = { "IntStreamTests" })
    public void sortIntStreamPositiveTest2() {
        int[] expected = customArrayTest4.getCustomArray();
        int[] actual = sortServiceImpl.sortIntStream(customArrayTest3);
        assertEquals(actual, expected);
    }

    @Test(groups = { "IntStreamTests" })
    public void sortIntStreamNegativeTest1() {
        int[] expected = customArrayTest5.getCustomArray();
        int[] actual = sortServiceImpl.sortIntStream(customArrayTest5);
        assertEquals(actual, expected);
    }
}
