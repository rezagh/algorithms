package algorithms.tree;

import java.util.Scanner;

public class TreeReader {
	public static void main(String[] args) {
        System.out.println("Enter how many number you are going to enter.");
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        System.out.println("Going to read this number of items:" + t + "\n");
        LinkedBinaryNode<Integer> root = null;
        while(t-- > 0){
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        
        //int height = height(root);
        
        System.out.println("t=" + t + root);
    }	
	
	/*
	 * inserting a binary search tree
	 * Left < parent < right
	 * 
	 */
	public static LinkedBinaryNode<Integer> insert(LinkedBinaryNode<Integer> root, Integer data) {
        if(root == null){
            return new LinkedBinaryNode<Integer>(data,null,null,null);
        }
        else {
        	LinkedBinaryNode<Integer> cur;
            if(data <= root.getElement()){
                cur = insert(root.getLeft(), data);
                root.setLeft(cur);
            }
            else{
                cur = insert(root.getRight(), data);
                root.setRight(cur);
            }
            return root;
        }
    }
	
}
