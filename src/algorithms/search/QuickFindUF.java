package algorithms.search;
/**
 * 
 * eager algo for dynamic connectivity problem or union find problem
 * p and q are connection iff id[p]==id[q]
 * union: to merge components containing indexes p and q then change all entries
 * 		whose id equals id[p] to id[q]
 * 
 * index 	0	1	2	3	4
 * id[]		0	1	2	3	4	initially
 * 
 * id[]		0	1	4	3	4	union 2,4 (2,4 are connected)
 *							
 * id[]		0	1	3	3	3	connect 2,3		
 * 
 * this algo is N2 (N to the power of 2)
 */
public class QuickFindUF {

	private int [] id;
	
	public QuickFindUF(int n){
        id = new int[n];
		for(int i=0;i<n;i++)
			id[i]=i;
	}
	
	public boolean connected(int p, int q){
		return id[p]==id[q];
	}
	
	public void union(int p, int q){
		int idp = id[p];
		int idq = id[q];
		for(int i = 0; i < id.length ; i++){
			if(id[i]==idp)
				id[i]=idq;
		}
	}

}
