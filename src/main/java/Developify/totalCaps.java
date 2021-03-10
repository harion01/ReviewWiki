package Developify;

import java.util.ArrayList;
import java.util.HashSet;

public class totalCaps {
    public HashSet<Character> capitalSet;
    public static void main(String[] args){
        ArrayList<String> dataset = new ArrayList<>();
        //“AwesomE”, “ThIngs”, “hAppEning”, “HerE”
        dataset.add("AwesomE");
        dataset.add("ThIngs");
        dataset.add("hAppEning");
        dataset.add("HerE");

        /*
        //“Elie”, “Matt”, “Tim”
        dataset.add("Elie");
        dataset.add("Matt");
        dataset.add("Tim");
        */

        /*
        //“hello”, “world”
        dataset.add("hello");
        dataset.add("world");
        */

        totalCaps obj = new totalCaps();
        System.out.println(obj.findCapitals(dataset));
    }

    totalCaps(){
        capitalSet = new HashSet<>();
        capitalSet.add('A');
        capitalSet.add('B');
        capitalSet.add('C');
        capitalSet.add('D');
        capitalSet.add('E');
        capitalSet.add('F');
        capitalSet.add('G');
        capitalSet.add('H');
        capitalSet.add('I');
        capitalSet.add('J');
        capitalSet.add('K');
        capitalSet.add('L');
        capitalSet.add('M');
        capitalSet.add('N');
        capitalSet.add('O');
        capitalSet.add('P');
        capitalSet.add('Q');
        capitalSet.add('R');
        capitalSet.add('S');
        capitalSet.add('T');
        capitalSet.add('U');
        capitalSet.add('V');
        capitalSet.add('W');
        capitalSet.add('X');
        capitalSet.add('Y');
        capitalSet.add('Z');
    }


    public int findCapitals(ArrayList<String> dataSet){
        int total = 0;
        for(String oneWord : dataSet){
            total = total + countCapital(oneWord);
        }
        return total;
    }

    private int countCapital(String oneWord) {
        int count = 0;
        for(Character oneChar : oneWord.toCharArray()){
            if(isCapital(oneChar)){
                count++;
            }
        }
        return count;
    }

    private boolean isCapital(Character oneChar) {
        //return capitalSet.contains(oneChar);
        int ascii = (int)oneChar;
        if(64 < ascii && ascii < 91){
            return true;
        }else {
            return false;
        }
    }
}
