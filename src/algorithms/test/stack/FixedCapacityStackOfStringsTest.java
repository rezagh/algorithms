package algorithms.test.quickfind.algorithms.test.stack;

import junit.framework.Assert;
import org.junit.Test;

/**
 * User: rezaghafari
 * Date: 8/11/2013
 * Time: 6:00 PM
 */
public class FixedCapacityStackOfStringsTest {
    @Test
    public void test(){
        FixedCapacityStackOfStrings test = new FixedCapacityStackOfStrings(4);
        test.push("a");
        Assert.assertEquals("a",test.pop());
    }
}
