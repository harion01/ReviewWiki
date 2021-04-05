package Theory.sort;

import java.util.ArrayList;

public class mergeSort {

    public static void main (String args[]){
        ArrayList<Integer> origin = new ArrayList<>();
        origin.add(1);
        origin.add(3);
        origin.add(7);
        origin.add(5);

        mergeSort sort = new mergeSort();
        ArrayList<Integer> sorted = sort.invoke(origin);

        System.out.println("origin : "+origin);
        System.out.println("sorted : "+sorted);
    }

    public ArrayList<Integer> invoke(ArrayList<Integer> original){
        ArrayList<Integer> sorted = null;
        sorted = sort(original, 0, original.size());
        return sorted;
    }

    private ArrayList<Integer> sort(ArrayList<Integer> target, int startIdx, int endIdx) {
        System.out.println("sort called. start : "+ startIdx + " end : " +endIdx);
        int gap = (endIdx - startIdx);
        ArrayList<Integer> left =null;
        ArrayList<Integer> right = null;
        ArrayList<Integer> mergeSorted = new ArrayList<>();

        if(gap >= 1) {
            int half = gap/2;
            left = sort(target, startIdx, startIdx+half);
            right = sort(target, endIdx-half, endIdx);
        }else if(gap == 0){
            mergeSorted.add(target.get(startIdx));
            System.out.println("return init merged : "+mergeSorted);
            return mergeSorted;
        }
        System.out.println("left : "+left);
        System.out.println("right : "+right);

        int leftIdx = 0;
        int rightIdx = 0;
        int leftItem = 0;
        int rightItem = 0;
        while(leftIdx < left.size() && rightIdx < right.size() ){
            leftItem = left.get(leftIdx);
            rightItem = right.get(rightIdx);
            if(leftItem < rightItem){
                mergeSorted.add(left.get(leftIdx));
                leftIdx++;
            }else {
                mergeSorted.add(right.get(rightIdx));
                rightIdx++;
            }
        }
        System.out.println(" merged : "+mergeSorted);

        for(int idx = leftIdx ; idx < left.size() ; idx++){
            mergeSorted.add(left.get(idx));
        }
        for(int idx = rightIdx ; idx < right.size() ; idx++){
            mergeSorted.add(right.get(idx));
        }

        System.out.println("return  merged : "+mergeSorted);
        return mergeSorted;
    }


}
