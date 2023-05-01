package copilotTrain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        String ret = checkInteger(N);
        System.out.println(ret);

        bufferedReader.close();
    }


    //        If  is odd, print Weird
//        If  is even and in the inclusive range of 2 to 5, print Not Weird
//        If  is even and in the inclusive range of 6 to 20, print Weird
//        If  is even and greater 20 than , print Not Weird
    public static String checkInteger(int N) {
        String checkResult = "";
        //set isEven checking if N%2 == 0
        boolean isEven = N % 2 == 0;
        if(!isEven) {
            checkResult = "Weird";
        } else if(isEven && N >= 2 && N <= 5) {
            checkResult = "Not Weird";
        } else if(isEven && N >= 6 && N <= 20) {
            checkResult = "Weird";
        } else if(isEven && N > 20) {
            checkResult = "Not Weird";
        } else {
            checkResult = "Weird";
        }
        return checkResult;
    }
}
