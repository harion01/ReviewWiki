package copilotTrain;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class Day7Test {
    public static Day7 d7 = new Day7();

    @Test
    public void makeReverseStr() {
        List<Integer> origin = new ArrayList<>();
        origin.add(1);
        origin.add(3);
        origin.add(5);
        origin.add(7);
        origin.add(9);
        String result = d7.makeReverseStr(origin);
        assertEquals("9 7 5 3 1 ", result);
    }
}