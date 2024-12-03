package algorithms.search;

import junit.framework.Assert;

public class BinarySearchTest {
    @org.junit.Test
    public void test1(){
        int []  items  = {1,2,3};
        Assert.assertTrue(1 == BinarySearch.binarySearch(2, items));

        int []  items1  = {1,2,3,4};
        Assert.assertTrue(2==BinarySearch.binarySearch(3,items1));

        int []  items2  = {1,2,3};
        Assert.assertTrue(2==BinarySearch.binarySearch(3,items2));

        int []  items3  = {1,2,3,4};
        Assert.assertTrue(0==BinarySearch.binarySearch(1,items3));

        int []  items4  = {22,34,88,99};
        Assert.assertTrue(1==BinarySearch.binarySearch(34,items4));


        int []  items5  = {22,34,88,99};
        Assert.assertTrue(-1==BinarySearch.binarySearch(25,items5));

        int []  items6  = {22,23,34,88,99};
        Assert.assertTrue(-1==BinarySearch.binarySearch(25,items6));

        int []  items7  = {22,23,24,34,88,99};
        Assert.assertTrue(-1==BinarySearch.binarySearch(25,items7));

    }
}
