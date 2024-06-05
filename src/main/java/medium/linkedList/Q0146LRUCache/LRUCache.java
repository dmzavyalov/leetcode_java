package medium.linkedList.Q0146LRUCache;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    public static class ListNode {
        public int val;
        public int key;
        public ListNode prev;
        public ListNode next;
        public ListNode() {}
        public ListNode(int key, int val) {this.key = key; this.val = val; }
    }

    private int capacity;
    private Map<Integer, ListNode> cache = new HashMap<>();
    private ListNode left = new ListNode();     //Least recently used
    private ListNode right = new ListNode();    //Most recently used

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.left.next = this.right;
        this.right.prev = this.left;
    }

    public int get(int key) {
        if (!cache.containsKey(key)) {
            return -1;
        }

        ListNode node = cache.get(key);
        remove(node);
        insertAsRightMost(node);

        return node.val;
    }

    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            remove(cache.get(key));
        }
        ListNode node = new ListNode(key, value);
        cache.put(key, node);
        insertAsRightMost(node);

        if (cache.size() > capacity) {  //Need to remove the least recently used
           var lru = left.next; //We've started with a dummy
           remove(lru);
           cache.remove(lru.key);
        }
    }

    private void remove(ListNode node) {
        ListNode prev = node.prev;
        ListNode next = node.next;
        prev.next = next;
        next.prev = prev;
    }

    private void insertAsRightMost(ListNode node) {
        ListNode prev = right.prev;
        ListNode next = right;
        prev.next = next.prev = node;
        node.next = next;
        node.prev = prev;
    }
}
