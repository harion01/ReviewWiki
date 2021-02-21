package DailyTheory;

import java.util.ArrayList;

public class Sort {

    public void sort(ArrayList<Integer> origin){

        quickSort(origin, 0, origin.size()-1);

    }

    public void quickSort(ArrayList<Integer> source, int low, int high){
        if(low < high){
            int pivot = partition(source, low, high);

            quickSort(source, low, pivot -1);
            quickSort(source, pivot+1, high);
        }
    }

    private int partition(ArrayList<Integer> source, int low, int high) {
        int pivot = source.get(high);
        int smallidx = low -1;
        for(int index = low; index < high -1; index++){
            if( source.get(low) < pivot ){
                smallidx++;
                int temp = source.get(smallidx);
                source.set(smallidx, source.get(low));
                source.set(low, temp);

            }

        }
        return smallidx+1;
    }

}
