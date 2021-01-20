package DailyCoding;

import java.util.ArrayList;

public class MainRunner {

    public static void main (String[] args){
        Search search = new Search();
        ArrayList<Integer> source = new ArrayList<>();
        source.add(1);
        source.add(4);
        source.add(6);
        source.add(10);
        source.add(25);
        source.add(30);
        source.add(56);
        source.add(100);

        search.search(source, 5);

    }
}
