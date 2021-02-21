package DailyTheory;

import java.util.ArrayList;

public class Search {

    boolean search(ArrayList<Integer> source, int target){
        boolean result = false;

        binarySearch(source,0,source.size()-1, target);
        return result;
    }

    boolean binarySearch(ArrayList<Integer> source, int start, int end, int target){
        int middle = (end-start) /2;
        int check = source.get(middle);
        System.out.println("compare check ["+check+"] and target ["+target+"]");
        if(middle > 0){
            if(target == check) {
                System.out.println("We found it!");
                return true;
            }else if (target > check){
                return binarySearch(source, middle+1, end, target);
            }else {
                return binarySearch(source, start, middle, target);
            }
        }
        System.out.println("There is no target...");

        return false;
    }




}
