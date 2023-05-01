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
        List<String> outputArr = reader.getOutputArr();
        String expected = "";
        for(String output : outputArr){
            expected = expected + output + "\n";
        }

        String result = d8.run(inputArr);

        assertEquals(expected, result);

    }

}