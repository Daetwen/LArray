package edu.epam.array.parser;

import edu.epam.array.entity.CustomArray;
import edu.epam.array.exception.InfoException;
import org.testng.annotations.*;
import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class CustomArrayParserTest {
    private final CustomArrayParser customArrayParser = new CustomArrayParser();
    private List<String> testList1;
    private List<String> testList2;
    private List<String> testList3;

    @BeforeClass(groups = { "fileTestGroup" })
    public void setUp() {
        testList1 = new ArrayList<>();
        testList1.add("4 2 3 45 5 6 7 8 9 8");
        testList1.add("ewwe");
        testList1.add("3 4 5 6 7");

        testList2 = new ArrayList<>();
        testList2.add("4 2 3oi 45 5 6 7op 8 9 8");
        testList2.add("ewwe");
        testList2.add("3 4 5 6opi 7");

        testList3 = new ArrayList<>();
        testList3.add("45 5uio 6 7 8op 9 8");
        testList3.add("ewwe");
        testList3.add("1 34 25 6 7");
        testList3.add("30 4 56 6 7");
    }

    @Test(groups = { "fileTestGroup" })
    public void parseListToCustomArrayPositiveTest1() throws InfoException {
        int[] expected = new CustomArray(4, 2, 3, 45, 5, 6, 7, 8, 9, 8).getCustomArray();
        int[] actual = customArrayParser.parseListToCustomArray(testList1).getCustomArray();
        assertEquals(actual,expected);
    }

    @Test(groups = { "fileTestGroup" })
    public void parseListToCustomArrayPositiveTest2() throws InfoException {
        int[] expected = new CustomArray(1, 34, 25, 6, 7).getCustomArray();
        int[] actual = customArrayParser.parseListToCustomArray(testList3).getCustomArray();
        assertEquals(actual,expected);
    }

    @Test(groups = { "fileTestGroup" })
    public void parseListToCustomArrayNegativeTest1() throws InfoException {
        int[] expected = new CustomArray().getCustomArray();
        int[] actual = customArrayParser.parseListToCustomArray(testList2).getCustomArray();
        assertEquals(actual,expected);
    }

    @Test(groups = { "fileTestGroup" })
    public void parseListToCustomArrayNegativeTest2() {
        assertThrows(InfoException.class, () -> customArrayParser.parseListToCustomArray(null));
    }
}
