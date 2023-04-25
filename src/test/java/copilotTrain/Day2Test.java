package copilotTrain;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Day2Test {
    public static Day2 d2 = new Day2();

    @Test
    //test with argument 12.00, 20, 8
    //test with argument 15.50, 15, 10
    //test with argument 100, 15, 8
    void calculatePrice() {
        double total = d2.calculatePrice(100, 15, 8);
        assertEquals(123, total);

        total = d2.calculatePrice(12.00, 20, 8);
        assertEquals(15, total);

        total = d2.calculatePrice(15.50, 15, 10);
        assertEquals(20, total);

    }
}