package algorithms.problems;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/*
leetcode
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 */
public class TwoSum {

    //using two pointer technique - assumed sorted array. we can sort array first.
    public int[] twoSum_TwoPointers(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {return new int[]{left, right };}

            if (sum < target) {left++;}
            if (sum > target) {right--;}

        }

        return null;

    }

    // this works but not efficient. try with two pointers.
    public int[] twoSum(int[] nums, int target) {
        for(int i=0 ; i < nums.length-1 ; i++ )
            for(int j=i+1 ; j < nums.length ; j++ ){
                System.out.print("i: " + i + ", j: " + j + "\n");
                //if ( i == j) continue;
                if(nums[i] + nums[j] == target) {
                    return new int[] {i, j} ;
                }
            }
        System.out.print("here??");
        return new int[] {0,0} ;
    }

    @Test
    public void testTwoSums() {
        int[] nums = {6, 17, 2, 7};
        int target = 9;
        assertArrayEquals(new int[]{2, 3}, twoSum(nums, target));
    }

    @Test
    public void testTwoSums2() {
        int[] nums = {1,2,6,7,12};
        int target = 9;
        assertArrayEquals(new int[]{1, 3}, twoSum_TwoPointers(nums, target));
    }
}
