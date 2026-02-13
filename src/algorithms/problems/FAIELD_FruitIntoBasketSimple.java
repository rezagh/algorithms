package algorithms.problems;

import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
Source: https://www.hellointerview.com/learn/code/sliding-window/variable-length

Write a function to calculate the maximum number of fruits you can collect from an integer array fruits,
where each element represents a type of fruit. You can start collecting fruits from any position in the array,
but you must stop once you encounter a third distinct type of fruit. The goal is to find the longest subarray where at
most two different types of fruits are collected.

Example:
Input: fruits = [3, 3, 2, 1, 2, 1, 0]
Output: 4
Explanation: We can pick up 4 fruit from the subarray [2, 1, 2, 1]

344122166
1221456
size:5




 */
public class FAIELD_FruitIntoBasketSimple {
    /*
    The sliding window approach should use two pointers and a map
    to efficiently track the count of each fruit type, achieving O(n) time.

    This will not work with only one loop

3, 3, 2, 1, 2, 1, 2,0

            3
            33
            332
            332
            3321

            -
    drop left
        3
        32
        321

        -
    drop left
        2
        1
        2
        1
        2
        -


        I WAS UNBALE TO SOLVE THIS PROPERLY MOVING ON. 5/11/25

    */
    int totalFruit(int[] fruits) {
        Map<Integer, Integer> count = new HashMap<>();
        //key = position , value = count of fruit type
        int left = 0, max = 0;
        for (int i = 0; i < fruits.length; i++) {
            int key = fruits[i];
            int value = count.getOrDefault(key,0);
            count.put(key, value + 1);
            if (count.size() > 2){
                max = Math.max(max, i - left);
                left = i;
                break;
            }
        }
        return max;
    }
    int totalFruit_bad(int[] fruits) {
        int start = 0;
        int end = 0;
        int max = 0;// this is the size of our window - using sliding window technique
        Set< Integer > fruitSet = new HashSet<>();

        for (int i = 0; i < fruits.length; i++) {
            for (int j = i; j < fruits.length; j++) {
                fruitSet.add(fruits[j]);
                if (fruitSet.size() > 2) {
                    if (fruitSet.size() > max)
                        max = j-i-1;
                    fruitSet.clear();
                    fruitSet.add(fruits[j]);
                    break;
                }
            }
        }
        return max+1;// this does not work for all cases
    }
    @Test
    public void testFruitIntoBasket() {
        System.out.println(totalFruit(new int[]{3, 3, 2, 1, 2, 1, 2,0}));
        System.out.println(totalFruit(new int[]{3, 2, 1, 2, 1, 2,0}));
        System.out.println(totalFruit(new int[]{3, 3, 2,3,4,5,0}));
        System.out.println(totalFruit(new int[]{1,2,1,2,1,2,2,3}));
        System.out.println(totalFruit(new int[]{3, 4}));
        System.out.println(totalFruit(new int[]{3}));
    }
}
