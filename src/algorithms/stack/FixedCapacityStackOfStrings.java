package algorithms.stack;

/**
 * stack implementation with a fixed size array
 *
 * User: rezaghafari
 * Date: 8/11/2013
 * Time: 5:48 PM
 */
public class FixedCapacityStackOfStrings {
    String [] items;
    int pointer = 0;
    public FixedCapacityStackOfStrings(int size) {
        items = new String [size];
    }

    public void push(String value){
        items[++pointer] = value;
    }

    public String pop(){
    	if(pointer == 0) {
    		System.out.println("stack is empty.");
    		return null;
    	}
    	String item = items[pointer];

        items[pointer] = null;
        pointer -= 1;
        return item;

    }
    
    public int size(){
    	return pointer;
    }
}
