package algorithms.search;

/**
 * id[i] is the parent of i
 * root i is id[id[...id[i]...]
 * union p,q: change the id of p's root to the value of q's root 
 * 				(p changes; q becomes parent or q's root becomes the root)
 * 				id[p's root] = q's root
 * this union just changes one thing in the array	
 * connection means whether they have the same root
 */
public class QuickUnionUF {
	private int [] id;

	public QuickUnionUF(int n){
		id = new int[n];
		for(int i=0;i<n;i++)
			id[i]=i;
	}

	public int root(int p){
		if(id[p]==p) return p;
		else return root(id[p]);
		
	}
	
	public boolean connected (int p,int q){
		return root(p)==root(q);
	}
	
	public void union(int p,int q){
		int proot = root(p);
		int qroot = root(q);
		
		id[proot] = qroot;
	}

}
