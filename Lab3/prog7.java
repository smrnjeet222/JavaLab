// 7.  Write a Java program to create all possible permutations of a given array of distinct integers.

import java.util.*;
import java.util.List;

public class prog7 {

  public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    Permutation(0, nums, result);
    return result;
  }

  private void Permutation(int i, int[] nums, List<List<Integer>> result) {
    if (i == nums.length - 1) {
      List<Integer> list = new ArrayList<>();
      for (int n : nums)
        list.add(n);
      result.add(list);
    } else {
      for (int j = i, l = nums.length; j < l; j++) {
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
        Permutation(i + 1, nums, result);
        temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
      }
    }
  }

  public static void main(String[] args) throws Exception {
    int[] nums = { 1, 2, 3 };

    System.out.println("\nOriginal array: " + Arrays.toString(nums));
    List<List<Integer>> result = new prog7().permute(nums);

    System.out.println("\nPossible permutations of the said array:");
    result.forEach(System.out::println);
  }

}
