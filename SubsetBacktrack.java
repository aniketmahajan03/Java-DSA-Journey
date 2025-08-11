import java.util.*;
public class SubsetBacktrack {

    public static void main(String args[]) {
        int[] nums = {1,2,3};
        List<List<Integer>> result = new ArrayList<>();
        backtrack(0,nums,new ArrayList<>(), result);
        System.out.println(result);
    }

    static void backtrack(int start, int nums[], List<Integer> current, List<List<Integer>> result) {
        result.add(new ArrayList<>(current));
      for(int i=start; i < nums.length; i++) {
        current.add(nums[i]);
        backtrack(i + 1, nums, current, result);
        current.remove(current.size() - 1);

       }
    }
}