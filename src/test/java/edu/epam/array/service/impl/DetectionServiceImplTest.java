package edu.epam.array.service.impl;

import edu.epam.array.entity.CustomArray;
import edu.epam.array.exception.InfoException;
import org.testng.annotations.*;

import java.util.NoSuchElementException;

import static org.testng.Assert.*;

public class DetectionServiceImplTest {
    private final DetectionServiceImpl detectionServiceImpl = new DetectionServiceImpl();
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
    public void detectionMeanValuePositiveTest() throws InfoException {
        double expected = 10;
        double actual = detectionServiceImpl.detectionMeanValue(customArray);
        assertEquals(actual, expected);
    }

    @Test
    public void detectionMeanValueNegativeTest() {
        assertThrows(InfoException.class,
                () -> detectionServiceImpl.detectionMeanValue(customArray3));
    }

    @Test
    public void detectionSumPositiveTest() {
        int expected = 100;
        int actual = detectionServiceImpl.detectionSum(customArray);
        assertEquals(actual, expected);
    }

    @Test
    public void detectionSumNegativeTest() {
        int expected = 0;
        int actual = detectionServiceImpl.detectionSum(customArray3);
        assertEquals(actual, expected);
    }

    @Test
    public void detectionPositiveElementsPositiveTest() {
        int expected = 10;
        int actual = detectionServiceImpl.detectionPositiveElements(customArray);
        assertEquals(actual, expected);
    }

    @Test
    public void detectionPositiveElementsNegativeTest() {
        int expected = 11;
        int actual = detectionServiceImpl.detectionPositiveElements(customArray);
        assertNotEquals(actual, expected);
    }

    @Test
    public void detectionNegativeElementsPositiveTest() {
        int expected = 4;
        int actual = detectionServiceImpl.detectionNegativeElements(customArray2);
        assertEquals(actual, expected);
    }

    @Test
    public void detectionNegativeElementsNegativeTest() {
        int expected = 5;
        int actual = detectionServiceImpl.detectionNegativeElements(customArray2);
        assertNotEquals(actual, expected);
    }

    @Test(groups = { "IntStreamTests" })
    public void detectionMeanValueIntStreamPositiveTest1() {
        double expected = 10;
        double actual = detectionServiceImpl.detectionMeanValueIntStream(customArray).getAsDouble();
        assertEquals(actual, expected);
    }

    @Test(groups = { "IntStreamTests" })
    public void detectionMeanValueIntStreamPositiveTest2() {
        assertTrue(detectionServiceImpl.detectionMeanValueIntStream(customArray).isPresent());
    }

    @Test(groups = { "IntStreamTests" })
    public void detectionMeanValueIntStreamNegativeTest1() {
        double expected = 11;
        double actual = detectionServiceImpl.detectionMeanValueIntStream(customArray).getAsDouble();
        assertNotEquals(actual, expected);
    }

    @Test(groups = { "IntStreamTests" })
    public void detectionMeanValueIntStreamNegativeTest2() {
        CustomArray customArrayLocal = new CustomArray();
        assertThrows(NoSuchElementException.class,
                () -> detectionServiceImpl.detectionMeanValueIntStream(customArrayLocal).getAsDouble());
    }

    @Test(groups = { "IntStreamTests" })
    public void detectionSumIntStreamPositiveTest() {
        int expected = 100;
        int actual = detectionServiceImpl.detectionSumIntStream(customArray);
        assertEquals(actual, expected);
    }

    @Test(groups = { "IntStreamTests" })
    public void detectionSumIntStreamNegativeTest() {
        int expected = 101;
        int actual = detectionServiceImpl.detectionSumIntStream(customArray);
        assertNotEquals(actual, expected);
    }

    @Test(groups = { "IntStreamTests" })
    public void detectionPositiveElementsIntStreamPositiveTest() {
        long expected = 10;
        long actual = detectionServiceImpl.detectionPositiveElementsIntStream(customArray);
        assertEquals(actual, expected);
    }

    @Test(groups = { "IntStreamTests" })
    public void detectionPositiveElementsIntStreamNegativeTest() {
        CustomArray customArrayLocal = new CustomArray();
        long expected = 0;
        long actual = detectionServiceImpl.detectionPositiveElementsIntStream(customArrayLocal);
        assertEquals(actual, expected);
    }

    @Test(groups = { "IntStreamTests" })
    public void detectionNegativeElementsIntStreamPositiveTest() {
        long expected = 4;
        long actual = detectionServiceImpl.detectionNegativeElementsIntStream(customArray2);
        assertEquals(actual, expected);
    }

    @Test(groups = { "IntStreamTests" })
    public void detectionNegativeElementsIntStreamNegativeTest() {
        CustomArray customArrayLocal = new CustomArray();
        long expected = 0;
        long actual = detectionServiceImpl.detectionNegativeElementsIntStream(customArrayLocal);
        assertEquals(actual, expected);
    }
}
