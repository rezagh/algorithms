package algorithms.search;

import java.util.Arrays;

/**
 *
 *  Binary search is an efficient algorithm for finding the position of a
 *  target value within a sorted array. It works by repeatedly dividing the
 *  search interval in half, leveraging the sorted order of elements to eliminate
 *  half of the remaining possibilities at each step.
 *
 * 	this it a difficult algorithm to get right the first time!
 *
 */
public class BinarySearch {

    //these are not thread safe though i think
    private static int id [];
    private static int item;

    //we need to preserver the initial indexes/array and cannot copy into temp arrays.
    public static int binarySearch(int start, int end){

        if(start == end && item == id[start]) return start;
        if(start == end && item != id[start]) return -1;

        int middleIndex = start +  (end-start)/2;
        int middleItem = id[middleIndex];

        if(item > middleItem)
            return binarySearch(middleIndex+1,end);

        if(item < middleItem)
            return binarySearch(start,middleIndex);

        if(item == middleItem) return middleIndex;

        return -1;
   }

    public static int binarySearch(int item , int id[])     {
        Arrays.binarySearch(id,4);

        BinarySearch.id = id;
        BinarySearch.item = item;
        return binarySearch(0,id.length-1);
    }
}
