import java.util.*;

public class Solution {
    public static void main(String args[]){
        Solution sol = new Solution();
        int[] nums = {1,2,3};
        System.out.println(sol.permute(nums));
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        HashSet<Integer> checkSet = new HashSet<Integer>();
        List<Integer> oneCombination = new ArrayList<Integer>();

        for(int idx = 0; idx< nums.length; idx++){
            checkSet.add(nums[idx]);
            oneCombination.add(nums[idx]);
            makeCombination(nums, checkSet, result, oneCombination);
            oneCombination.remove(oneCombination.size()-1);
            checkSet.remove(nums[idx]);
        }

        return result;
    }

    public void makeCombination(int[] nums, HashSet<Integer> checkSet, List<List<Integer>> result, List<Integer> oneCombination){

        if(oneCombination.size() == nums.length){
            result.add(oneCombination);
            System.out.println("add combination: " + oneCombination);
            System.out.println("total: " + result);
            System.out.println("new combination: " + oneCombination);
            return;
        }

        boolean isAdded = false;
        for(int idx = 0; idx< nums.length; idx++){
            List<Integer> newCombination = new ArrayList<Integer>(oneCombination);
            isAdded = checkSet.add(nums[idx]);
            if(isAdded){
                newCombination.add(nums[idx]);
                makeCombination(nums, checkSet, result, newCombination);
            }else {
                continue;
            }
            checkSet.remove(nums[idx]);
        }
    }

}
