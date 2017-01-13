package algorithms.test.quickfind;

import java.util.Arrays;

/**
 *
 * 	looking for an item x in a sorted array.
 * 	we compare the item x with the middle item in the array and this way we can through away half of the array.
 * 	we do this recursively.
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
