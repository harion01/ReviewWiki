package copilotTrain;

import org.junit.Test;

import static org.junit.Assert.*;

public class Day6Test {
    public static Day6 d6 = new Day6();

    @Test
    public void splitString() {
        String[] result = d6.splitString("Hacker");
        assertEquals("Hce", result[0]);
        assertEquals("akr", result[1]);
    }
}