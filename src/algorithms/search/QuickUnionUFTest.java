package algorithms.search;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;


public class QuickUnionUFTest {
	QuickUnionUF me =  new QuickUnionUF(4);
	
	@Before
	public void setup(){
	}
	
	/*
	 * index	0	1	2	3	
	 * id		0	1	3	3	
	 * 
	 */
	@Test
	public void testRoot(){
		me.union(2, 3);
		Assert.assertTrue(me.root(2)==3);



    }


}
