package algorithms.search;

/**
 * Created with IntelliJ IDEA.
 * User: rezaghafari
 * Date: 25/10/2013
 * Time: 4:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class Test {

    @org.junit.Test
    public void test (){
        Node n1 = new Node();
        n1.test = "a";
        Node n2 = n1;
        n2.test = "v";
        System.out.println(n1.test);
    }

    class Node{
        String test;
    }
}
