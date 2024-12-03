package algorithms.stack;

/**
 * Stack using linked list or linked stack.
 * 
 * User: rezaghafari
 * Date: 8/11/2013
 */
public class LinkedStackOfStrings {

    private Node first;

    public LinkedStackOfStrings(){
        first = new Node();
    }

    public void push(String item){
        Node next = new Node();
        next.item = item;
        Node oldFirst = first;

        first = next;

        first.next = oldFirst;

    }

    public String pop(){
        String firstItem = first.item;
        first = first.next;
        return firstItem;
    }

    public class Node{
        String item;
        Node next;
    }
}
