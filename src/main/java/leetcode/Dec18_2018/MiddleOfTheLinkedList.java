package main.java.leetcode.Dec18_2018;
/*
Given a non-empty, singly linked list with head node head, return a middle node of linked list.

If there are two middle nodes, return the second middle node.



Example 1:

Input: [1,2,3,4,5]
Output: Node 3 from this list (Serialization: [3,4,5])
The returned node has value 3.  (The judge's serialization of this node is [3,4,5]).
Note that we returned a ListNode object ans, such that:
ans.val = 3, ans.next.val = 4, ans.next.next.val = 5, and ans.next.next.next = NULL.
Example 2:

Input: [1,2,3,4,5,6]
Output: Node 4 from this list (Serialization: [4,5,6])
Since the list has two middle nodes with values 3 and 4, we return the second one.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class MiddleOfTheLinkedList {
    public ListNode middleNode(ListNode head) {
        List<ListNode> l = new  ArrayList<ListNode>();
        l.add(head);
        while(head.next!=null){
            head = head.next;
            l.add(head);
        }
        head = l.get(l.size()/2);
        return head;
    }
    public static void main(String [] args){
        MiddleOfTheLinkedList ml =  new MiddleOfTheLinkedList();
        ListNode head = new ListNode(1);
        ListNode next;
        ListNode t = head;
        for (int i =0; i <5; i++){
            next = new ListNode(i+1);
            t.next = next;
            t =next ;
            System.out.println(next.val + " ");
        }

        ListNode m = ml.middleNode(head);
        System.out.println(m.val);
    }

}
class ListNode {
     int val;
      ListNode next;
      ListNode(int x) { val = x; }
 }

