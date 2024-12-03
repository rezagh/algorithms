package algorithms.tree;

public class GeneralNode<E> implements Position<E>{ 
	private E element; // an element stored at this node
	private GeneralNode<E> parent; // a reference to the parent node (if any)
	private Iterable<E> children ;
	
	public GeneralNode(){}
	public GeneralNode(E e, GeneralNode<E> above, Iterable<E> children) { 
		element = e;
		parent = above;
		this.children = children;
	}

	public Iterable<E> getChildren() {
		return children;
	}

	public void setChildren(Iterable<E> children) {
		this.children = children;
	}

	public E getElement() {
		return element;
	}

	public void setElement(E element) {
		this.element = element;
	}

	public GeneralNode<E> getParent() {
		return parent;
	}

	public void setParent(GeneralNode<E> parent) {
		this.parent = parent;
	}
}