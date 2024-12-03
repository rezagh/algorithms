package algorithms.tree;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractBinaryTree<E> extends AbstractTree<E> implements BinaryTree<E> {

	public int numChildren(Position<E> p) {
		int counter = 0;
		if (left(p) != null){
			counter += 1;
		}
		if (right(p) != null){
			counter += 1;
		}
		
		return counter;
	}
	
	public Iterable<Position<E>> children(Position<E> p) {
		List<Position<E>> out = new ArrayList<>(2);
		if (left(p) != null){
			out.add(left(p));
		}
		if (right(p) != null){
			out.add(right(p));
		}
		
		return out;
	}
	
	public Position<E> sibling(Position<E> p) {
		return null;
	}
}
