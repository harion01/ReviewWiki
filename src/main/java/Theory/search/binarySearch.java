package Theory.search;

import java.util.ArrayList;

/*
1. Compare x with the middle element.
2. If x matches with middle element, we return the mid index.
3. Else If x is greater than the mid element, then x can only lie in right half sub-array after the mid element. So we recur for right half.
4. Else (x is smaller) recur for the left half.

*/
public class binarySearch {
    public static void main(String args[]){
        ArrayList<Integer> origin = new ArrayList<>();
        origin.add(1);
        origin.add(2);
        origin.add(4);
        origin.add(5);
        origin.add(7);
        origin.add(9);
        origin.add(10);

        binarySearch bin = new binarySearch();
        if(bin.search(origin, 9, 0, origin.size()-1)){
            System.out.println("found data");
        }else {
            System.out.println("no data");
        }
    }

    //0,6  3mid 5 value 3 target
    //0,3  1 mid 2 value 3 target
    //

    public boolean search(ArrayList<Integer> data, Integer target, int startIdx, int endIdx){
        boolean result = false;

        int midIdx = (startIdx + endIdx) / 2;
        if(midIdx > startIdx){
            Integer midValue = data.get(midIdx);
            if (midValue == target) {
                result = true;
            } else if (midValue < target) {
                result = search(data, target, midIdx, endIdx);
            } else if (midValue > target) {
                result = search(data, target, startIdx, midIdx);
            }
        }

        return result;
    }


}
