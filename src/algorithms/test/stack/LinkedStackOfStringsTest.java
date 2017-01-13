package algorithms.test.quickfind.algorithms.test.stack;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: rezaghafari
 * Date: 8/11/2013
 * Time: 9:43 AM
 * To change this template use File | Settings | File Templates.
 */
public class LinkedStackOfStringsTest {

    @Test
    public void test(){
         LinkedStackOfStrings st = new LinkedStackOfStrings();
        st.push("1");
        st.push("2");
        st.push("3");
        Assert.assertEquals("3",st.pop());

    }
    @Test
    public void test2(){
        LinkedStackOfStrings st = new LinkedStackOfStrings();
        Assert.assertEquals(null,st.pop());


    }

}
