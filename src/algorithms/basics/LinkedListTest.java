package algorithms.basics;

import org.junit.Test;

public class LinkedListTest {


    @Test
    public void printLinkedList(){
        LinkedList<String> list = new LinkedList<String>("head");
        list.addNext("a");
        list.addNext("b");
        list.addNext("c");

        list.print();

    }
}
