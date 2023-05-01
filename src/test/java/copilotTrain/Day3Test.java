package copilotTrain;

import org.junit.Test;

import static org.junit.Assert.*;

public class Day3Test {
    public static Day3 d3 = new Day3();

    @Test
    public void checkInteger() {
        String result = d3.checkInteger(3);
        assertEquals("Weird", result);

         result = d3.checkInteger(24);
        assertEquals("Not Weird", result);

         result = d3.checkInteger(2);
        assertEquals("Not Weird", result);

    }
}