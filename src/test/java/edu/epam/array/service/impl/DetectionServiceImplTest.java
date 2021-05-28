package edu.epam.array.service.impl;

import edu.epam.array.entity.LArray;
import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

public class DetectionServiceImplTest {
    private final DetectionServiceImpl detectionServiceImpl = new DetectionServiceImpl();
    private LArray lArray;
    private LArray lArray2;

    @BeforeClass
    public void setUp() {
        lArray = new LArray(1, 2, 3, 4, 55, 6, 7, 8, 9, 5);
        lArray2 = new LArray(-1, 2, -3, 4, -55, 6, 7, -8, 9, 5);
    }

    @Test
    public void detectionMeanValuePositiveTest() {
        double expected = 10;
        double actual = detectionServiceImpl.detectionMeanValue(lArray);
        assertEquals(actual,expected);
    }

    @Test
    public void detectionMeanValueNegativeTest() {
        double expected = 11;
        double actual = detectionServiceImpl.detectionMeanValue(lArray);
        assertNotEquals(actual,expected);
    }

    @Test
    public void detectionSumPositiveTest() {
        int expected = 100;
        int actual = detectionServiceImpl.detectionSum(lArray);
        assertEquals(actual,expected);
    }

    @Test
    public void detectionSumNegativeTest() {
        int expected = 101;
        int actual = detectionServiceImpl.detectionSum(lArray);
        assertNotEquals(actual,expected);
    }

    @Test
    public void detectionPositiveElementsPositiveTest() {
        int expected = 10;
        int actual = detectionServiceImpl.detectionPositiveElements(lArray);
        assertEquals(actual,expected);
    }

    @Test
    public void detectionPositiveElementsNegativeTest() {
        int expected = 11;
        int actual = detectionServiceImpl.detectionPositiveElements(lArray);
        assertNotEquals(actual,expected);
    }

    @Test
    public void detectionNegativeElementsPositiveTest() {
        int expected = 4;
        int actual = detectionServiceImpl.detectionNegativeElements(lArray2);
        assertEquals(actual,expected);
    }

    @Test
    public void detectionNegativeElementsNegativeTest() {
        int expected = 5;
        int actual = detectionServiceImpl.detectionNegativeElements(lArray2);
        assertNotEquals(actual,expected);
    }
}
