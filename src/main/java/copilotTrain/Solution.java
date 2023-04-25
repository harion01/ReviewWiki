package copilotTrain;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        Integer intVal = 0;
        Double doubleVal = 0.0;
        String strVal = "";

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        while(scan.hasNextLine()){
            String line = scan.nextLine();

            try{
                intVal = Integer.parseInt(line);
                if(intVal != null){
                    System.out.println(i+intVal);
                    continue;
                }
            }catch (Exception e) {
                e.printStackTrace();
            }

            try{
                doubleVal = Double.parseDouble(line);
                if(doubleVal != null){
                    System.out.println(d+doubleVal);
                    continue;
                }
            }catch (Exception e) {
                e.printStackTrace();
            }

            strVal = line;
            if(strVal != null){
                System.out.println(s+strVal);
                continue;
            }
        }

        /* Print the sum of both integer variables on a new line. */

        /* Print the sum of the double variables on a new line. */
		
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */

        scan.close();
    }

    //make integer parsing method from given string with regex pattern
    //if there is no integer in the string, return null
    public static Integer parseInt(String str){
        Integer intVal = null;
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(str);
        if(matcher.find()){
            intVal = Integer.parseInt(matcher.group());
        }
        return intVal;
    }

    //make double parsing method from given string with regex pattern
    //if there is no double in the string, return null
    public static Double parseDouble(String str){
        Double doubleVal = null;
        Pattern pattern = Pattern.compile("\\d+\\.\\d+");
        Matcher matcher = pattern.matcher(str);
        if(matcher.find()){
            doubleVal = Double.parseDouble(matcher.group());
        }
        return doubleVal;
    }

}