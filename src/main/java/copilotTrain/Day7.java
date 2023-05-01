package copilotTrain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Day7 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        String reverse = makeReverseStr(arr);
        System.out.println(reverse);

        bufferedReader.close();
    }

    //make one line string with given array
    //the string is single space saperated with reverse order of given array
    public static String makeReverseStr(List<Integer> origin) {
        String reverse = "";
        for(int i = origin.size() - 1; i >= 0; i--) {
            reverse += origin.get(i) + " ";
        }
        return reverse;
    }


}
