package algorithms.stack;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Date: 11/11/2013
 */
public class ResizingArrayStackOfStringsTest {
    @Test
    public void test(){
         ResizingArrayStackOfStrings test = new ResizingArrayStackOfStrings();
        test.push("a");
        test.push("b");
        test.push("c");
        test.push("d");

        Assert.assertEquals("d",test.pop());
        Assert.assertEquals("c",test.pop());

    }
}
