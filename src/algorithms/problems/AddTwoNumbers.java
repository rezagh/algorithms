package algorithms.problems;

import org.junit.Test;

import java.math.BigInteger;

/*
source: leetcode
You are given two non-empty linked lists representing two non-negative integers.
The digits are stored in reverse order, and each of their nodes contains a single digit.
Add the two numbers and return the sum as a linked list.

 */

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next;}

    @Override
    public String toString() {
        String s = val + ",";
        ListNode localNext = this.next;
        while(localNext != null) {
            s = s + localNext.val + ",";
            localNext = localNext.next;
        }

        return s;
    }
}

class Solution {

    //456 -> [6,5,4]
    ListNode toList(BigInteger n){
        BigInteger lastDigit = n.mod(BigInteger.TEN);

        ListNode root = new ListNode(lastDigit.intValue());
        ListNode current = root;
        BigInteger remain = n.divide(BigInteger.TEN);
        while(remain.compareTo(BigInteger.ZERO) > 0){
            ListNode next = new ListNode(remain.mod(BigInteger.TEN).intValue());
            current.next = next;
            remain = remain.divide(BigInteger.TEN);
            current = current.next;
        }
        System.out.println(root.toString());
        return root;
    }

    //1,2,3 -> [1,2,3]
    /*
    we should init the head node before the loop
     */
    ListNode arrayToList(int[] n){
        ListNode root = new ListNode(n[0]);
        ListNode current = root;
        for(int i =1; i<n.length; i++){
            current.next = new ListNode(n[i]);
            current = current.next;
        }
        System.out.println("array:" +  root.toString());
        return root;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        BigInteger output = extractNum(l1).add(extractNum(l2));
        System.out.println("output:" +  output);
        return toList(output);
    }

    //[1,2,3,4] -> 4321
    BigInteger extractNum(ListNode ln){
        int i = 0;
        BigInteger sum = BigInteger.ZERO;
        ListNode curr = ln;
        while(curr != null){
            //sum = curr.val * Math.pow(10,i) + sum;
            sum = BigInteger.valueOf(curr.val).multiply(BigInteger.TEN.pow(i)).add(sum);
            curr = curr.next;
            i++;
        }
        return sum;
    }

}
public class AddTwoNumbers {
    Solution s = new Solution();

    @Test
    public void testSum() {
        //remember this syntax: new int[]{1,2,3}
        org.junit.Assert.assertEquals(9,s.addTwoNumbers(s.arrayToList(new int[]{1,1,1,1,1,1,1,1,1,1,1}), s.arrayToList(new int[]{1,1,1,1,1,1,1,1,1,1,1})));
    }

    @Test
    public void arrayToList() {
        ListNode ln = s.arrayToList(new int[]{1,9,9,9,9,9,9,9,9,9});
        //System.out.println(ln.toString());
    }

    @Test
    public void extractNum() {
        ListNode ln = s.arrayToList(new int[]{1,9,9,9,9,9,9,9,9,9});
        BigInteger n = s.extractNum(ln);
        org.junit.Assert.assertEquals(9999999991L,n);
    }

    @Test
    public void toList() {
        System.out.println(s.toList(new BigInteger("3434")));

    }

}


