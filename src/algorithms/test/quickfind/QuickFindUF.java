package algorithms.test.quickfind;
/**
 * 
 * eager algo for dynamic connectivity problem or union find problem
 * p and q are connection iff id[p]==id[q]
 * union: to merge components containing indexes p and q then change all entries
 * 		whose id equals id[p] to id[q]
 * 
 * index 	0	1	2	3	4
 * id[]		0	1	2	3	4	initia
 * 
 * id[]		0	1	2	3	2	2,4 are connected
 *							
 * id[]		0	1	3	3	3	connect 2,3		
 */
public class QuickFindUF {

	private int [] id;
	
	private QuickFindUF(int n){
		for(int i=0;i<n;i++)
			id[i]=i;
	}
	
	public boolean connected(int p, int q){
		if(id[p]==id[q]) return true;
		return false;
	}
	
	public void union(int p, int q){
		for(int i = 0; i < id.length ; i++){
			if(id[i]==id[p])
		}
	}

}
