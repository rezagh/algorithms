package algorithms.basics;

public class LinkedList<E> {
    private Node<E> head ;
    private Node<E> pointer ;

    //internal class Node
    private class Node<E> {
        E data;
        Node next;

        public Node(E data) {
            this.data = data;
            this.next = null;
        }
    }
    public LinkedList() {}

    public LinkedList(E node) {
        head = new Node(node);
        pointer = head;
    }

//    Node first(){
//        return null;
//    }
//
//    Node last(){
//        return null;
//    }

    public void addNext(E n){
        Node newNode = new Node(n);
        pointer.next = newNode;
        pointer = newNode;
    }

    void addLast(E n){
    }

//    void addNext(E n){
//        Node newNode = new Node(n);
//        head.next = newNode;
//    }

    Node removeFirst(){
        return null;
    }

    Node removeLast(){
        return null;
    }

    void print(){

        Node temp = head;
        while(temp != null && temp.data != null){
            System.out.print(temp.data);
            temp = temp.next;
            if (temp != null)
                System.out.print(" -> ");
        }
    }

}
