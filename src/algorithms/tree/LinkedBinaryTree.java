package algorithms.tree;

import java.util.Iterator;

public class LinkedBinaryTree<E> extends AbstractBinaryTree<E> {

	Position<E> root = null;
	
	public LinkedBinaryNode<E> createNode(E e, LinkedBinaryNode<E> above, LinkedBinaryNode<E> leftChild, LinkedBinaryNode<E> rightChild){
		return new LinkedBinaryNode<E>(e, above, leftChild, rightChild);
	}
	
	@Override
	public Position<E> left(Position<E> p) throws IllegalArgumentException {
		LinkedBinaryNode<E> node = (LinkedBinaryNode<E>)p;
		if(node != null){
			return node.getLeft();
		}
		return null;
	}

	@Override
	public Position<E> right(Position<E> p) throws IllegalArgumentException {
		LinkedBinaryNode<E> node = (LinkedBinaryNode<E>)p;
		if(node != null){
			return node.getRight();
		}
		return null;
	}

	@Override
	public Position<E> root() {
		return root;
	}

	public Position<E> addRoot(E e) {
		root = createNode(e, null, null, null);
		//size = 1;
		return root;
	}

	public Position<E> addLeft(E e, LinkedBinaryNode<E> above) {
		LinkedBinaryNode<E> left = createNode(e , above, null , null);
		above.setLeft(left);
		return left;
	}

	public Position<E> addRight(E e, LinkedBinaryNode<E> above) {
		LinkedBinaryNode<E> right = createNode(e , above, null , null);
		above.setRight(right);
		return right;
	}

	@Override
	public Position<E> parent(Position<E> p) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Position<E>> positions() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public void preorder(Position<E> root){
		LinkedBinaryNode<E> rootNode = (LinkedBinaryNode<E>)root;
		
		System.out.println(rootNode.getElement());
		
		if(rootNode.getLeft() != null){
			preorder(rootNode.getLeft());
		}

		if(rootNode.getRight() != null){
			preorder(rootNode.getRight());
		}
	}
	
	public void postorder(Position<E> root){
		LinkedBinaryNode<E> rootNode = (LinkedBinaryNode<E>)root;
		
		//
		
		if(rootNode.getLeft() != null){
			preorder(rootNode.getLeft());
		}

		if(rootNode.getRight() != null){
			preorder(rootNode.getRight());
		}
		
		System.out.println(rootNode.getElement());
	}

	public void inorder(Position<E> root) {
		LinkedBinaryNode<E> rootNode = (LinkedBinaryNode<E>)root;
		
		if(rootNode.getLeft() != null){
			inorder(rootNode.getLeft());
		}
		System.out.println(rootNode.getElement());

		if(rootNode.getRight() != null){
			inorder(rootNode.getRight());
		}
	}
}
