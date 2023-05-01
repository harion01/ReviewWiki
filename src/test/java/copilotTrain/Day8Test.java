package copilotTrain;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class Day8Test {
    public static Day8 d8 = new Day8();
    public static DataReader reader = new DataReader("Day8TestData.txt");

    @Test
    public void TestMain() {
        List<String> inputArr = reader.getInputArr();
        String result = d8.run(inputArr);
        String expected = "sam=99912222\n" +
                "Not found\n" +
                "harry=12299933\n";
        assertEquals(expected, result);

    }

}