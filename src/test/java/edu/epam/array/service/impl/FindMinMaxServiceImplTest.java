package edu.epam.array.service.impl;

import edu.epam.array.entity.LArray;
import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

public class FindMinMaxServiceImplTest {
    private final FindMinMaxServiceImpl findMinMaxServiceImpl = new FindMinMaxServiceImpl();
    private LArray lArray;
    private LArray lArray2;

    @BeforeMethod
    public void setUp() {
        lArray = new LArray(1, 2, 3, 4, 55, 6, 7, 8, 9, 5);
        lArray2 = new LArray(-1, 2, -3, 4, -55, 6, 7, -8, 9, 5);
    }

    @Test
    public void findMinElementPositiveTest() {
        int expected = 1;
        int actual = findMinMaxServiceImpl.findMinElement(lArray);
        assertEquals(actual,expected);
    }

    @Test
    public void findMinElementNegativeTest() {
        int expected = -8;
        int actual = findMinMaxServiceImpl.findMinElement(lArray2);
        assertNotEquals(actual,expected);
    }

    @Test
    public void findMaxElementPositiveTest() {
        int expected = 55;
        int actual = findMinMaxServiceImpl.findMaxElement(lArray);
        assertEquals(actual,expected);
    }

    @Test
    public void findMaxElementNegativeTest() {
        int expected = 7;
        int actual = findMinMaxServiceImpl.findMaxElement(lArray2);
        assertNotEquals(actual,expected);
    }
}
