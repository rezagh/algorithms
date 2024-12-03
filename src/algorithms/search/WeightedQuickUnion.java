package algorithms.search;

/**
 * some improvements onver quick union
 * always put the larger tree higher.
 *
 */
public class WeightedQuickUnion {
    private int [] id;
    private int [] size;

    public WeightedQuickUnion(int n){
        id = new int[n];
        size = new int[n];

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
        if(size[proot] < size[qroot]){  //qroot is the larger tree
            id[proot] = qroot;
            size[qroot] += size[proot];
        }else{
            id[qroot] = proot;
            size[proot] += size[qroot];
        }
    }


}
