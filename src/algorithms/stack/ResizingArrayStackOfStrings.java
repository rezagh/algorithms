package algorithms.stack;

/**
 * when the array is full then we create a new one with double the size and copy items in it.
 *
 * User: rezaghafari
 * Date: 11/11/2013
 * Time: 8:33 AM
 */
public class ResizingArrayStackOfStrings {
    String [] items;
    int pointer = -1;
    public ResizingArrayStackOfStrings() {
        items  = new String [1];
    }

    public void push(String item){
        if((pointer + 1) == items.length) {
            String [] newitems = new String [2 * items.length];
            System.arraycopy(items,0,newitems,0, items.length);
            items = newitems;
            items[++pointer] = item;

        }else{
            items[++pointer] = item;

        }

    }

    public int size(){
        return items.length;
    }

    public String pop(){
        String item = items[pointer];

        items[pointer] = null;
        pointer -= 1;
        return item;
    }
}
