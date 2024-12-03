package algorithms.tree;

public class LinkedBinaryTreeTest {

	LinkedBinaryTree<String> tree;
	
	@org.junit.Before
	public void Before (){
		tree = new LinkedBinaryTree<>();
		LinkedBinaryNode<String> root = (LinkedBinaryNode<String>)tree.addRoot("1");
		tree.addLeft("2", root);
		tree.addRight("3", root);
	}
	
	@org.junit.Test
	public void test_preorder (){
		System.out.println("pre order");
		tree.preorder(tree.root);
	}

	@org.junit.Test
	public void test_postorder (){
		System.out.println("post order");
		tree.postorder(tree.root);
	}

	@org.junit.Test
	public void test_inorder (){
		System.out.println("in order");
		tree.inorder(tree.root);
	}

}
