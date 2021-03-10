package Developify;

import java.util.ArrayList;

public class findGreaterNumbers {
    public static void main(String[] args){
        ArrayList<Integer> dataSet = new ArrayList<>();
        /*
        dataSet.add(1);
        dataSet.add(2);
        dataSet.add(3);
         */

        /*
        dataSet.add(6);
        dataSet.add(1);
        dataSet.add(2);
        dataSet.add(7);
        */

        /*
        dataSet.add(5);
        dataSet.add(4);
        dataSet.add(3);
        dataSet.add(2);
        dataSet.add(1);
        */

        findGreaterNumbers obj = new findGreaterNumbers();
        System.out.println(obj.searchGreaterNumbers(dataSet));

    }

    public int searchGreaterNumbers(ArrayList<Integer> dataSet){
        int total = 0;

        int criteria = 0;
        int compare = 0;

        for(int criteriaIdx = 0 ; criteriaIdx < dataSet.size(); criteriaIdx++){
            criteria = dataSet.get(criteriaIdx);

            for(int compareIdx = criteriaIdx+1; compareIdx < dataSet.size(); compareIdx++){
                compare = dataSet.get(compareIdx);
                if(criteria < compare){
                    total++;
                }
            }
        }


        return total;
    }

}
