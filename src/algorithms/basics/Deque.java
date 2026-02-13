package algorithms.basics;

/*

doubly linked list is not exactly a deque but very close.
deque is more of a concept and DLL is an implementation of it.

DLL is probably better than arraylist to implement deque

ArrayList is inefficient for implementing a deque because insertions and removals at the front require shifting all elements, resulting in (O(n)) time complexity. Deques need fast (O(1)) operations at both ends, which ArrayList cannot provide.
the best backing data structure to implement a deque is a doubly linked list. It allows efficient (O(1)) insertions and removals at both ends, which are essential operations for a deque.
 */
public interface Deque<E> {
    int size( );
    boolean isEmpty( );
    /** Inserts an element at the front of the deque. */
    void addFirst(E e);
    void addLast(E e);
    /** Returns, but does not remove, the first element of the deque (null if empty). */
    E first( );
    E last( );

    E removeFirst();
    E removeLast();
}