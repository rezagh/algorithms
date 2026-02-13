package algorithms.cache;

import algorithms.basics.LinkedHashMap;
import algorithms.basics.LinkedList;

/*
An LRU (Least Recently Used) cache is a caching policy that evicts (removes) the item which has been least recently
accessed when the cache reaches its capacity. In other words: when you add a new item and the cache is full, you kick
out the item you haven’t used for the longest time.

 */
public class LRU {
    int cacheSize = 100;
    //HashMap<String, String> cache = new HashMap<>();
    LinkedHashMap cache = new LinkedHashMap();

    //TODO use linked hash map

    void push(String key) {
    //    cache.addNext(key);
        evictLast();
    }

    private void evictLast() {
    }

    String get(String key) {
        //String value = cache.(key);
        reorder(key);
        return null;
    }



    void reorder(String key){
        //implement a deque

    }

}
