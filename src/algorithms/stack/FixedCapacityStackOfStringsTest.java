package algorithms.stack;


import org.junit.Assert;
import org.junit.Test;

/**
 * User: rezaghafari
 * Date: 8/11/2013
 * Time: 6:00 PM
 */
public class FixedCapacityStackOfStringsTest {
    @Test
    public void test(){
        FixedCapacityStackOfStrings myStack = new FixedCapacityStackOfStrings(4);
        myStack.push("a");
        Assert.assertTrue(myStack.size() == 1);
    }
}
