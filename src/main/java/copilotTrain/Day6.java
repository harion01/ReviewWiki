package copilotTrain;

import java.util.Scanner;

public class Day6 {
    public static void main(String[] args) {
        //System.out.println("Hello World!");
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        String input = "";

        //The first line contains an integer, N (the number of test cases).
        //Each line i of the T subsequent lines contain a string, S.
//        String[] input = {"2", "Hacker", "Rank"};
//        int T = Integer.parseInt(input[0]);
        for(int i = 1; i <= T; i++) {
            input = scan.next();
            String[] result = splitString(input);
            System.out.println(result[0] + " " + result[1]);
        }
    }

    //loop for searching index
    //check index is even or odd
    //make string for even and odd char
    //return eventStr, oddStr pair
    public static String[] splitString(String S){
        String evenStr = "";
        String oddStr = "";
        for(int i = 0; i < S.length(); i++) {
            if(i % 2 == 0) {
                evenStr += S.charAt(i);
            } else {
                oddStr += S.charAt(i);
            }
        }
        String[] result = {evenStr, oddStr};
        return result;
    }
}
