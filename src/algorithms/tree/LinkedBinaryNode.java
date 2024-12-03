package algorithms.tree;

// this is for binary trees
public class LinkedBinaryNode<E> extends GeneralNode<E> { 
	private E element; // an element stored at this node
	private LinkedBinaryNode<E> parent; // a reference to the parent node (if any)
	private LinkedBinaryNode<E> left; // a reference to the left child (if any)
	private LinkedBinaryNode<E> right;
	
	public LinkedBinaryNode(E e, LinkedBinaryNode<E> above, LinkedBinaryNode<E> leftChild, LinkedBinaryNode<E> rightChild) {
		element = e;
		parent = above;
		left = leftChild;
		right = rightChild;
	}

	public E getElement() {
		return element;
	}

	public void setElement(E element) {
		this.element = element;
	}

	public LinkedBinaryNode<E> getParent() {
		return parent;
	}

	public void setParent(LinkedBinaryNode<E> parent) {
		this.parent = parent;
	}

	public LinkedBinaryNode<E> getLeft() {
		return left;
	}

	public void setLeft(LinkedBinaryNode<E> left) {
		this.left = left;
	}

	public LinkedBinaryNode<E> getRight() {
		return right;
	}

	public void setRight(LinkedBinaryNode<E> right) {
		this.right = right;
	}	
}