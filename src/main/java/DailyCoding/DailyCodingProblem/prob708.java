package DailyCoding.DailyCodingProblem;


import java.util.ArrayList;

/*
This problem was asked by Apple.

A fixed point in an array is an element whose value is equal to its index.
Given a sorted array of distinct elements, return a fixed point, if one exists. Otherwise, return False.

For example, given [-6, 0, 2, 40], you should return 2. Given [1, 5, 7, 8], you should return False.

---
linear : from 1st element to end, check index and value.

pattern : distinct and sorted.
    -> if value > index , find fixed point in smaller side of current index
    -> if value < index , find fixed point in larger side of current index
    -> if value == index , return value.

binary search :
    - find value in the middle of array.
    - check pattern
    - reduce array range by pattern
    - loop until find answer
 */
public class prob708 {
    public static void main(String args[]){
        ArrayList<Integer> input = new ArrayList<Integer>();
        input.add(-6);
        input.add(0);
        input.add(2);
        input.add(40);

        int startIdx = 0;
        int endIdx = input.size();

        int middle = (startIdx + endIdx)/2;
        int checkResult = 0;
        Integer answer = null;
        while(middle != endIdx && middle != startIdx ){
            checkResult = findFixedPoint(input, middle);
            if(checkResult > 0){
                startIdx = middle;
            }else if(checkResult <0){
                endIdx = middle;
            }else if(checkResult ==0){
                answer = input.get(middle);
                break;
            }
            middle = (startIdx + endIdx)/2;

        }

        System.out.println("list ["+ input +"] answer["+ answer+"]");
    }

    private static int findFixedPoint(ArrayList<Integer> input, int middle) {
        Integer point = input.get(middle);
        return point.intValue() - middle;
    }


}
