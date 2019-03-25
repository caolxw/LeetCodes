/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null || l2 == null)
            return null;
        ListNode l = new ListNode(0);
        ListNode temp = l;
        int mark = 0;
        
        while(true){                       
            int value = 0;
            if(mark == 1){
                value = 1 + l1.val + l2.val;
                mark = 0;
            }else
                value = l1.val + l2.val;
            
            if(value >= 10){
                value = value - 10;
                mark = 1;
            }            
            temp.next = new ListNode(value);
            
            l1 = l1.next;
            l2 = l2.next;
            temp = temp.next;
            
            if(l1 == null && l2 == null){
                if(mark == 0)
                    break;
            }
            if(l1 == null){
                l1 = new ListNode(0);
            }
            if(l2 == null){
                l2 = new ListNode(0);
            }
        }                 
        return l.next;
    }    
}