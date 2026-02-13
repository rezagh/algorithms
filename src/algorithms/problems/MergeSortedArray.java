package algorithms.problems;

import org.junit.Test;
import org.junit.Assert;
import java.util.Arrays;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] subset = new int[n+m];
        if(n==0) {
            return;
        }

        if (m==0) {
            for (int i = 0; i < nums2.length; i++) {
                nums1[i] = nums2[i];
            }
        }
        for(int i = 0; i<m+n; i++){
            if(i<n) subset[i] = nums1[i];
            else subset[i]= nums2[i-n];
        }
        Arrays.sort(subset);
        System.out.println(Arrays.toString(subset));

        //nums1 = subset;

        for (int i = 0; i < subset.length; i++) {
            nums1[i] = subset[i];
        }
    }

    @Test
    public void test(){
        int[] nums1 = new int[]{1,2,3,0,0,0};
        merge(nums1,3,new int[]{2,5,6},3);
        System.out.println(Arrays.toString(nums1));
        //assertArraysEqual(nums1,new int[]{1,2,2,3,5,6});
        Assert.assertArrayEquals(nums1,new int[]{1,2,2,3,5,6});



    }

}
