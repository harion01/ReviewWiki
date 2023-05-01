package copilotTrain;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {
    public static Person p = new Person(1);

    //make test for scenario
    //initial age = 1;
    //yearPasses() 20 times
    //call amIOld() every time when you call yearPasses()
    //make assertion for amIOld() result
    @Test
    public void amIOld() {
        for(int i = 0; i < 20; i++) {
            p.yearPasses();
            p.amIOld();
        }
    }

    //make test for scenario
    //initial age = -1;
    //yearPasses() 10 times
    //call amIOld() and check result
    //yearPasses() 5 times
    //call amIOld() and check result
    //yearPasses() 5 times
    //call amIOld() and check result
    @Test
    public void amIOld5Times(){
        Person p = new Person(-1);
        String result = "";
        for(int i = 0; i < 10; i++) {
            p.yearPasses();
            result = p.amIOld();
        }
        assertEquals("You are young.", result);

        for(int i = 0; i < 5; i++) {
            p.yearPasses();
            result = p.amIOld();
        }
        assertEquals("You are a teenager.", result);

        for(int i = 0; i < 5; i++) {
            p.yearPasses();
            result = p.amIOld();
        }
        assertEquals("You are old.", result);

    }

}