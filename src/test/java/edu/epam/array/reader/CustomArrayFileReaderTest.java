package edu.epam.array.reader;

import org.testng.annotations.*;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

public class CustomArrayFileReaderTest {
    private final CustomArrayFileReader customArrayFileReader = new CustomArrayFileReader();
    private List<String> infoList;
    private static String FILE_PATH_1 = "src/test/resources/info.txt";
    private static String FILE_PATH_2 = "src/test/resources/info2.txt";
    private static String FILE_PATH_3 = "src/test/resources/info3.txt";

    @BeforeClass(groups = { "fileTestGroup" })
    public void setUp() {
        infoList = new ArrayList<>();
        infoList.add("4 2 3 45 5 6 7 8 9 8");
        infoList.add("ewwe");
        infoList.add("3 4 5 6 7");
    }

    @Test(groups = { "fileTestGroup" })
    public void readArrayPositiveTest1() {
        List<String> expected = infoList;
        List<String> actual = customArrayFileReader.readArray(FILE_PATH_1);
        assertEquals(actual, expected);
    }

    @Test(groups = { "fileTestGroup" })
    public void readArrayPositiveTest2() {
        List<String> expected = new ArrayList<>();
        List<String> actual = customArrayFileReader.readArray(FILE_PATH_3);
        assertEquals(actual, expected);
    }

    @Test(groups = { "fileTestGroup" })
    public void readArrayNegativeTest() {
        List<String> expected = infoList;
        List<String> actual = customArrayFileReader.readArray(FILE_PATH_2);
        assertNotEquals(actual, expected);
    }
}
