package algorithms.basics;

import java.util.LinkedList;

public class DequeImpl1 implements Deque {

    LinkedList list = new LinkedList();


    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        if(list.size() == 0)
            return true;
        return false;
    }

    @Override
    public void addFirst(Object o) {
        list.addFirst(o);
    }

    @Override
    public void addLast(Object o) {
        list.addLast(o);

    }

    @Override
    public Object first() {
        return list.getFirst();
    }

    @Override
    public Object last() {
        return list.getLast();
    }

    @Override
    public Object removeFirst() {
        return list.removeFirst();
    }

    @Override
    public Object removeLast() {
        return list.removeLast();
    }
}
