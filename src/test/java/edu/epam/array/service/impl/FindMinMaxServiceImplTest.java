package edu.epam.array.service.impl;

import edu.epam.array.entity.CustomArray;
import java.util.NoSuchElementException;

import edu.epam.array.exception.InfoException;
import org.testng.annotations.*;
import static org.testng.Assert.*;

public class FindMinMaxServiceImplTest {
    private final FindMinMaxServiceImpl findMinMaxServiceImpl = new FindMinMaxServiceImpl();
    private CustomArray customArray;
    private CustomArray customArray2;
    private CustomArray customArray3;

    @BeforeClass(groups = { "IntStreamTests" })
    public void setUp() {
        customArray = new CustomArray(1, 2, 3, 4, 55, 6, 7, 8, 9, 5);
        customArray2 = new CustomArray(-1, 2, -3, 4, -55, 6, 7, -8, 9, 5);
        customArray3 = new CustomArray();
    }

    @Test
    public void findMinElementPositiveTest() throws InfoException {
        int expected = 1;
        int actual = findMinMaxServiceImpl.findMinElement(customArray);
        assertEquals(actual, expected);
    }

    @Test
    public void findMinElementNegativeTest() {
        assertThrows(InfoException.class,
                () -> findMinMaxServiceImpl.findMinElement(null));
    }

    @Test
    public void findMaxElementPositiveTest() throws InfoException {
        int expected = 55;
        int actual = findMinMaxServiceImpl.findMaxElement(customArray);
        assertEquals(actual, expected);
    }

    @Test
    public void findMaxElementNegativeTest() throws InfoException {
        assertThrows(InfoException.class,
                () -> findMinMaxServiceImpl.findMinElement(customArray3));
    }

    @Test(groups = { "IntStreamTests" })
    public void findMinElementIntStreamPositiveTest() throws InfoException {
        int expected = 1;
        int actual = findMinMaxServiceImpl.findMinElementIntStream(customArray).getAsInt();
        assertEquals(actual, expected);
    }

    @Test(groups = { "IntStreamTests" })
    public void findMinElementIntStreamNegativeTest() throws InfoException {
        CustomArray customArrayLocal = new CustomArray();
        assertThrows(NoSuchElementException.class,
                () -> findMinMaxServiceImpl.findMinElementIntStream(customArrayLocal).getAsInt());
    }

    @Test(groups = { "IntStreamTests" })
    public void findMaxElementIntStreamPositiveTest() throws InfoException {
        int expected = 55;
        int actual = findMinMaxServiceImpl.findMaxElementIntStream(customArray).getAsInt();
        assertEquals(actual, expected);
    }

    @Test(groups = { "IntStreamTests" })
    public void findMaxElementIntStreamNegativeTest() throws InfoException {
        CustomArray customArrayLocal = new CustomArray();
        assertThrows(NoSuchElementException.class,
                () -> findMinMaxServiceImpl.findMaxElementIntStream(customArrayLocal).getAsInt());
    }
}
