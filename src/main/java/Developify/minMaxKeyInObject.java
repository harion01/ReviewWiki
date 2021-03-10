package Developify;

import java.util.ArrayList;
import java.util.HashMap;

public class minMaxKeyInObject {
    public static void main(String[] args){
        HashMap<Integer, String> dataSet = new HashMap<>();
        /*
        //2: ‘a’, 7: ‘b’, 1: ‘c’, 10: ‘d’, 4: ‘e’
        dataSet.put(2, "a");
        dataSet.put(7, "b");
        dataSet.put(1, "c");
        dataSet.put(10, "d");
        dataSet.put(4, "e");
*/

        //1: ‘Elie’, 4: ‘Matt’, 2: ‘Tim’
        dataSet.put(1, "Elie");
        dataSet.put(4, "Matt");
        dataSet.put(2, "Tim");
        minMaxKeyInObject obj = new minMaxKeyInObject();

        System.out.println(obj.getMinMaxKeyInObject(dataSet));
    }

    public ArrayList<Integer> getMinMaxKeyInObject(HashMap<Integer, String> dataSet){
        ArrayList<Integer> result = new ArrayList<>();
        Integer min = -1;
        Integer max = -1;
        for(Integer key : dataSet.keySet()){
            if(min == -1){
                min = key;
            }else {
                if(key < min){
                    min = key;
                }
            }

            if(max == -1){
                max = key;
            }else {
                if(key > max){
                    max = key;
                }
            }
        }

        result.add(min);
        result.add(max);
        return result;
    }
}
